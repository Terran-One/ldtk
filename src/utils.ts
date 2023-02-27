import { Token } from 'antlr4ts/Token';
import chalk from 'chalk';
import fs, { FileHandle } from 'fs/promises';

export type AntlrCtx = {
  _start: Token;
  _stop: Token | undefined;
}
type RuleAST = {
  type: string;
  children: ASTLike[] | never[];
  ctx: AntlrCtx;
}
type OptionsAST = {
  type: string;
  family: 'options';
  choice: RuleAST;
  children: [RuleAST];
  ctx: AntlrCtx;
}
type ASTLike = RuleAST | OptionsAST;

export async function dump(src: string, ast: ASTLike, file: string | FileHandle = '', level = 0) {
  if (file && typeof file === 'string')
    file = await fs.open(file, 'w');
  return await dump_inner(src, ast, level);
}

async function dump_inner(src: string, ast: ASTLike, level: number) {
  const indent = '  '.repeat(level);
  const isOptions = 'family' in ast && ast.family === 'options';
  
  let line = '';
  
  if (isOptions) {
    line += `${indent}${chalk.green(ast.choice.type)}`;
  } else {
    line += `${indent}${chalk.cyan(ast.type)}`;
  }
  
  if (ast.ctx._stop) {
    line += ': ' + chalk.yellow(getCodeRange(src, ast.ctx._start, ast.ctx._stop).replace(/\r?\n/g, '\\n'));
  }
  
  console.log(line);
    
  if (isOptions) {
    ast.choice.children.forEach(child => dump_inner(src, child, level + 1));
  } else {
    ast.children.forEach(child => dump_inner(src, child, level + 1));
  }
}

export function getCodeRange(src: string, start: Token, stop: Token) {
  const startIdx = start.startIndex;
  const stopIdx = stop.stopIndex;
  return src.substring(startIdx, stopIdx + 1);
}
