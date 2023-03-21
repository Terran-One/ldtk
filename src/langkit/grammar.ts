import { IGrammarMatcher, LiteralMatcher } from './matchers';

export type Scopes = {
  [key: string]: (...rules: string[]) => Grammar;
}

/** Unified formal language grammar specialized for programming languages, primarily CWScript. */
export default class Grammar {
  public exts: string[];
  public significantWhitespaces = false;
  public statementSeparator: IGrammarMatcher[] = [new LiteralMatcher(';')];
  public scopes: Record<string, string[]> = {};
  public _rules: Record<string, Rule> = {};
  
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
  
  /** Define new rules of this grammar.
   * 
   * Use `$.rule` to explicitly create a new rule which can be augmented with additional information.
   * Otherwise, the given `IGrammarMatcher` is automatically wrapped in a generic `Rule`.
   */
  rules(rules: Record<string, Rule | IGrammarMatcher>) {
    for (const [name, _rule] of Object.entries(rules)) {
      const rule = _rule instanceof Rule ? _rule : new Rule(_rule);
      if (this._rules[name]) throw Error(`Rule ${name} already exists.`);
      this._rules[name] = rule;
    }
    return this;
  }
  
  /** Define which rules can be applied to specific scopes. This is used together with
   * `useSignificantWhitespaces` and `statementSeparator` to build the body of a code block.
   */
  scope: Scopes = new Proxy({}, {
    get: (target, prop: string) => (...rules: string[]) => {
      if (!this.scopes[prop]) this.scopes[prop] = [];
      this.scopes[prop].push(...rules);
      return this;
    },
  });
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
