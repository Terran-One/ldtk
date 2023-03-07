import path from 'path';
import { Project, Scope } from 'ts-morph';
import { Parser } from '../langkit';
import { CodeWriter } from './code-writer';
import { DIR } from './utils';

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
      namedImports: [ParserIdent],
    },
    {
      moduleSpecifier: './Visitor',
      namedImports: ['ASTMap', 'visit'],
    },
  ]);
  
  const cls = file.addClass({
    name: 'Parser',
    isExported: true,
  });
  
  cls.addConstructor({
    parameters: [
      {
        name: 'lexer',
        scope: Scope.Public,
        isReadonly: true,
        type: LexerIdent,
      },
      {
        name: 'parser',
        scope: Scope.Public,
        isReadonly: true,
        type: ParserIdent,
      },
    ],
  });
  
  // process()
  cls.addMethod({
    name: 'process',
    returnType: `ASTMap['program']`,
    statements: writer => {
      const w = new CodeWriter(writer);
      w.write(`return visit.${rootRule.name}(this.parser.${rootRule.name}());`);
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
      w.writeline(`return new Parser(lexer, parser);`);
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
