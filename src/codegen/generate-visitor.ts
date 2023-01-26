import { Parser } from 'langkit';
import { MatchAnyLabels as _MatchAnyLabels, ParserMatcher, ParserMatcherType } from '../langkit/matcher';
import { ParserRule } from '../langkit/parser';
import { ClassDeclaration, CodeBlockWriter, Project, SourceFile } from 'ts-morph';
import { DIR } from './utils';
import { CodeWriter } from './code-writer';

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
    namedImports: ['collect'],
  });
  
  // alias root rule AST node for convenience
  file.addTypeAlias({
    name: 'ASTRootNode',
    type: astNodeName(root.name),
    isExported: true,
  });
  // generate AST node types returned by visitor methods
  generateASTTypes(parser, file);
  
  // generate Visitor class
  const cls = file.addClass({
    name: 'Visitor',
    isExported: true,
  });
  
  // add general purpose visit method
  cls.addMethod({
    name: 'visit',
    parameters: [{
      name: 'tree',
      type: contextName(root.name),
    }],
    statements: `return this.${visitorName(root.name)}(tree)`,
  });
  
  const ruleVisitorWriter = new RuleVisitorWriter(parser, cls);
  const labelVisitorWriter = new LabelVisitorWriter(parser, cls);
  
  // add specialized visitors
  parser.rules.forEach(rule => {
    // visitor method for this rule
    ruleVisitorWriter.generate(rule);
    // special case: visitor method for rule with labeled options
    if (rule.match.type === '|+') {
      labelVisitorWriter.generate(rule);
    }
  });
}

function generateASTTypes(parser: Parser, file: SourceFile) {
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
  
  parser.rules.forEach(rule => {
    if (rule.match.type === '|+') {
      generateLabelNodeType(file, rule, rule.match);
    }
    else {
      generateMatcherNodeType(file, rule.name, rule.match);
    }
  })
}

function generateLabelNodeType(file: SourceFile, rule: ParserRule, matcher: MatchAnyLabels) {
  const choices = matcher.match;
  
  // generate AST node type for overarching label rule
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
    generateMatcherNodeType(file, label, match);
  });
}

function generateMatcherNodeType(file: SourceFile, name: string, matcher: ParserMatcher) {
  const {
    hasEOF,
    rules,
    tokens,
  } = analyzeRule(matcher);
  
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
          typ.write('children', 'unknown[]');
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

class RuleVisitorWriter {
  _rule: ParserRule | undefined;
  
  constructor(public parser: Parser, public cls: ClassDeclaration) {}
  
  generate(rule: ParserRule) {
    this._rule = rule;
    
    this.cls.addMethod({
      name: visitorName(rule.name),
      parameters: [{
        name: 'ctx',
        type: contextName(rule.name),
      }],
      statements: this.write,
      returnType: astNodeName(rule.name),
    });
    
    return this;
  }
  
  protected write = (writer: CodeBlockWriter) => {
    const rule = this._rule;
    if (!rule) throw Error('RuleVisitorWriter has no ParserRule bound');
    
    const { match } = rule;
    const w = new CodeWriter(writer);
    
    switch (match.type) {
      case '|+':
        this._writeVisitLabels(w, match);
        break;
      default:
        writeVisitMatcher(this.parser, w, rule.name, match);
        break;
    }
  }
  
  protected _writeVisitLabels(w: CodeWriter, matcher: MatchAnyLabels) {
    const { _rule: rule } = this;
    if (!rule) throw Error('RuleVisitorWriter unbound');
    
    const choices = matcher.match;
    w.write('const opts = [').nl().indent(() => {
      choices.forEach(({label}) => {
        const ctxName = contextName(label);
        w.writeline(`ctx instanceof ${ctxName} && this.${visitorName(label)}(ctx as ${ctxName}),`);
      });
    }).writeline('];');
    
    w.writeline('if (opts.filter(ctx => !!ctx).length > 1) throw Error("Multiple Label Contexts found");');
    w.nl();
    
    w.writeline('const choice = opts.find(ctx => !!ctx);');
    w.writeline('if (!choice) throw Error("No Label Context");');
    w.nl();
    
    w.write(`return `);
    w.obj(obj => {
      obj.write('type', w => w.quote('labels'));
      obj.write('name', w => w.quote(rule.name));
      obj.write('ctx', 'ctx');
      obj.write('choice', 'choice');
      obj.write('children', '[choice]');
    });
    w.write(';');
  }
}

class LabelVisitorWriter {
  _rule: ParserRule | undefined;
  
  constructor(public parser: Parser, public cls: ClassDeclaration) {}
  
  generate(rule: ParserRule) {
    if (rule.match.type !== '|+')
      throw Error('invalid rule matcher type');
    this._rule = rule;
    
    const choices = rule.match.match;
    choices.forEach(({ label, match }) => {
      this.cls.addMethod({
        name: visitorName(label),
        parameters: [{
          name: 'ctx',
          type: contextName(label),
        }],
        statements: this.write(label, match),
        returnType: astNodeName(label),
      });
    });
    
    return this;
  }
  
  protected write = (label: string, matcher: ParserMatcher) => (writer: CodeBlockWriter) => {
    const rule = this._rule;
    if (!rule) throw Error('LabelVisitorWriter unbound');
    writeVisitMatcher(this.parser, new CodeWriter(writer), label, matcher);
  }
}

function writeVisitMatcher(parser: Parser, writer: CodeWriter, name: string, matcher: ParserMatcher) {
  const {
    hasEOF,
    rules,
    tokens,
  } = analyzeRule(matcher);
  const w = writer;
  
  w.write('const rules = ').obj(obj => {
    rules.forEach(rule => {
      obj.write(rule, `collect(ctx.getRuleContexts(${contextName(rule)})).map(item => this.${visitorName(rule)}(item))`);
    })
  }).writeline(';');
  
  w.write('return ');
  w.obj(obj => {
    obj.write('type', w => w.quote('rule'));
    obj.write('name', w => w.quote(name));
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
}

const contextName = (ruleName: string) => `${capitalize(ruleName)}Context`;
const visitorName = (ruleName: string) => `visit${capitalize(ruleName)}`;
const astNodeName = (ruleName: string) => `${capitalize(ruleName)}ASTNode`;
const capitalize = (s: string) => s[0].toUpperCase() + s.substring(1);

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
