import { Project } from 'ts-morph';
import { Parser } from '../langkit';
import { DIR } from './utils';

export async function generateLexer(project: Project, parser: Parser) {
  const { lexer } = parser;
  let file = project.addSourceFileAtPath(`${DIR}/antlr/${lexer.name}.ts`);
  
  // import LDTKLexer from '../LDTKLexer';
  file.addImportDeclaration({
    moduleSpecifier: '../LDTKLexer',
    namedImports: ['LDTKLexer'],
  });
  
  // rewrite extends
  let cls = file.getClassOrThrow(lexer.name);
  cls.setExtends('LDTKLexer');
}
