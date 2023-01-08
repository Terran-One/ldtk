import { mergeRules } from "./common";
import { createMatcher, LexerMatcher, LexerMatcherType, MatchAll, MatchAny, MatchAnyChar, MatchLiteral, MatchNot, MatchRange, MatchToken, MatchTokenFactory } from "./matcher";

interface LexerMode {
  name: string;
  rules: LexerRule[];
  
  /** Produce a string representation of this mode, including its rules. */
  toAntlr(): string;
}

interface LexerRule {
  name: string;
  match: LexerMatcher;
  
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
    mergeRules(this._rules, typeof rules === 'function' ? rules(createAPI()) : rules);
    return this;
  }
  
  mode(name: string, rules: LexerDef, merge = false) {
    rules = typeof rules === 'function' ? rules(createAPI(name)) : rules;
    
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
    public _match: LexerMatcher,
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
      parseMatchElement(elem),
    );
  }
}

type LexerDef = LexerRuleMap | ((api: LexerAPI) => LexerRuleMap);

const common = <T extends object>(obj: T) => createMatcher.pin<LexerMatcherType>()(obj);
type LexerAPI = ReturnType<typeof createAPI>;

function createAPI(mode?: string) {
  function api(match: string): MatchLiteral<LexerMatcherType>;
  function api(match: string[]): MatchRange<LexerMatcherType>;
  function api(match: MatchElement): LexerMatcher;
  function api(...matches: MatchElement[]): MatchAll<LexerMatcherType>;
  function api(...matches: MatchElement[]): any {
    if (matches.length === 0) throw Error('No matches provided');
    if (matches.length === 1) return parseMatchElements(matches)[0];
    return api.seq(...matches);
  }
  
  /** A sequence of matches. All of these must match in sequence. */
  api.seq = (...match: MatchElement[]): MatchAll<LexerMatcherType> => {
    const result = common({
      type: '&' as const,
      match: parseMatchElements(match),
      toAntlr() {
        return '(' + this.match.map(m => m.toAntlr()).join(' ') + ')';
      },
    })
    return result;
  }
  
  /** A selection of alternative choices. Any one of these must match in parallel. */
  api.or = (...match: MatchElement[]): MatchAny<LexerMatcherType> => {
    const result = common({
      type: '|' as const,
      match: parseMatchElements(match),
      toAntlr() {
        return '(' + this.match.map(m => m.toAntlr()).join(' | ') + ')';
      },
    })
    return result;
  }
  
  /** Negate given matches. Anything matches but these. */
  api.not = (...match: MatchElement[]): MatchNot<LexerMatcherType> => {
    const result = common({
      type: '~' as const,
      match: api(...match),
      toAntlr() {
        return `~(${this.match.toAntlr()})`;
      },
    })
    return result;
  }
  
  /** Explicitly wrap given matches in a `LexerRuleBuilder` which exposes additional rule-level operations. */
  api.rule = (...match: MatchElement[]) => new LexerRuleBuilder(mode, api(...match));
  /** Explicitly wrap given matches in a fragment rule. Shorthand for `api.rule(...).fragment()`. */
  api.frag = (...match: MatchElement[]) => api.rule(...match).fragment();
  
  /** Match any single character */
  api.any = ((): MatchAnyChar<LexerMatcherType> => {
    const result = common({
      type: '.' as const,
      toAntlr() { return '.' },
    })
    return result;
  })();
  
  /** Match any one named token. Combine with other matchers. */
  api.T = MatchTokenFactory<LexerMatcherType>();
  
  return api;
}

type LexerRuleMap = Record<string, MatchElement | LexerRuleBuilder>;
type LexerModeMap = Record<string, LexerRuleMap>;

type MatchElement = string | string[] | LexerMatcher;
type MatchTokenFactory = Record<string, MatchToken<LexerMatcherType>>;

const parseMatchElements = (matches: MatchElement[]) => matches.map(parseMatchElement);

function parseMatchElement(match: string): MatchLiteral<LexerMatcherType>;
function parseMatchElement(match: string[]): MatchRange<LexerMatcherType>;
function parseMatchElement<T extends LexerMatcher>(match: T): T;
function parseMatchElement(match: MatchElement): LexerMatcher;
function parseMatchElement(match: MatchElement) {
  if (typeof match === 'string') {
    if (!match) throw Error('Empty literal');
    const result = common({
      type: 'literal' as const,
      match,
      toAntlr() {
        return `'${escapeLiteral(this.match)}'`;
      },
    });
    return result;
  }
  if (match && 'length' in match && typeof match.length === 'number') {
    const result = common({
      type: '[]' as const,
      def: match.join(''),
      toAntlr() {
        return `[${this.def}]`;
      },
    });
    if (!result.def) throw Error('Empty range');
    return result;
  }
  return match;
}

const escapeLiteral = (literal: string) =>
  literal.replace(/\\/, '\\\\').replace(/'/, "\\'");
