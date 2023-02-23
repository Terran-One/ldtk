import { mergeRules } from "./common";
import Lexer from "./lexer";
import {
  createMatcher,
  MatchAnyLabels as _MatchAnyLabels,
  MatchTokenFactory,
  ParserMatcher,
  ParserMatcherType,
  ParserMatchMap as Matchers,
  ParserMatchExtra,
  ProcessMatchElements,
  matchAll,
} from "./matcher";

type MatchAnyLabels = _MatchAnyLabels<ParserMatchExtra, ParserMatcherType>;

export type ParserRule =
  | { // Pretty much all matchers but labeled options
      name: string;
      match: ParserMatcher;
      
      /** Produce a string representation of this rule. */
      toAntlr(): string;
    }
  | { // MatchAnyLabels is special as it can only appear at the root of a rule. It does thus not occur in `ParserMatcherType`.
      name: string;
      match: MatchAnyLabels;
      
      /** Produce a string representation of this rule. */
      toAntlr(): string;
    }

type OptionMap = {
  [label: string]: ParserMatcher | ParserRuleOption;
}

export default class Parser {
  constructor(
    public readonly name: string,
    public readonly lexer: Lexer,
    public readonly rules: ParserRule[] = [],
  ) {}
  
  toAntlr(): string {
    return `parser grammar ${this.name};\n\n` +
      `options { tokenVocab = ${this.lexer.name}; }\n\n` +
      this.rules.map(r => r.toAntlr()).join('\n') + '\n'
  }
  
  static create(name: string, lexer: Lexer, rules: ParserDef): ParserBuilder {
    return new ParserBuilder(name, lexer).rules(rules);
  }
}

class ParserBuilder {
  constructor(
    public _name: string,
    public _lexer: Lexer,
    public _rules: ParserRuleMap = {},
  ) {}
  
  rules(rules: ParserDef) {
    mergeRules(this._rules, typeof rules === 'function' ? rules(createAPI()) : rules);
    return this;
  }
  
  build(): Parser {
    return new Parser(
      this._name,
      this._lexer,
      this.buildRules(this._rules),
    );
  }
  
  protected buildRules(map: ParserRuleMap): ParserRule[] {
    const rules: ParserRule[] = [];
    for (const name in map) {
      rules.push(
        ParserRuleBuilder.from(map[name]).build(name)
      );
    }
    return rules;
  }
}

class ParserRuleBuilder {
  constructor(
    public _mode: string | undefined,
    public _match: ParserMatcher | MatchAnyLabels,
  ) {}
  
  build(name: string): ParserRule {
    return {
      name,
      match: this._match as any,
      
      toAntlr() {
        return `${this.name}: ${this.match.toAntlr()};`;
      },
    }
  }
  
  static from(elem: MatchElement | MatchAnyLabels | ParserRuleBuilder, mode?: string): ParserRuleBuilder {
    if (elem instanceof ParserRuleBuilder) return elem;
    return new ParserRuleBuilder(
      mode,
      parseMatchElement(elem),
    );
  }
}

class ParserRuleOption {
  constructor(public match: ParserMatcher, public _assoc: 'left' | 'right' = 'left') {}
  
  assoc(value: 'left' | 'right') {
    return new ParserRuleOption(this.match, value);
  }
}

type ParserDef = ParserRuleMap | ((api: ParserAPI) => ParserRuleMap);

const common = <T extends object>(obj: T) => createMatcher.pin(parseMatchElements)(obj);
export type ParserAPI = ReturnType<typeof createAPI>;
export type ParserAPIConfig = {
  /** The NL token the parser will use with convenience methods. */
  NL: Matchers['token'];
}

