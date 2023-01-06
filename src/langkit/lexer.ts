
interface LexerMode {
  name: string;
  rules: LexerRule[];
  
  /** Produce a string representation of this mode, including its rules. */
  toAntlr(): string;
}

interface LexerRule {
  name: string;
  match: Matcher;
  
  fragment: boolean;
  skip: boolean;
  channel: string | undefined;
  pushMode: string | undefined;
  popMode: boolean;
  
  /** Produce a string representation of this rule. */
  toAntlr(): string;
}

export default class Lexer implements LexerMode {
  constructor(
    public readonly name: string,
    public readonly rules: LexerRule[] = [],
    public readonly modes: LexerMode[] = [],
  ) {}
  
  toAntlr(): string {
    return `lexer grammar ${this.name};\n\n` +
      this.rules.map(r => r.toAntlr()).join('\n') + '\n\n' +
      this.modes.map(m => m.toAntlr()).join('\n\n') + '\n';
  }
  
  static create(name: string, rules: LexerDef): LexerBuilder {
    return new LexerBuilder(name).rules(rules);
  }
}

class LexerBuilder {
  constructor(
    public _name: string,
    public _rules: LexerRuleMap = {},
    public _modes: LexerModeMap = {},
  ) {}
  
  rules(rules: LexerDef) {
    mergeRules(this._rules, typeof rules === 'function' ? rules(api()) : rules);
    return this;
  }
  
  mode(name: string, rules: LexerDef, merge = false) {
    rules = typeof rules === 'function' ? rules(api(name)) : rules;
    
    if (this._modes[name]) {
      if (!merge) throw Error(`Lexer Mode ${name} already exists, and merge is false`);
      mergeRules(this._modes[name], rules);
    } else {
      this._modes[name] = rules;
    }
    return this;
  }
  
  build(): Lexer {
    return new Lexer(
      this._name,
      this.buildRules(this._rules),
      Object.entries(this._modes).map(
        ([name, rules]) => ({
          name,
          rules: this.buildRules(rules),
          toAntlr() {
            return `mode ${this.name};\n` +
              this.rules.map(r => r.toAntlr()).join('\n');
          },
        })
      ),
    );
  }
  
  protected buildRules(map: LexerRuleMap): LexerRule[] {
    const rules: LexerRule[] = [];
    for (const name in map) {
      rules.push(
        LexerRuleBuilder.from(map[name]).build(name)
      );
    }
    return rules;
  }
}

class LexerRuleBuilder {
  _fragment = false;
  _skipped = false;
  _channel: string | undefined;
  _pushMode: string | undefined;
  _popMode = false;
  
  constructor(
    public _mode: string | undefined,
    public _match: Matcher,
  ) {}
  
  fragment() {
    this._fragment = true;
    return this;
  }
  
  skip() {
    this._skipped = true;
    return this;
  }
  
  channel(name: string) {
    if (this._channel !== undefined) throw Error(`Channel already set to ${this._channel}`);
    this._channel = name;
    return this;
  }
  
  pushMode(mode: string) {
    if (this._channel !== undefined) throw Error(`pushMode already set to ${this._mode}`);
    this._channel = mode;
    return this;
  }
  
  popMode() {
    if (this._mode === undefined) throw Error('Can only popMode from rules within modes');
    this._popMode = true;
    return this;
  }
  
  build(name: string): LexerRule {
    return {
      name,
      match: this._match,
      fragment: this._fragment,
      skip: this._skipped,
      channel: this._channel,
      pushMode: this._pushMode,
      popMode: this._popMode,
      
      toAntlr() {
        let s = '';
        
        // rule name + fragment
        if (this.fragment) s += 'fragment ';
        s += `${this.name}: `;
        
        // matchers
        s += this.match.toAntlr();
        
        // rule parameters
        const { skip, channel, pushMode, popMode } = this;
        if (skip || channel || pushMode || popMode) {
          s += ' -> ';
          s += [
            skip && 'skip',
            channel && `channel(${channel})`,
            pushMode && `pushMode(${pushMode})`,
            popMode && 'popMode',
          ].filter(flag => !!flag).join(', ');
        }
        
        s += ';'
        return s;
      },
    }
  }
  
  static from(elem: MatchElement | LexerRuleBuilder, mode?: string): LexerRuleBuilder {
    if (elem instanceof LexerRuleBuilder) return elem;
    return new LexerRuleBuilder(
      mode,
      normalizeMatchElement(elem),
    );
  }
}

function common<T extends object>(obj: T): T & Omit<MatcherCommon, 'toAntlr'> {
  return {
    get optional(): MatchOptional {
      const result = common({
        type: '?' as const,
        match: this as any as Matcher,
        toAntlr() {
          return `(${this.match.toAntlr()})?`;
        },
      })
      return result;
    },
    get plus(): MatchMany {
      const result = common({
        type: '+' as const,
        match: this as any as Matcher,
        toAntlr() {
          return `(${this.match.toAntlr()})+`;
        },
        get lazy(): MatchManyLazy {
          const result = common({
            type: '+?' as const,
            match: this.match,
            toAntlr() {
              return `(${this.match.toAntlr()})+?`;
            },
          })
          return result;
        },
      })
      return result;
    },
    get star(): MatchMany {
      const result = common({
        type: '*' as const,
        match: this as any as Matcher,
        toAntlr() {
          return `(${this.match.toAntlr()})*`;
        },
        get lazy(): MatchManyLazy {
          const result = common({
            type: '*?' as const,
            match: this.match,
            toAntlr() {
              return `(${this.match.toAntlr()})*?`;
            },
          })
          return result;
        },
      })
      return result;
    },
    ...obj,
  }
}

