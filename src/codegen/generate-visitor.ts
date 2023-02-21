import { MatchAnyLabels as _MatchAnyLabels, ParserMatcher, ParserMatcherType } from '../langkit/matcher';
import Parser, { ParserRule } from '../langkit/parser';
import { Project, SourceFile, VariableDeclarationKind } from 'ts-morph';
import { astNodeName, contextName, DIR } from './utils';
import { CodeWriter, ObjectWriter } from './code-writer';

type MatchAnyLabels = _MatchAnyLabels<ParserMatcherType>;

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
  
  // import context types
  file.addImportDeclaration({
    moduleSpecifier: `./antlr/${parser.name}`,
    namedImports: [parser.name, ...contexts],
  });
  file.addImportDeclaration({
    moduleSpecifier: './utils',
    namedImports: ['LabelASTNode', 'RuleASTNode', 'VisitorMap', 'WithEOF'],
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
              writeVisitLabel({ parser, obj, rulename: rule.name, matcher: rule.match });
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
        hasEOF,
        rules,
        tokens,
      } = analyzeRule(matcher);
      
      // collect sub-rules/children
      w.write('const rules = ').obj(obj => {
        rules.forEach(rule => {
          obj.write(rule, `ctx.getRuleContexts(${contextName(rule)}).map(item => visit.${rule}(item))`);
        })
      }).writeline(';');
      
      // return specialized ASTNode structure
      w.write('return ');
      w.obj(obj => {
        obj.write('type', `'${rulename}'`);
        obj.write('family', "'rule'");
        obj.write('ctx', 'ctx');
        
        hasEOF && obj.write('EOF', `ctx.getTokens(${parser.name}.EOF)[0]`);
        
        // two reasons for using various `any`:
        // 1) if children is empty, reduce returns unknown, which cannot be assigned to unknown[]
        // 2) Object.values(rules) is too strict & needs to be loosened
        obj.write('children', 'Object.values(rules).reduce((prev, curr) => [...prev as any, ...curr as any], []) as any');
        
        if (rules.length) {
          obj.write('rules', 'rules');
        }
        
        if (tokens.length) {
          obj.write('tokens', w => w.obj(obj => {
            tokens.forEach(token => {
              obj.write(token, `ctx.getTokens(${parser.name}.${token})`);
            })
          }));
        }
      });
    });
  });
}

interface WriteVisitLabelParams {
  parser: Parser;
  obj: ObjectWriter;
  rulename: string;
  matcher: MatchAnyLabels;
}

function writeVisitLabel({ parser, obj, rulename, matcher }: WriteVisitLabelParams) {
  const w = obj.writer;
  const choices = matcher.match;
  
  // build visitor for this specific rule
  obj.write(rulename, () => {
    w.write(`(ctx: ${contextName(rulename)}): ${astNodeName(rulename)} => `).block(() => {
      // collect child context choices
      w.write('const opts = [').nl().indent(() => {
        choices.forEach(({label}) => {
          const ctxName = contextName(label);
          w.write(`ctx instanceof ${ctxName} && visit.${label}(ctx as ${ctxName}),`);
        });
      }).writeline('];');
      
      // assert exactly one is valid
      w.writeline('if (opts.filter(ctx => !!ctx).length > 1) throw Error("Multiple Label Contexts found");');
      w.nl();
      
      w.writeline('const choice = opts.find(ctx => !!ctx);');
      w.writeline('if (!choice) throw Error("No Label Context");');
      w.nl();
      
      // build result structure
      w.write(`return `);
      w.obj(obj => {
        obj.write('type', `'${rulename}'`);
        obj.write('family', "'labels'");
        obj.write('ctx', 'ctx');
        obj.write('choice', 'choice');
        obj.write('children', '[choice]');
      });
      w.write(';');
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
      generateLabelNodeType(file, rule, rule.match, typemap);
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

function generateLabelNodeType(file: SourceFile, rule: ParserRule, matcher: MatchAnyLabels, typemap: Record<string, string>) {
  const choices = matcher.match;
  
  // generate AST node type for overarching label rule
  typemap[rule.name] = astNodeName(rule.name);
  file.addTypeAlias({
    name: astNodeName(rule.name),
    type: writer => {
      const w = new CodeWriter(writer);
      w.write('LabelASTNode<ASTMap, ');
      w.write(`'${rule.name}', `);
      w.write(contextName(rule.name)).write(', ');
      w.write('[')
       .join(', ', choices.map(c => `'${c.label}'`))
       .write(']');
      w.write('>');
    },
    isExported: true,
  });
  
  // generate a AST node type for every possible label
  choices.forEach(({ label, match }) => {
    generateMatcherNodeType(file, label, match, typemap);
  });
}

function generateMatcherNodeType(file: SourceFile, name: string, matcher: ParserMatcher, typemap: Record<string, string>) {
  const {
    hasEOF,
    rules,
    tokens,
  } = analyzeRule(matcher);
  
  typemap[name] = astNodeName(name);
  file.addTypeAlias({
    name: astNodeName(name),
    type: writer => {
      const w = new CodeWriter(writer);
      w.write('RuleASTNode<ASTMap, ');
      w.write(`'${name}', `);
      w.write(contextName(name)).write(', ');
      w.write('[')
       .join(', ', rules.map(r => `'${r}'`))
       .write(']')
       .write(', ');
      w.write('[')
       .join(', ', tokens.map(t => `'${t}'`))
       .write(']');
      w.write('>');
      
      if (hasEOF) w.write(' & WithEOF');
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
