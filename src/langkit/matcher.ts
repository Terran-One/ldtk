// Warning: Black Magic ahead
type MatcherType = keyof MatchMap<any, any>;
type WrapMatcher<T extends { type: string }> = { [K in T['type']]: T };
type MatchMap<X, T extends MatcherType> =
  & WrapMatcher<MatchLiteral<X, T>>
  & WrapMatcher<MatchRange<X, T>>
  & WrapMatcher<MatchAnyChar<X, T>>
  & WrapMatcher<MatchToken<X, T>>
  & WrapMatcher<MatchAlias<X, T>>
  & WrapMatcher<MatchOptional<X, T>>
  & WrapMatcher<MatchMany<X, T>>
  & WrapMatcher<MatchManyLazy<X, T>>
  & WrapMatcher<MatchGroup<X, T>>
  & WrapMatcher<MatchAny<X, T>>
  & WrapMatcher<MatchAll<X, T>>
  & WrapMatcher<MatchNot<X, T>>
  & WrapMatcher<MatchEOF<X, T>>

type Matcher<X, K extends MatcherType> = Pick<MatchMap<X, K>, K>[K]
export type MatchElement<X, K extends MatcherType> = X | Matcher<X, K>;
export type ProcessMatchElements<X, K extends MatcherType> = (elems: MatchElement<X, K>[]) => Matcher<X, K>[];

export type LexerMatchExtra = string | string[];
export type ParserMatchExtra = never;
export type LexerMatcherType = keyof Omit<MatchMap<LexerMatchExtra, any>, 'alias' | 'EOF'>
export type ParserMatcherType = keyof Omit<MatchMap<ParserMatchExtra, any>, 'literal' | '[]' | '.'>

export type LexerMatchMap = MatchMap<LexerMatchExtra, LexerMatcherType>;
export type ParserMatchMap = MatchMap<ParserMatchExtra, ParserMatcherType>;
export type LexerMatcher = LexerMatchMap[LexerMatcherType];
export type ParserMatcher = ParserMatchMap[ParserMatcherType];

type MatcherCommons<X, K extends MatcherType> = {
  /** Produce an ANTLR grammar representation of this matcher. */
  toAntlr(): string;
  optional: MatchOptional<X, K>;
  star: MatchMany<X, K>;
  plus: MatchMany<X, K>;
  wrap(...matches: MatchElement<X, K>[]): MatchAll<X, K>;
}
export type MatchLiteral<X, K extends MatcherType> = MatcherCommons<X, K> & {
  type: 'literal';
  match: string;
}
export type MatchRange<X, K extends MatcherType>  = MatcherCommons<X, K> & {
  type: '[]';
  def: string;
}
export type MatchAnyChar<X, K extends MatcherType>  = MatcherCommons<X, K> & {
  type: '.';
}
export type MatchToken<X, K extends MatcherType>  = MatcherCommons<X, K> & {
  type: 'token';
  name: string;
}
export type MatchAlias<X, K extends MatcherType> = MatcherCommons<X, K> & {
  type: 'alias';
  name: string;
  match: MatchToken<X, K>[];
}
export type MatchOptional<X, K extends MatcherType> = MatcherCommons<X, K> & {
  type: '?';
  match: Matcher<X, K>;
}
export type MatchMany<X, K extends MatcherType> = MatcherCommons<X, K> & {
  type: '+' | '*';
  match: Matcher<X, K>;
  lazy: MatchManyLazy<X, K>;
}
export type MatchManyLazy<X, K extends MatcherType> = MatcherCommons<X, K> & {
  type: '+?' | '*?';
  match: Matcher<X, K>;
}
export type MatchGroup<X, K extends MatcherType> = MatcherCommons<X, K> & {
  type: '()';
  match: Matcher<X, K>;
}
export type MatchAny<X, K extends MatcherType> = MatcherCommons<X, K> & {
  type: '|';
  match: Matcher<X, K>[];
}
export type MatchAnyLabels<X, K extends MatcherType> = Pick<MatcherCommons<X, K>, 'toAntlr'> & {
  type: '|+';
  match: {
    match: Matcher<X, K>;
    label: string;
    assoc: 'left' | 'right';
  }[];
}
export type MatchAll<X, K extends MatcherType> = MatcherCommons<X, K> & {
  type: '&';
  match: Matcher<X, K>[];
}
export type MatchNot<X, K extends MatcherType> = MatcherCommons<X, K> & {
  type: '~';
  match: Matcher<X, K>;
}
export type MatchEOF<X, K extends MatcherType> = {
  type: 'EOF';
  toAntlr(): string;
  optional: MatchOptional<X, K>;
}

export function matchAll<X, K extends MatcherType>(process: ProcessMatchElements<X, K>, ...matches: MatchElement<X, K>[]): MatchAll<X, K> {
  const result = common(process)({
    type: '&' as const,
    match: process(matches),
    toAntlr() {
      return this.match.map(m => m.toAntlr()).join(' ');
    },
  });
  return result;
}

export function createMatcher<X, K extends MatcherType, T extends object>(process: ProcessMatchElements<X, K>, obj: T): T & Omit<MatcherCommons<X, K>, 'toAntlr'> {
  // NOTE: cannot directly return common({...}) b/c TS attempts to infer T from the return type,
  // which then includes the MatcherCommons<X, K> which we intend to mixin here.
  const common = createMatcher.pin(process);
  return {
    get optional(): MatchOptional<X, K> {
      const result = common({
        type: '?' as const,
        match: this as any,
        toAntlr() {
          return `(${this.match.toAntlr()})?`;
        },
      })
      return result;
    },
    get star(): MatchMany<X, K> {
      const result = common({
        type: '*' as const,
        match: this as any,
        get lazy(): MatchManyLazy<X, K> {
          const result = common({
            type: '*?' as const,
            match: this.match,
            toAntlr() {
              return `(${this.match.toAntlr()})*?`;
            },
          })
          return result;
        },
        toAntlr() {
          return `(${this.match.toAntlr()})*`;
        },
      })
      return result;
    },
    get plus(): MatchMany<X, K> {
      const result = common({
        type: '+' as const,
        match: this as any,
        get lazy(): MatchManyLazy<X, K> {
          const result = common({
            type: '+?' as const,
            match: this.match,
            toAntlr() {
              return `(${this.match.toAntlr()})+?`;
            },
          })
          return result;
        },
        toAntlr() {
          return `(${this.match.toAntlr()})+`;
        },
      })
      return result;
    },
    wrap(...matches: MatchElement<X, K>[]): MatchAll<X, K> {
      if (matches.length === 0) throw Error('Cannot wrap with no matches');
      return matchAll(process, ...matches, this as any, ...matches);
    },
    ...obj,
  }
}
createMatcher.pin = <X, K extends MatcherType>(process: ProcessMatchElements<X, K>) =>
  <T extends object>(obj: T) => createMatcher(process, obj);
const common = createMatcher.pin;

export const MatchTokenFactory = <X, K extends MatcherType>(process: ProcessMatchElements<X, K>, type: 'token' | 'rule') =>
  new Proxy<Record<string, MatchToken<X, K>>>({}, {
    get(_, p: string) {
      switch (type) {
        case 'token':
          if (!p.match(/^[A-Z]/))
            throw Error('Tokens must start with a capital letter');
          break;
        case 'rule':
          if (!p.match(/^[a-z]/))
            throw Error('Rules must start with a lowercase letter');
          break;
      }
      
      return common(process)({
        type: 'token',
        name: p,
        toAntlr() {
          return this.name;
        },
      })
    },
  });