type LexerDef = LexerRuleMap | ((api: LexerAPI) => LexerRuleMap);

type LexerAPI = ReturnType<typeof api>;
function api(mode?: string) {
  const self = {
    frag(...matches: MatchElement[]): LexerRuleBuilder {
      return new LexerRuleBuilder(mode, self.seq(...matches)).fragment();
    },
    
    lit(pattern: string): MatchLiteral {
      return normalizeMatchElement(pattern);
    },
    
    not(match: MatchElement): Matcher {
      match = normalizeMatchElement(match);
      if (match.type === '~') return match.match;
      const result = common({
        type: '~' as const,
        match,
        toAntlr() {
          return `~(${this.match})`;
        },
      })
      return result;
    },
    
    or(...matches: MatchElement[]): MatchAny {
      const result = common({
        type: '|' as const,
        items: matches.map(normalizeMatchElement),
        toAntlr() {
          return '(' + this.items.map(i => i.toAntlr()).join(' | ') + ')';
        },
      })
      return result;
    },
    
    seq(...matches: MatchElement[]): MatchAll {
      const result = common({
        type: '&' as const,
        items: matches.map(normalizeMatchElement),
        toAntlr() {
          return '(' + this.items.map(i => i.toAntlr()).join(' ') + ')';
        },
      })
      return result;
    },
    
    range(def: string): MatchRange {
      const result = common({
        type: '[]' as const,
        def,
        toAntlr() {
          return `[${this.def}]`;
        },
      })
      return result;
    },
    
    rule(...matches: MatchElement[]): LexerRuleBuilder {
      return new LexerRuleBuilder(mode, self.seq(...matches));
    },
    
    get any(): MatchAnyChar {
      const result = common({
        type: '.' as const,
        toAntlr() {
          return '.';
        },
      })
      return result;
    },
    
    T: new Proxy<MatchTokenFactory>({}, {
      get(_, p: string): MatchToken {
        const result = common({
          type: 'token' as const,
          name: p,
          toAntlr() { return this.name },
        })
        return result;
      },
    }),
  };
  return self;
}

type LexerRuleMap = Record<string, MatchElement | LexerRuleBuilder>;
type LexerModeMap = Record<string, LexerRuleMap>;

type MatchElement = string | Matcher;
export type Matcher =
  | MatchLiteral
  | MatchAnyChar
  | MatchRange
  | MatchToken
  | MatchOptional
  | MatchMany
  | MatchManyLazy
  | MatchGroup // not sure why we have this one since it's implicitly part of any & all...
  | MatchAny
  | MatchAll
  | MatchNot
interface MatcherCommon {
  /** Produce the ANTLR grammar string resembling this matcher. */
  toAntlr(): string;
  optional: MatchOptional;
  star: MatchMany;
  plus: MatchMany;
}
export type MatchLiteral = MatcherCommon & {
  type: 'literal';
  match: string;
}
export type MatchAnyChar = MatcherCommon & {
  type: '.';
}
export type MatchRange = MatcherCommon & {
  type: '[]';
  def: string;
}
export type MatchToken = MatcherCommon & {
  type: 'token';
  name: string;
}
export type MatchOptional = MatcherCommon & {
  type: '?';
  match: Matcher;
}
export type MatchMany = MatcherCommon & {
  type: '*' | '+';
  match: Matcher;
  lazy: MatchManyLazy;
}
export type MatchManyLazy = MatcherCommon & {
  type: '*?' | '+?';
  match: Matcher;
}
export type MatchGroup = MatcherCommon & {
  type: '()';
  match: Matcher;
}
export type MatchAny = MatcherCommon & {
  type: '|';
  items: Matcher[];
}
export type MatchAll = MatcherCommon & {
  type: '&';
  items: Matcher[];
}
export type MatchNot = MatcherCommon & {
  type: '~';
  match: Matcher;
}

type MatchTokenFactory = Record<string, MatchToken>;

/** Merge rules of RHS into LHS, throwing if a rule name is already in use. */
function mergeRules(lhs: LexerRuleMap, rhs: LexerRuleMap) {
  for (const rule in rhs)
    if (lhs[rule]) throw Error(`Rule name ${rule} already in use`);
  Object.assign(lhs, rhs);
}

function normalizeMatchElement(item: string): MatchLiteral;
function normalizeMatchElement<T extends Matcher>(item: T): T;
function normalizeMatchElement(item: MatchElement): Matcher;
function normalizeMatchElement(item: MatchElement) {
  if (typeof item === 'string') {
    const result = common({
      type: 'literal' as const,
      match: item,
      toAntlr() {
        return `'${escapeLiteral(this.match)}'`;
      },
    });
    return result;
  }
  return item;
}

const escapeLiteral = (literal: string) =>
  literal.replace(/\\/, '\\\\').replace(/'/, "\\'");
