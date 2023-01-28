import fs from 'fs/promises';
import path from 'path';
import { IndentationText, Project } from 'ts-morph';
import { Parser } from '../langkit';
import { generateParser } from './generate-parser';
import { generateVisitor } from './generate-visitor';
import { DIR, spawn, SpawnPKM, tplDir } from './utils';

export type GenerateOptions = {
  /** Package manager to use in order to invoke antlr4ts. Determined based on presence of package-lock.json or yarn.lock
   * in the current working directory. Specify 'none' to resort to antlr4ts in env.
   */
  pkm?: SpawnPKM;
}

export default async function generate(parser: Parser, { pkm }: GenerateOptions = {}) {
  if (!parser.rules.length) throw Error('Empty Parser rules');
	await runAntlr(parser, pkm);
	await generateCode(parser);
}

async function runAntlr(parser: Parser, pkm: SpawnPKM) {
	const { lexer } = parser;
	const dir = path.join(DIR, 'antlr');
	await fs.mkdir(dir, { recursive: true });
	
	// generate ANTLR grammar files
	const lexerFile  = path.join(dir, lexer.name  + '.g4');
	const parserFile = path.join(dir, parser.name + '.g4');
	
	await Promise.all([
		fs.writeFile(lexerFile, lexer.toAntlr()),
		fs.writeFile(parserFile, parser.toAntlr()),
	]);
	
	let { code } = await spawn('antlr4ts', [lexerFile], pkm);
	if (code) {
    throw Error(`antlr4ts on lexer exited with code ${code}`);
  }
  
  // we generate our own visitor. there's no point in generating an unused listener lib
  // or an interface that's applied to a completely auto-generated class
	({ code } = await spawn('antlr4ts', ['-no-visitor', '-no-listener', parserFile]), pkm);
	if (code) throw Error(`antlr4ts on parser exited with code ${code}`);
}

async function generateCode(parser: Parser) {
	const project = new Project();
  project.manipulationSettings.set({ indentationText: IndentationText.TwoSpaces });
  
  await Promise.all([
    generateUtils(project, parser),
    generateParser(project, parser),
    generateVisitor(project, parser),
  ])
  
  await project.save();
}

/** Generate utils.ts from template */
async function generateUtils(project: Project, parser: Parser) {
  const fs = project.getFileSystem();
  const srcPath = `${await tplDir()}/utils.tpl.ts`;
  const destPath = `${DIR}/utils.ts`;
  await fs.copy(srcPath, destPath);
  project.addSourceFileAtPath(destPath);
}
