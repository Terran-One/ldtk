import { IGrammarMatcher, LiteralMatcher } from './matchers';

/** Unified formal language grammar specialized for programming languages, primarily CWScript. */
export default class Grammar {
  public exts: string[];
  public significantWhitespaces = false;
  public statementSeparator: IGrammarMatcher[] = [new LiteralMatcher(';')];
  
  constructor(public name: string, exts: string | string[]) {
    this.exts = Array.isArray(exts) ? exts : [exts];
  }
  
  useSignificantWhitespaces(value: boolean) {
    this.significantWhitespaces = value;
    return this;
  }
  
  useStatementSeparator(...separators: (string | IGrammarMatcher)[]) {
    this.statementSeparator = separators.map(s => typeof s === 'string' ? new LiteralMatcher(s) : s);
    return this;
  }
}

/** Resembles a rule in a grammar. */
export class Rule {
  _scopes: string[] = [];
  
  constructor(public matcher: IGrammarMatcher) {}
  
  scopes(...scopes: string[]) {
    this._scopes.push(...scopes);
    return this;
  }
}