function createAPI(mode?: string) {
  let config: ParserAPIConfig = {
    NL: undefined as any,
  };
  
  function api(match: MatchElement): ParserMatcher;
  function api(...matches: MatchElement[]): Matchers['&'];
  function api(...matches: MatchElement[]): any {
    if (matches.length === 0) throw Error('No matches provided');
    if (matches.length === 1) return parseMatchElements(matches)[0];
    return api.seq(...matches);
  }
  
  /** Configure various behaviors of this parser API instance. */
  api.config = (cfg: Partial<ParserAPIConfig>) => {
    config = {
      ...config,
      ...cfg,
    };
    return api;
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
  
  /** Rename a given matcher with the given `name`. If the name ends on `[]`, it'll collect all values assigned to the same alias. */
  api.alias = (name: string, ...match: Matchers['token'][]): Matchers['alias'] => {
    if (!match.length) throw Error('Alias needs at least one matcher');
    const result = common({
      type: 'alias' as const,
      name,
      match,
      toAntlr(): string {
        const match = this.match.length === 1
          ? this.match[0].toAntlr()
          : '(' + this.match.map(m => m.toAntlr()).join(' | ') + ')';
        if (this.name.endsWith('[]')) {
          return `${this.name.substring(0, this.name.length-2)}+=${match}`;
        } else {
          return `${this.name}=${match}`;
        }
      },
    })
    return result;
  }
  
  /** Various options with labels.
   * 
   * This is effectively a special `$.or` which can only occur at the root level of a rule, and each of its options
   * **must** have a label.
   * 
   * ## Usage
   * ```typescript
   * Parser.create('ExampleParser', lexer, $ => ({
   *   expr: $.options({
   *     AddExpr: $($.T.Identifier, $.or($.T.Plus, $.T.Dash), $.T.Identifier),
   *     MulExpr: $($.T.Identifier, $.or($.T.Slash, $.T.Star), $.T.Identifier),
   *   })
   * }));
   * ```
   */
  api.options = (options: OptionMap): MatchAnyLabels => {
    const opts = Object.entries(options).map(([label, match]) => ({
      label,
      match: 'type' in match ? new ParserRuleOption(match) : match,
    }));
    
    return {
      type: '|+',
      match: opts.map(opt => ({
        label: opt.label,
        match: opt.match.match,
        assoc: opt.match._assoc,
      })),
      
      toAntlr() {
        const options = this.match.map(m => ({
          match: `<assoc=${m.assoc}> ${m.match.toAntlr()}`,
          label: m.label,
        }));
        
        const maxlen = options.reduce((prev, { match: { length: curr }}) => curr > prev ? curr : prev, 0);
        
        return `\n\t  ` +
          options.map(
            o => `${o.match.padEnd(maxlen)} # ${o.label}`
          ).join('\n\t| ');
      },
    }
  }
  
  /** Special labeled option with additional exposed modifiers such as `.assocRight()`. */
  api.option = (...match: MatchElement[]): ParserRuleOption => {
    return new ParserRuleOption(api(...match), 'left');
  }
  
  /** Negate given matches. Anything matches but these. */
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
  
  /** Explicitly wrap given matches in a `ParserRuleBuilder` which exposes additional rule-level operations. */
  api.rule = (...match: MatchElement[]) => new ParserRuleBuilder(mode, api(...match));
  
  /** Match one or more occurrences of `repeat`, with a `join` inbetween each `repeat`.
   * 
   * If `multiline` is true, inserts `NL` tokens around each `join`. The nl token can be configured
   * with `$.config({ NL: ... })`.
   */
  api.many = (repeat: MatchElement, join: MatchElement, multiline = false) => {
    if (!multiline)
      return api(repeat, api(join, repeat).star);
    const { NL } = config;
    return api(repeat, api(NL.star, join, NL.star, repeat).star);
  }
  
  /** Match any one named token. Token name must be capitalized. Combine with other matchers. */
  api.T = MatchTokenFactory(parseMatchElements, 'token');
  /** match any one named rule. Rule name must be lowercase. Combine with other matchers. */
  api.r = MatchTokenFactory(parseMatchElements, 'rule');
  
  /** Match the End of File */
  api.EOF = ((): Matchers['EOF'] => {
    const result = common({
      type: 'EOF' as const,
      toAntlr() { return 'EOF' },
    });
    return result;
  })();
  
  config.NL = api.T.NL;
  return api;
}

type ParserRuleMap = Record<string, MatchElement | MatchAnyLabels | ParserRuleBuilder>;

type MatchElement = ParserMatcher;
type MatchTokenFactory = Record<string, Matchers['token']>;

const parseMatchElements: ProcessMatchElements<ParserMatchExtra, ParserMatcherType> =
  matches => matches.map(el => parseMatchElement(el));

function parseMatchElement<T extends ParserMatcher>(match: T): T;
function parseMatchElement(match: MatchAnyLabels): MatchAnyLabels;
function parseMatchElement(match: MatchElement): ParserMatcher;
function parseMatchElement(match: MatchElement | MatchAnyLabels): ParserMatcher | MatchAnyLabels;
function parseMatchElement(match: MatchElement | MatchAnyLabels) {
  if (typeof match === 'string')
    throw Error('Literals are no longer valid in Parser grammar. Please define them in your Lexer and use Tokens instead.');
  
  if (match && 'length' in match && typeof match.length === 'number')
    throw Error('Character ranges are no longer valid in Parser grammar.');
  
  return match;
}
