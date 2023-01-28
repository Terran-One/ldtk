import path from 'path';
import { Project, Scope } from 'ts-morph';
import { Parser } from '../langkit';
import { CodeWriter } from './code-writer';
import { contextName, DIR } from './utils';

export function generateParser(project: Project, parser: Parser,) {
  const { lexer } = parser;
  const ParserIdent = parser.name;
  const LexerIdent = lexer.name;
  
  const rootRule = parser.rules[0];
  const file = project.createSourceFile(path.join(DIR, 'Parser.ts'), undefined, { overwrite: true });
  
  file.addImportDeclarations([
    {
      moduleSpecifier: 'antlr4ts',
      namedImports: ['CharStreams', 'CommonTokenStream'],
    },
    {
      moduleSpecifier: `./antlr/${LexerIdent}`,
      namedImports: [LexerIdent],
    },
    {
      moduleSpecifier: `./antlr/${ParserIdent}`,
      namedImports: [ParserIdent, contextName(rootRule.name)],
    },
    {
      moduleSpecifier: './Visitor',
      namedImports: ['visit'],
    },
  ]);
  
  // type Visitor
  file.addTypeAlias({
    name: 'Visitor',
    type: writer => {
      const w = new CodeWriter(writer);
      w.block(() => {
        w.writeline('// entry point');
        w.write(`${rootRule.name}: (ctx: ${contextName(rootRule.name)}) => any;`);
      });
    },
  });
  
  const cls = file.addClass({
    name: 'Parser',
    isExported: true,
    typeParameters: [
      {
        name: 'V',
        constraint: 'Visitor',
        default: 'typeof visit',
      }
    ]
  });
  
  cls.addConstructor({
    parameters: [
      {
        name: '_lexer',
        scope: Scope.Public,
        type: LexerIdent,
      },
      {
        name: '_parser',
        scope: Scope.Public,
        type: ParserIdent,
      },
      {
        name: '_visit',
        scope: Scope.Public,
        type: 'V',
      },
    ],
  });
  
  // process()
  cls.addMethod({
    name: 'process',
    returnType: 'ReturnType<V["program"]>',
    statements: writer => {
      const w = new CodeWriter(writer);
      w.write(`return this._visit.${rootRule.name}(this._parser.${rootRule.name}());`);
    },
  });
  
  // static fromString(source: string): Parser
  cls.addMethod({
    name: 'fromString',
    isStatic: true,
    parameters: [
      {
        name: 'source',
        type: 'string',
      },
    ],
    statements: writer => {
      const w = new CodeWriter(writer);
      w.writeline(`const lexer = new ${LexerIdent}(CharStreams.fromString(source));`);
      w.writeline(`const parser = new ${ParserIdent}(new CommonTokenStream(lexer));`);
      w.writeline(`return new Parser(lexer, parser, visit);`);
    },
  });
  
  // static parse(source: string)
  cls.addMethod({
    name: 'parse',
    isStatic: true,
    parameters: [{
      name: 'source',
      type: 'string',
    }],
    statements: writer => {
      const w = new CodeWriter(writer);
      w.writeline(`return Parser.fromString(source).process()`);
    },
  });
}
