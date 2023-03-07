import { Token } from 'antlr4ts/Token';
import { TerminalNode } from 'antlr4ts/tree/TerminalNode';
import chalk from 'chalk';
import { ASTNodeBase, Location } from './types';

export async function dump(src: string, ast: ASTNodeBase) {
  return await dump_inner(src, ast, 0);
}

async function dump_inner(src: string, ast: ASTNodeBase, level: number) {
  const indent = '  '.repeat(level);
  const isOptions = 'family' in ast && ast.family === 'options';
  
  let line = '';
  
  if (isOptions) {
    line += `${indent}${chalk.green(ast.option.type)}`;
  } else {
    line += `${indent}${chalk.cyan(ast.type)}`;
  }
  
  if (ast.location)
    line += ': ' + chalk.yellow(getCodeRange(src, ast.location).replace(/\r?\n/g, '\\n'));
  
  console.log(line);
    
  if (isOptions) {
    ast.option.children.forEach(child => dump_inner(src, child, level + 1));
  } else {
    ast.children.forEach(child => dump_inner(src, child, level + 1));
  }
}

/** Get a substring of `src` corresponding to the given `location`. */
export const getCodeRange = (src: string, location: Location) =>
  src.substring(location.startIndex, location.stopIndex+1);

export function stripQuotes(token: Token) {
  const text = token.text!;
  return text.match(/^"(.*)"$/)?.[1] ?? text.match(/^'(.*)'$/)?.[1] ?? text;
}

/** Sort `tokens` by their starting indices. */
export const sortTokens = (tokens: TerminalNode[]) => tokens.sort((a, b) => a.symbol.startIndex - b.symbol.startIndex);
/** Sorts given `nodes` by the starting index of their locations. Any node without location is sorted
 * to the end of the array in the order it was given.
 */
export function sortNodes(nodes: ASTNodeBase[]) {
  const [withLocation, withoutLocation] = partition(nodes, node => Boolean(node.location));
  withLocation.sort((a, b) => a.location!.startIndex - b.location!.startIndex);
  return [...withLocation, ...withoutLocation];
}

/** Collect subsequent tokens of the same type in a new array. These arrays are returned as an array
 * of arrays.
 * 
 * The tokens must also be continuous. Any gap between two tokens of the same type creates a new
 * array.
 * 
 * **Caveat:** If the result is unexpectedly discontinuous, it's possible an invisible token may
 * have interrupted the sequence.
 */
export function collectTokens(tokens: TerminalNode[]): TerminalNode[][] {
  if (!tokens.length) return [];
  
  let type = tokens[0].symbol.type;
  let curr = [tokens[0]];
  let lastIdx = tokens[0].symbol.stopIndex;
  const result = [curr];
  
  for (const token of tokens.slice(1)) {
    if (token.symbol.type === type && token.symbol.startIndex === lastIdx + 1) {
      curr.push(token);
    } else {
      result.push(curr = [token]);
    }
    
    type = token.symbol.type;
    lastIdx = token.symbol.stopIndex;
  }
  
  return result;
}

/** Join the given collection of tokens of the same type together into one unified node spanning all.
 * Assumes the given tokens are sorted & continuous.
 * 
 * Throws if the given tokens are not of the same type, or if the array is empty.
 */
export function joinTokens(tokens: TerminalNode[]): TerminalNode {
  if (!tokens.length) throw Error('No tokens supplied');
  
  const type = tokens[0].symbol.type;
  if (tokens.some(token => token.symbol.type !== type)) throw Error('Tokens are not of the same type');
  
  const first = tokens[0].symbol;
  const last = tokens[tokens.length - 1].symbol;
  
  const token: Token = {
    ...first,
    stopIndex: last.stopIndex,
    text: tokens.map(token => token.symbol.text).join(''),
  };
  return new TerminalNode(token);
}

export function groupBy<T, K extends string = string>(ary: Iterable<T>, pred: (item: T) => PropertyKey): Record<K, T[]> {
  const result: Record<K, T[]> = {} as any;
  for (const item of ary) {
    const key = pred(item) as K;
    if (!(key in result))
      result[key] = [];
    result[key].push(item);
  }
  return result;
}

/** Partition the given array-like into two arrays: one whose elements match `pred`, and the other whose elements don't. */
export function partition<T>(ary: Iterable<T>, pred: (item: T) => boolean): [T[], T[]] {
  const result: [T[], T[]] = [[], []];
  for (const item of ary) {
    result[+!pred(item)].push(item);
  }
  return result;
}
