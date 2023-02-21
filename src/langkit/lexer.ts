import { mergeRules } from "./common";
import {
  createMatcher,
  LexerMatcher,
  LexerMatcherType,
  LexerMatchExtra,
  LexerMatchMap as Matchers,
  matchAll,
  MatchTokenFactory,
  ProcessMatchElements,
} from "./matcher";

interface LexerMode {
  name: string;
  rules: LexerRule[];
  
  /** Produce a string representation of this mode, including its rules. */
  toAntlr(): string;
}

interface LexerRule {
  name: string;
  match: LexerMatcher;
  
  meta: {
    fragment: boolean;
    skip: boolean;
    channel: string | undefined;
    mode: string | undefined;
    pushMode: string | undefined;
    popMode: boolean;
    more: boolean;
    type: string | undefined;
    action: LexerAction | undefined;
    predicate: LexerPredicate | undefined;
  };
  
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
    const channels = [
      this._collectChannels(this.rules),
      ...this.modes.map(mode => this._collectChannels(mode.rules)),
    ].reduce((prev, curr) => prev.concat(curr), []).sort();
    
    let result = `lexer grammar ${this.name};\n\n`;
    
    if (channels.length) {
      result += 'channels {\n'
        + channels.map(c => `\t${c}`).join(',\n')
        + '}\n\n';
    }
    
    result += this.rules.map(r => r.toAntlr()).join('\n') + '\n\n';
    result += this.modes.map(m => m.toAntlr()).join('\n\n') + '\n';
    
    return result;
  }
  
  protected _collectChannels(rules: LexerRule[]): string[] {
    const result: string[] = [];
    for (const rule of rules) {
      rule.meta.channel && result.push(rule.meta.channel);
    }
    return result;
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
  meta: LexerRule['meta'] = {
    fragment: false,
    skip: false,
    channel: undefined,
    mode: undefined,
    pushMode: undefined,
    popMode: false,
    more: false,
    type: undefined,
    action: undefined,
    predicate: undefined,
  };
  
  constructor(
    public _mode: string | undefined,
    public _match: LexerMatcher,
  ) {}
  
  channel(name: string) {
    if (this.meta.channel !== undefined) throw Error(`Channel already set to ${this.meta.channel}`);
    this.meta.channel = name;
    return this;
  }
  
  mode(mode: string) {
    this.meta.mode = mode;
    return this;
  }
  
  pushMode(mode: string) {
    if (this.meta.pushMode !== undefined) throw Error(`pushMode already set to ${this._mode}`);
    this.meta.pushMode = mode;
    return this;
  }
  
  get popMode() {
    this.meta.popMode = true;
    return this;
  }
  
  type(value: string) {
    this.meta.type = value;
    return this;
  }
  
  exec(action: LexerAction) {
    this.meta.action = action;
    return this;
  }
  
  where(pred: LexerPredicate) {
    this.meta.predicate = pred;
    return this;
  }
  
  build(name: string): LexerRule {
    return {
      name,
      match: this._match,
      meta: this.meta,
      
      toAntlr() {
        let s = '';
        
        const { action, predicate: pred } = this.meta;
        
        // rule name + fragment
        if (this.meta.fragment) s += 'fragment ';
        s += `${this.name}: `;
        
        // rule semantic predicate
        if (pred) s += '{(' + pred + ')(this.state)}?';
        
        // for the sake of simplicity, actions are always applied to the whole rule
        // which is what ANTLR recommends anyways
        // hence when an action is given we wrap the entire matcher in (...)
        if (action) s += '(';
        // matchers
        s += this.match.toAntlr();
        
        // rule parameters
        const { skip, channel, mode, pushMode, popMode, more, type } = this.meta;
        if (skip || channel || mode || pushMode || popMode || more || type) {
          s += ' -> ';
          s += [
            skip && 'skip',
            channel && `channel(${channel})`,
            mode && `mode(${mode})`,
            pushMode && `pushMode(${pushMode})`,
            popMode && 'popMode',
            more && 'more',
            type && `type(${type})`,
          ].filter(flag => !!flag).join(', ');
        }
        
        // rule action
        if (action) s += ') {(' + action + ')(this.state)}';
        
        s += ';'
        return s;
      },
    }
  }
  
  get fragment() {
    this.meta.fragment = true;
    return this;
  }
  
  get skip() {
    this.meta.skip = true;
    return this;
  }
  
  get more() {
    this.meta.more = true;
    return this;
  }
  
  static from(elem: MatchElement | LexerRuleBuilder, mode?: string): LexerRuleBuilder {
    if (elem instanceof LexerRuleBuilder) return elem;
    return new LexerRuleBuilder(
      mode,
      parseMatchElement(elem),
    );
  }
}

type LexerAction = (this: any, state: any) => void;
type LexerPredicate = (this: any, state: any) => boolean;

type LexerDef = LexerRuleMap | ((api: LexerAPI) => LexerRuleMap);

const common = <T extends object>(obj: T) => createMatcher.pin(parseMatchElements)(obj);
type LexerAPI = ReturnType<typeof createAPI>;

function createAPI(mode?: string) {
  function api(match: string): Matchers['literal'];
  function api(match: string[]): Matchers['[]'];
  function api(match: MatchElement): LexerMatcher;
  function api(...matches: MatchElement[]): Matchers['&'];
  function api(...matches: MatchElement[]): any {
    if (matches.length === 0) throw Error('No matches provided');
    if (matches.length === 1) return parseMatchElements(matches)[0];
    return api.seq(...matches);
  }
  
  /** A sequence of matches. All of these must match in sequence. */
  api.seq = (...match: MatchElement[]) => matchAll(parseMatchElements, ...match);
  
  /** A selection of alternative choices. Any one of these must match in parallel. */
  api.or = (...match: MatchElement[]): Matchers['|'] => {
    const result = common({
      type: '|' as const,
      match: parseMatchElements(match),
      toAntlr() {
        return '(' + this.match.map(m => m.toAntlr()).join(' | ') + ')';
      },
    })
    return result;
  }
  
  /** Match any single character that is not in the given range. */
  api.not = (...match: MatchElement[]): Matchers['~'] => {
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
  api.frag = (...match: MatchElement[]) => api.rule(...match).fragment;
  
  /** Match any single character */
  api.any = ((): Matchers['.'] => {
    const result = common({
      type: '.' as const,
      toAntlr() { return '.' },
    })
    return result;
  })();
  
  /** Match any one named token. Token name must be capitalized. Combine with other matchers. */
  api.T = MatchTokenFactory(parseMatchElements, 'token');
  
  /** Create an unescaped string literal. Ideal for matching sequences like '\n' or '\t'.
   * 
   * ## Usage
   * ```typescript
   * Lexer.create('ExampleLexer', $ => {
   *   const { l } = $;
   *   return {
   *     NL: l`\n`,
   *     TAB: l`\t`,
   *   }
   * });
   * ```
   */
  api.l = String.raw;
  
  return api;
}

type LexerRuleMap = Record<string, MatchElement | LexerRuleBuilder>;
type LexerModeMap = Record<string, LexerRuleMap>;

type MatchElement = string | string[] | LexerMatcher;
type MatchTokenFactory = Record<string, Matchers['token']>;

const parseMatchElements: ProcessMatchElements<LexerMatchExtra, LexerMatcherType> =
  matches => matches.map(parseMatchElement);

function parseMatchElement(match: string): Matchers['literal'];
function parseMatchElement(match: string[]): Matchers['[]'];
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
