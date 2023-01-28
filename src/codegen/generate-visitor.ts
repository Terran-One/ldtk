import { Parser } from 'langkit';
import { MatchAnyLabels as _MatchAnyLabels, ParserMatcher, ParserMatcherType } from '../langkit/matcher';
import { ParserRule } from '../langkit/parser';
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
  
  // import antlr4ts types
  file.addImportDeclaration({
    moduleSpecifier: 'antlr4ts/tree/TerminalNode',
    namedImports: ['TerminalNode'],
  });
  // import context types
  file.addImportDeclaration({
    moduleSpecifier: `./antlr/${parser.name}`,
    namedImports: [parser.name, ...contexts],
  });
  // import (generated) utilities
  file.addImportDeclaration({
    moduleSpecifier: './utils',
    namedImports: ['capitalize', 'collect'],
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
        w.write(';');
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
          obj.write(rule, `collect(ctx.getRuleContexts(${contextName(rule)})).map(item => visit.${rule}(item))`);
        })
      }).writeline(';');
      
      // return specialized ASTNode structure
      w.write('return ');
      w.obj(obj => {
        obj.write('type', w => w.quote('rule'));
        obj.write('name', w => w.quote(rulename));
        obj.write('ctx', 'ctx');
        
        hasEOF && obj.write('EOF', `collect(ctx.getTokens(${parser.name}.EOF))`);
        
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
              obj.write(token, `collect(ctx.getTokens(${parser.name}.${token}))`);
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
        obj.write('type', w => w.quote('labels'));
        obj.write('name', w => w.quote(rulename));
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
  const typenames = new Set<string>();
  
  // base types for rules & labels
  file.addTypeAlias({
    name: 'RuleASTNodeBase',
    type: w => new CodeWriter(w).obj(typ => {
      typ.lineSep = ';';
      typ.write('type', '"rule"');
    }),
    isExported: true,
  });
  
  file.addTypeAlias({
    name: 'LabelASTNodeBase',
    type: w => new CodeWriter(w).obj(typ => {
      typ.lineSep = ';';
      typ.write('type', '"labels"');
    }),
    isExported: true,
  });
  
  // a type for every rule & labeled choice
  parser.rules.forEach(rule => {
    if (rule.match.type === '|+') {
      generateLabelNodeType(file, rule, rule.match, typenames);
    }
    else {
      generateMatcherNodeType(file, rule.name, rule.match, typenames);
    }
  })
  
  // general purpose ASTNode type which is an or-conjunction of all generated AST types
  file.addTypeAlias({
    name: 'ASTNode',
    type: [...typenames].join(' | '),
    isExported: true,
  })
}

function generateLabelNodeType(file: SourceFile, rule: ParserRule, matcher: MatchAnyLabels, typenames: Set<string>) {
  const choices = matcher.match;
  
  // generate AST node type for overarching label rule
  typenames.add(astNodeName(rule.name));
  file.addTypeAlias({
    name: astNodeName(rule.name),
    type: writer => {
      const w = new CodeWriter(writer);
      w.write('LabelASTNodeBase & ');
      w.obj(typ => {
        typ.lineSep = ';';
        
        typ.write('name', w => w.quote(rule.name));
        typ.write('ctx', contextName(rule.name));
        
        typ.write('choice', w => {
          choices.forEach(({ label }, i) => {
            if (i > 0)
              w.write(' | ');
            w.write(astNodeName(label));
          });
        });
        
        // normalized prop required for TransformationStack
        typ.write('children', w => {
          w.write('[');
          choices.forEach(({ label }, i) => {
            if (i > 0)
              w.write(' | ');
            w.write(astNodeName(label));
          });
          w.write(']');
        });
      });
    },
    isExported: true,
  });
  
  // generate a AST node type for every possible label
  choices.forEach(({ label, match }) => {
    generateMatcherNodeType(file, label, match, typenames);
  });
}

function generateMatcherNodeType(file: SourceFile, name: string, matcher: ParserMatcher, typenames: Set<string>) {
  const {
    hasEOF,
    rules,
    tokens,
  } = analyzeRule(matcher);
  
  typenames.add(astNodeName(name));
  file.addTypeAlias({
    name: astNodeName(name),
    type: writer => {
      const w = new CodeWriter(writer);
      w.write('RuleASTNodeBase & ');
      w.obj(typ => {
        typ.lineSep = ';';
        
        typ.write('name', w => w.quote(name));
        typ.write('ctx', contextName(name));
        
        hasEOF && typ.write('EOF', 'TerminalNode[]');
        
        if (rules.length) {
          typ.write('rules', () => {
            w.obj(typ => {
              typ.lineSep = ';';
              rules.forEach(rule => {
                typ.write(rule, `${astNodeName(rule)}[]`);
              });
            });
          })
          typ.write('children', () => {
            w.write('(')
            w.join(' | ', rules.map(rule => `${astNodeName(rule)}`));
            w.write(')[]');
          });
        }
        else {
          typ.write('children', 'never[]');
        }
        
        if (tokens.length) {
          typ.write('tokens', w => {
            w.obj(typ => {
              tokens.forEach(token => {
                typ.write(token, `TerminalNode[]`);
              });
            })
          });
        }
      });
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
