import { Parser } from 'langkit';
import { MatchAnyLabels as _MatchAnyLabels, ParserMatcher, ParserMatcherType } from '../langkit/matcher';
import { ParserRule } from '../langkit/parser';
import { ClassDeclaration, CodeBlockWriter, Project, SourceFile } from 'ts-morph';
import { DIR } from './utils';
import { writeObject } from './code-writer';

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
    type: w => writeObject(w, typ => {
      typ.write('type', '"rule"');
    }, { lineSeparator: ';' }),
    isExported: true,
  });
  
  file.addTypeAlias({
    name: 'LabelASTNodeBase',
    type: w => writeObject(w, typ => {
      typ.write('type', '"labels"');
    }, { lineSeparator: ';' }),
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
    type: w => {
      w.write('LabelASTNodeBase & ');
      writeObject(w, typ => {
        typ.write('name', w => w.quote(rule.name));
        
        typ.write('choice', w => {
          choices.forEach(({ label }, i) => {
            if (i > 0)
              w.write(' | ');
            w.write(astNodeName(label));
          });
        });
      }, { lineSeparator: ';' });
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
    type: w => {
      w.write('RuleASTNodeBase & ');
      writeObject(w, typ => {
        typ.write('name', w => w.quote(name));
        
        hasEOF && typ.write('EOF', 'TerminalNode[]');
        
        if (rules.length) {
          typ.write('rules', w => {
            writeObject(w, typ => {
              rules.forEach(rule => {
                typ.write(rule, `${astNodeName(rule)}[]`);
              });
            }, { lineSeparator: ';' });
          })
        }
        
        if (tokens.length) {
          typ.write('tokens', w => {
            writeObject(w, typ => {
              tokens.forEach(token => {
                typ.write(token, `TerminalNode[]`);
              });
            })
          });
        }
      }, { lineSeparator: ';' });
    },
    isExported: true,
  });
}

class RuleVisitorWriter {
  _rule: ParserRule | undefined;
  _writer: CodeBlockWriter | undefined;
  
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
    this._writer = writer;
    
    switch (match.type) {
      case '|+':
        this._writeVisitLabels(match);
        break;
      default:
        writeVisitMatcher(this.parser, writer, rule.name, match);
        break;
    }
  }
  
  protected _writeVisitLabels(matcher: MatchAnyLabels) {
    const { _writer: writer, _rule: rule } = this;
    if (!writer || !rule) throw Error('RuleVisitorWriter unbound');
    
    const choices = matcher.match;
    writer.write('const opts = [').newLine().indent(() => {
      choices.forEach(({label}) => {
        const ctxName = contextName(label);
        writer.writeLine(`ctx instanceof ${ctxName} && this.${visitorName(label)}(ctx as ${ctxName}),`);
      });
    }).write('];').newLine();
    
    writer.writeLine('if (opts.filter(ctx => !!ctx).length > 1) throw Error("Multiple Label Contexts found");');
    writer.newLine();
    
    writer.writeLine('const choice = opts.find(ctx => !!ctx);');
    writer.writeLine('if (!choice) throw Error("No Label Context");');
    writer.newLine();
    
    writer.write(`return `);
    writeObject(writer, obj => {
      obj.write('type', w => w.quote('labels'));
      obj.write('name', w => w.quote(rule.name));
      obj.write('choice', 'choice');
    });
    writer.write(';');
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
    writeVisitMatcher(this.parser, writer, label, matcher);
  }
}

function writeVisitMatcher(parser: Parser, writer: CodeBlockWriter, name: string, matcher: ParserMatcher) {
  const {
    hasEOF,
    rules,
    tokens,
  } = analyzeRule(matcher);
  
  writer.write('return ');
  writeObject(writer, obj => {
    obj.write('type', w => w.quote('rule'));
    obj.write('name', w => w.quote(name));
    
    hasEOF && obj.write('EOF', `collect(ctx.getTokens(${parser.name}.EOF))`);
    
    if (rules.length) {
      obj.write('rules', w => writeObject(w, obj => {
        rules.forEach(rule => {
          obj.write(rule, `collect(ctx.getRuleContexts(${contextName(rule)})).map(item => this.${visitorName(rule)}(item))`);
        });
      }));
    }
    
    if (tokens.length) {
      obj.write('tokens', w => writeObject(w, obj => {
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
