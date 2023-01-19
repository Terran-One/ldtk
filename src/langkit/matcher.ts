// Warning: Black Magic ahead
type MatcherType = keyof MatchMap<any>;
type WrapMatcher<T extends { type: string }> = { [K in T['type']]: T };
type MatchMap<T extends MatcherType> =
  & WrapMatcher<MatchLiteral<T>>
  & WrapMatcher<MatchRange<T>>
  & WrapMatcher<MatchAnyChar<T>>
  & WrapMatcher<MatchToken<T>>
  & WrapMatcher<MatchAlias<T>>
  & WrapMatcher<MatchOptional<T>>
  & WrapMatcher<MatchMany<T>>
  & WrapMatcher<MatchManyLazy<T>>
  & WrapMatcher<MatchGroup<T>>
  & WrapMatcher<MatchAny<T>>
  & WrapMatcher<MatchAll<T>>
  & WrapMatcher<MatchNot<T>>
  & WrapMatcher<MatchEOF<T>>

type Matcher<K extends MatcherType> = Pick<MatchMap<K>, K>[K]

export type LexerMatcherType = keyof Omit<MatchMap<any>, 'alias' | 'EOF'>
export type ParserMatcherType = keyof Omit<MatchMap<any>, 'literal' | '[]' | '.'>
export type LexerMatcher = Matcher<LexerMatcherType>
export type ParserMatcher = Matcher<ParserMatcherType>

type MatcherCommons<K extends MatcherType> = {
  /** Produce an ANTLR grammar representation of this matcher. */
  toAntlr(): string;
  optional: MatchOptional<K>;
  star: MatchMany<K>;
  plus: MatchMany<K>;
}
export type MatchLiteral<K extends MatcherType> = MatcherCommons<K> & {
  type: 'literal';
  match: string;
}
export type MatchRange<K extends MatcherType>  = MatcherCommons<K> & {
  type: '[]';
  def: string;
}
export type MatchAnyChar<K extends MatcherType>  = MatcherCommons<K> & {
  type: '.';
}
export type MatchToken<K extends MatcherType>  = MatcherCommons<K> & {
  type: 'token';
  name: string;
}
export type MatchAlias<K extends MatcherType> = MatcherCommons<K> & {
  type: 'alias';
  name: string;
  match: MatchToken<K>[];
}
export type MatchOptional<K extends MatcherType> = MatcherCommons<K> & {
  type: '?';
  match: Matcher<K>;
}
export type MatchMany<K extends MatcherType> = MatcherCommons<K> & {
  type: '+' | '*';
  match: Matcher<K>;
  lazy: MatchManyLazy<K>;
}
export type MatchManyLazy<K extends MatcherType> = MatcherCommons<K> & {
  type: '+?' | '*?';
  match: Matcher<K>;
}
export type MatchGroup<K extends MatcherType> = MatcherCommons<K> & {
  type: '()';
  match: Matcher<K>;
}
export type MatchAny<K extends MatcherType> = MatcherCommons<K> & {
  type: '|';
  match: Matcher<K>[];
}
export type MatchAnyLabels<K extends MatcherType> = Pick<MatcherCommons<K>, 'toAntlr'> & {
  type: '|+';
  match: {
    match: Matcher<K>;
    label: string;
    assoc: 'left' | 'right';
  }[];
}
export type MatchAll<K extends MatcherType> = MatcherCommons<K> & {
  type: '&';
  match: Matcher<K>[];
}
export type MatchNot<K extends MatcherType> = MatcherCommons<K> & {
  type: '~';
  match: Matcher<K>;
}
export type MatchEOF<K extends MatcherType> = {
  type: 'EOF';
  toAntlr(): string;
  optional: MatchOptional<K>;
}

export function createMatcher<K extends MatcherType, T extends object>(obj: T): T & Omit<MatcherCommons<K>, 'toAntlr'> {
  // NOTE: cannot directly return common<K>()({...}) b/c TS attempts to infer T from the return type,
  // which then includes the MatcherCommons<K> which we intend to mixin here.
  return {
    get optional(): MatchOptional<K> {
      const result = common<K>()({
        type: '?' as const,
        match: this as any,
        toAntlr() {
          return `(${this.match.toAntlr()})?`;
        },
      })
      return result;
    },
    get star(): MatchMany<K> {
      const result = common<K>()({
        type: '*' as const,
        match: this as any,
        get lazy(): MatchManyLazy<K> {
          const result = common<K>()({
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
    get plus(): MatchMany<K> {
      const result = common<K>()({
        type: '+' as const,
        match: this as any,
        get lazy(): MatchManyLazy<K> {
          const result = common<K>()({
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
    ...obj,
  }
}
createMatcher.pin = <K extends MatcherType>() => <T extends object>(obj: T) => createMatcher<K, T>(obj);
const common = createMatcher.pin;

export const MatchTokenFactory = <K extends MatcherType>(type: 'token' | 'rule') => new Proxy<Record<string, MatchToken<K>>>({}, {
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
    
    return common<K>()({
      type: 'token',
      name: p,
      toAntlr() {
        return this.name;
      },
    })
  },
});
