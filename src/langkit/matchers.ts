
export interface IGrammarMatcher {
  type: string;
  toAntlr(parent?: IGrammarMatcher): string;
}

export class GroupMatcher implements IGrammarMatcher {
  readonly type = 'group' as const;
  
  constructor(public match: IGrammarMatcher) {}
  toAntlr(): string {
    return `(${this.match.toAntlr(this)})`
  }
}

export class SequenceMatcher implements IGrammarMatcher {
  readonly type = 'sequence' as const;
  
  constructor(public matchers: IGrammarMatcher[]) {}
  toAntlr(parent?: IGrammarMatcher): string {
    let result = this.matchers.map(m => m.toAntlr(this)).join(' ');
    if (!['sequence', 'choice'].includes(parent?.type ?? '') && this.matchers.length > 1)
      result = `(${result})`;
    return result;
  }
}

export class ChoiceMatcher implements IGrammarMatcher {
  readonly type = 'choice' as const;
  
  constructor(public matchers: IGrammarMatcher[]) {}
  toAntlr(parent?: IGrammarMatcher): string {
    if (!this.matchers.length) throw Error('Empty choice matcher');
    let result = this.matchers.map(m => m.toAntlr(this)).join(' | ');
    if (parent && parent.type !== 'group' && this.matchers.length > 1)
      result = `(${result})`;
    return result;
  }
}

export class AnyMatcher implements IGrammarMatcher {
  readonly type = 'any' as const;
  toAntlr() { return '.'; }
}

export class LiteralMatcher implements IGrammarMatcher {
  readonly type = 'literal' as const;
  
  constructor(public literal: string) {}
  toAntlr() { return this.escapedLiteral; }
  get escapedLiteral() {
    return '"' + this.literal.replace(/"/g, '\\"').replace(/\\/g, '\\\\') + '"';
  }
}

export class RuleMatcher implements IGrammarMatcher {
  readonly type = 'rule' as const;
  
  constructor(public rule: string) {}
  toAntlr() { return this.rule; }
}

type MultipleMatcherType = '*' | '+' | '?' | { min: number, max: number };
export class MultipleMatcher implements IGrammarMatcher {
  readonly type = 'multiple' as const;
  
  constructor(
    match: IGrammarMatcher,
    kind: '*' | '+',
    lazy?: boolean,
  );
  constructor(
    match: IGrammarMatcher,
    kind: Exclude<MultipleMatcherType, '*' | '+'>,
  );
  constructor(
    public match: IGrammarMatcher,
    public kind: MultipleMatcherType,
    /** Whether this multiplicity matcher is lazy. Only applies to '*' and '+' types. */
    public lazy = false,
  ) {}
  
  toAntlr(): string {
    let result = '';
    switch (this.kind) {
      case '*': result = `${this.match.toAntlr(this)}*`; break;
      case '+': result = `${this.match.toAntlr(this)}+`; break;
      case '?': result = `${this.match.toAntlr(this)}?`; break;
      default: {
        let min: number | string = this.kind.min || '';
        let max: number | string = this.kind.max;
        if (max && max === Infinity) max = '';
        if (min === max)
          result = `${this.match.toAntlr(this)}{${min}}`;
        else
          result = `${this.match.toAntlr(this)}{${min},${max}}`;
        break;
      }
    }
    if (this.lazy) result += '?';
    return result;
  }
}

export class CharsetMatcher implements IGrammarMatcher {
  readonly type = 'range' as const;
  
  constructor(public charset: string) {}
  toAntlr() { return `[${this.charset}]`; }
}

/** Empty matcher. Simply prints '' when calling `toAntlr()`. */
export class EpsilonMatcher implements IGrammarMatcher {
  static readonly instance = new EpsilonMatcher();
  readonly type = 'epsilon' as const;
  toAntlr() { return ''; }
}
