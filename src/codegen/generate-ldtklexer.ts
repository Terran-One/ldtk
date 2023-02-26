import { Project } from 'ts-morph';
import { Parser } from '../langkit';
import { CodeWriter } from './code-writer';
import { DIR, tplDir } from './utils';

export async function generateLDTKLexer(project: Project, parser: Parser) {
  const { lexer } = parser;
  const fs = project.getFileSystem();
  const srcPath = `${await tplDir()}/LDTKLexer.tpl.ts`;
  const destPath = `${DIR}/LDTKLexer.ts`;
  await fs.copy(srcPath, destPath);
  
  const file = project.addSourceFileAtPath(destPath);
  const cls = file.getClassOrThrow('LDTKLexer');
  
  cls.getMethodOrThrow('ldtk_init').setBodyText(writer => {
    const w = new CodeWriter(writer);
    for (const init of lexer.init) {
      w.writeline(`(${init})(this['@ldtk_state@']);`);
    }
  });
}
