import { Rule } from './grammar';
import { ChoiceMatcher, IGrammarMatcher, LiteralMatcher } from './matchers';
import r from './match-parser';

export const literal = (literal: string) => new LiteralMatcher(literal);
export const or = (...matchers: IGrammarMatcher[]) => new ChoiceMatcher(matchers);

/** Like `strictList`, except allows an optional trailing `sep`. */
export const list = (item: IGrammarMatcher, sep: (IGrammarMatcher | string)[]) =>
  or(...sep.map(s => {
    if (typeof s === 'string') s = literal(s);
    return r`((${item}${s})* ${item}${s}?)`
  }));

/** Match multiple instances of `item`, each separated by identical `sep`. No trailing `sep`.
 * Cannot mix different `sep`s, e.g. `a, b, c; d, e, f` is not allowed if `sep = [',', ';']`.
 */
export const strictList = (item: IGrammarMatcher, sep: (IGrammarMatcher | string)[]) =>
  or(...sep.map(s => {
    if (typeof s === 'string') s = literal(s);
    return r`(${item}${s})* ${item})`
  }));

export const rule = (strings: TemplateStringsArray, ...args: any[]) => new Rule(r(strings, ...args));
