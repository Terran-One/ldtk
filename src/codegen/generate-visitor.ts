import { MatchOptions as _MatchOptions, ParserMatcher, ParserMatcherType, ParserMatchExtra } from '../langkit/matcher';
import Parser, { ParserRule } from '../langkit/parser';
import { Project, SourceFile, VariableDeclarationKind } from 'ts-morph';
import { astNodeName, contextName, DIR } from './utils';
import { CodeWriter, ObjectWriter } from './code-writer';

type MatchOptions = _MatchOptions<ParserMatchExtra, ParserMatcherType>;

/** Generate an Antlr-specific visitor from the given Parser definition. */
export async function generateVisitor(project: Project, parser: Parser) {
  const filepath = `${DIR}/Visitor.ts`;
  const existingFile = project.getSourceFile(filepath);
  if (existingFile) project.removeSourceFile(existingFile);
  
  const file = project.createSourceFile(filepath, undefined, { overwrite: true });
  const root = parser.rules[0];
  
  // collect context names for imminent import
  const contexts: string[] = [];
  parser.rules.forEach(rule => {
    // context of this rule
    contexts.push(contextName(rule.name));
    // special case: rule consists of labeled options
    if (rule.match.type === '|+') {
      rule.match.match.forEach(({ label }) => {
        contexts.push(contextName(label));
      })
    }
  });
  
  // import LDTK AST node types
  file.addImportDeclaration({
    moduleSpecifier: '@terran-one/ldtk',
    namedImports: ['RuleASTNode', 'OptionsASTNode'],
  });
  
  // import context types
  file.addImportDeclaration({
    moduleSpecifier: `./antlr/${parser.name}`,
    namedImports: [parser.name, ...contexts],
  });
  
  // alias root rule AST node for convenience
  file.addTypeAlias({
    name: 'ASTRootNode',
    type: astNodeName(root.name),
    isExported: true,
  });
  // generate AST node types returned by visitor methods
  generateASTTypes(parser, file);
  
  // create & expose visitor object
  file.addVariableStatement({
    isExported: true,
    declarationKind: VariableDeclarationKind.Const,
    declarations: [{
      name: 'visit',
      initializer: writer => {
        const w = new CodeWriter(writer);
        w.obj(obj => {
          parser.rules.forEach(rule => {
            if (rule.match.type === '|+') {
              writeVisitOption({ parser, obj, rulename: rule.name, matcher: rule.match });
            } else {
              writeVisitRule({ parser, obj, rulename: rule.name, matcher: rule.match });
            }
          })
        });
      },
    }],
  });
}

interface WriteVisitRuleParams {
  parser: Parser;
  obj: ObjectWriter;
  rulename: string;
  matcher: ParserMatcher;
}

function writeVisitRule({ parser, obj, rulename, matcher }: WriteVisitRuleParams) {
  obj.write(rulename, w => {
    w.write(`(ctx: ${contextName(rulename)}): ${astNodeName(rulename)} => `).block(() => {
      const {
        rules,
        tokens,
      } = analyzeRule(matcher);
      
      // collect sub-rules & tokens
      w.write('const rules = ').obj(obj => {
        rules.forEach(rule => {
          obj.write(rule, `ctx.getRuleContexts(${contextName(rule)}).map(item => visit.${rule}(item))`);
        })
      }).write(';').nl(2);
      
      w.write('const tokens = ').obj(obj => {
        tokens.forEach(token => {
          obj.write(token, `ctx.getTokens(${parser.name}.${token})`);
        })
      }).write(';').nl(2);
      
      // return RuleASTNode subclass
      w.write(`return new ${astNodeName(rulename)}('${rulename}', ctx, rules, tokens);`);
    });
  });
}

interface WriteVisitOptionsParams {
  parser: Parser;
  obj: ObjectWriter;
  rulename: string;
  matcher: MatchOptions;
}

