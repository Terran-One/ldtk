import fs from 'fs/promises';
import path from 'path';
import { IndentationText, Project, SourceFile, SyntaxKind } from 'ts-morph';
import { Parser } from '../langkit';
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

/** Generate the concrete Parser with Middleware support from the given Parser definition. */
async function generateParser(project: Project, parser: Parser) {
  const { lexer } = parser;
  const fs = project.getFileSystem();
  const ParserIdent = parser.name;
  const LexerIdent = lexer.name;
  
  const rootRule = parser.rules[0];
  
  fs.copySync(path.join(await tplDir(), 'parser.tpl.ts'), path.join(DIR, 'Parser.ts'));
  project.addSourceFileAtPath(path.join(DIR, 'Parser.ts'));
  
  const file = project.getSourceFile(path.join(DIR, 'Parser.ts'));
  if (!file) throw Error('Failed to copy Parser template source file');
  file.addImportDeclarations([
    {
      moduleSpecifier: `./antlr/${LexerIdent}`,
      namedImports: [{ name: LexerIdent }],
    },
    {
      moduleSpecifier: `./antlr/${ParserIdent}`,
      namedImports: [{ name: ParserIdent }],
    },
  ]);
  
  replaceClass(file, 'AntlrLexer', LexerIdent);
  replaceClass(file, 'AntlrParser', ParserIdent);
  
  const cls = file.getClassOrThrow('Parser');
  const method = cls.getMethodOrThrow('buildAST');
  const stmt = method.getStatements()[0].asKindOrThrow(SyntaxKind.VariableStatement);
  const decl = stmt.getDeclarations()[0];
  decl.set({ initializer: `this._parser['${rootRule.name}']()` });
}

function replaceClass(file: SourceFile, original: string, replacement: string) {
  replaceType(file, original, replacement);
  replaceIdentifier(file, original, replacement);
}

function replaceIdentifier(file: SourceFile, original: string, replacement: string) {
  file.getDescendantsOfKind(SyntaxKind.Identifier)
    .forEach(ident => {
      if (ident.getText() !== original)
        return;
      ident.replaceWithText(replacement);
    })
}

function replaceType(file: SourceFile, original: string, replacement: string) {
  file.getDescendants()
    .forEach(node => {
      if (!hasSetType(node) || node.getType().getText() !== original)
        return;
      node.setType(replacement);
    });
}

type HasSetType = { setType(newType: string): void };
const hasSetType = (v: any): v is HasSetType => 'setType' in v;