function writeVisitOption({ parser, obj, rulename, matcher }: WriteVisitOptionsParams) {
  const w = obj.writer;
  const choices = matcher.match;
  
  // build visitor for this specific rule
  obj.write(rulename, () => {
    w.write(`(ctx: ${contextName(rulename)}): ${astNodeName(rulename)} => `).block(() => {
      // collect child context choices
      w.write('const opts = [').nl().indent(() => {
        w.join(
          ', ',
          choices.map(({label}) =>
            `ctx instanceof ${contextName(label)} && visit.${label}(ctx)`
          ),
          true,
        );
      }).writeline('].filter(ctx => Boolean(ctx)) as any[];');
      
      // assert exactly one is valid
      w.writeline(`if (opts.length > 1) throw Error("Multiple valid Options found for rule ${rulename}");`);
      w.nl();
      
      w.writeline('const [option] = opts;');
      w.writeline(`if (!option) console.error("No valid Option found for rule ${rulename}");`);
      w.nl();
      
      // build result structure
      w.write(`return new ${astNodeName(rulename)}('${rulename}', ctx, option);`);
    });
  });
  
  // build visitor for each of this rule's labeled choices
  choices.forEach(({ label, match }) => {
    writeVisitRule({ parser, obj, rulename: label, matcher: match });
  });
}

function generateASTTypes(parser: Parser, file: SourceFile) {
  const typemap: Record<string, string> = {};
  
  // a type for every rule & labeled choice
  parser.rules.forEach(rule => {
    if (rule.match.type === '|+') {
      generateOptionNodeType(file, rule, rule.match, typemap);
    }
    else {
      generateMatcherNodeType(file, rule.name, rule.match, typemap);
    }
  })
  
  // ASTNode map
  file.addTypeAlias({
    name: 'ASTMap',
    type: writer => new CodeWriter(writer).obj(obj => {
      for (const name in typemap) {
        obj.write(name, typemap[name]);
      }
    }),
    isExported: true,
  })
  
  // general purpose ASTNode type which is an or-conjunction of all generated AST types
  file.addTypeAlias({
    name: 'ASTNode',
    type: 'ASTMap[keyof ASTMap]',
    isExported: true,
  })
}

function generateOptionNodeType(file: SourceFile, rule: ParserRule, matcher: MatchOptions, typemap: Record<string, string>) {
  const choices = matcher.match;
  
  // generate AST node type for overarching label rule
  typemap[rule.name] = astNodeName(rule.name);
  file.addClass({
    name: astNodeName(rule.name),
    extends: `OptionsASTNode<'${rule.name}'>`,
    isExported: true,
  });
  
  // generate a AST node type for every possible label
  choices.forEach(({ label, match }) => {
    generateMatcherNodeType(file, label, match, typemap);
  });
}

function generateMatcherNodeType(file: SourceFile, name: string, matcher: ParserMatcher, typemap: Record<string, string>) {
  const {
    rules,
    tokens,
  } = analyzeRule(matcher);
  
  typemap[name] = astNodeName(name);
  file.addClass({
    name: astNodeName(name),
    extends: writer => {
      const w = new CodeWriter(writer);
      w.write(`RuleASTNode<'${name}', `);
      
      if (rules.length)
        w.join(' | ', rules.map(r => `'${r}'`)).write(', ');
      else
        w.write('string, ');
      
      if (tokens.length)
        w.join(' | ', tokens.map(t => `'${t}'`));
      else
        w.write('string');
      
      w.write('>');
    },
    isExported: true,
  });
}

function analyzeRule(root: ParserMatcher) {
  const leafs = [...getRuleLeafs(root)];
  const hasEOF = leafs.includes('EOF');
  const rules = leafs.filter(r => r.match(/^[a-z]/));
  const tokens = leafs.filter(r => r.match(/^[A-Z]/) && r !== 'EOF');
  
  return {
    leafs,
    hasEOF,
    rules,
    tokens,
  };
}

function getRuleLeafs(root: ParserMatcher, target = new Set<string>()) {
  switch (root.type) {
    case 'token':
      target.add(root.name);
      return target;
    case 'EOF':
      target.add('EOF');
      return target;
  }
  
  if ('match' in root) {
    if ('type' in root.match) {
      getRuleLeafs(root.match, target);
    }
    else if (Symbol.iterator in root.match) {
      for (const match of root.match) {
        getRuleLeafs(match, target);
      }
    }
    else {
      console.debug('Unsupported match type', root.match);
    }
  }
  else {
    console.debug('Unsupported node type', root);
  }
  return target;
}
