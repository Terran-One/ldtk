import { AnyMatcher, ChoiceMatcher, EpsilonMatcher, GroupMatcher, IGrammarMatcher, LiteralMatcher, MultipleMatcher, RuleMatcher, SequenceMatcher } from './matchers';

const punctuation = '(){}[]<>/\\=-+*?,;:!@#$%^&~\'"`';
const identifierChars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_';

/** Tagged template function for parsing rules & injecting custom grammar matchers with interpolations. */
export default function rule(strings: TemplateStringsArray, ...args: IGrammarMatcher[]): IGrammarMatcher {
  const strs = strings.map(s => s.trim().replace(/\s+/g, ' '));
  const mixed = zip(strs, args).flat(1).filter(Boolean);
  return new RuleParser(mixed as any[]).parse();
}

enum ParsingResult {
  NotParsed = 0,
  Parsed,
  Terminate,
}

class RuleParser {
  #piece = 0;
  #offset = 0;
  #groupDepth = 0;
  options = {
    caseSensitive: true,
  }
  constructor(private pieces: (string | IGrammarMatcher)[]) {}
  
  parse(): IGrammarMatcher {
    // reset state
    this.#piece = 0;
    this.#offset = 0;
    this.#groupDepth = 0;
    this._normalizePieces();
    return this._parse();
  }
  
  /** Continue parsing at current piece/offset */
  protected _parse(choices = new Choices()) {
    let result = ParsingResult.NotParsed;
    while (result !== ParsingResult.Terminate && this.#piece < this.pieces.length) {
      // cannot use `this._getStringPiece()` b/c we're also trying to handle `IGrammarMatcher`s
      const piece = this.pieces[this.#piece];
      
      if (typeof piece === 'string') {
        result = this._parsePiece(choices);
      } else {
        choices.push(piece);
        this._nextPiece();
      }
    }
    
    return choices.build();
  }
  
  /** Parse the current piece indicated by `this.pieces[this.#piece]` */
  protected _parsePiece(choices: Choices) {
    const piece = this._getStringPiece();
    
    let result = ParsingResult.NotParsed;
    while (result !== ParsingResult.Terminate && this.#offset < piece.length) {
      const c = this.char();
      if (c === ' ') {
        this.nom();
        continue;
      }
      
      result = this._parseWord(choices);
      if (result === ParsingResult.NotParsed) {
        choices.push(this._parseLiteral());
        this._parseSuffix(choices);
      }
    }
    
    if (result !== ParsingResult.Terminate) {
      if (this.#offset < piece.length) throw Error('Expected end of piece');
      this._nextPiece();
    }
    
    return result;
  }
  
  /** Parse a thing between two whitespace breakers */
  protected _parseWord(choices: Choices): ParsingResult {
    const result = this._parsePunctuation(choices);
    if (result === ParsingResult.Parsed)
      this._parseSuffix(choices);
    return result;
  }
  
  /** Parse word-level punctuations */
  protected _parsePunctuation(choices: Choices): ParsingResult {
    const c = this.char();
    switch (c) {
      case '(':
        ++this.#groupDepth;
        this.nom();
        choices.push(new GroupMatcher(this._parse()));
        return ParsingResult.Parsed;
      case ')':
        if (!this.#groupDepth) throw Error('Unmatched closing parenthesis');
        --this.#groupDepth;
        this.nom();
        return ParsingResult.Terminate;
      case '|':
        this.nom();
        choices.pushChoice();
        return ParsingResult.Parsed;
      case "'":
      case '"':
        choices.push(this._parseLiteral(c));
        return ParsingResult.Parsed;
      case '<':
        choices.push(this._parseReference());
        return ParsingResult.Parsed;
      case '>':
        throw Error('Unmatched closing angle bracket');
      case '.':
        this.nom();
        choices.push(new AnyMatcher());
        return ParsingResult.Parsed;
    }
    if (punctuation.includes(c))
      throw Error('Unexpected punctuation: ' + c);
    return ParsingResult.NotParsed;
  }
  
  protected _parseLiteral(quote?: string): LiteralMatcher {
    const piece = this._getStringPiece();
    if (quote && this.nom() !== quote)
      throw Error('Unexpected non-quote character: ' + this.prevChar());
    
    let literal = '';
    // quoted literal
    if (quote) {
      while (this.#offset < piece.length && this.char() !== quote) {
        const c = this.nom();
        
        if (c === '\\') {
          if (++this.#offset >= piece.length)
            throw Error('Unexpected end of string in literal escape');
          literal += this.char();
        }
        else {
          literal += c;
        }
      }
      
      if (this.nom() !== quote)
        throw Error(`Expected closing quote: ${quote}, got ${this.prevChar()}`);
    }
    // word literal
    else {
      while (this.#offset < piece.length && identifierChars.includes(this.char())) {
        literal += this.nom();
      }
    }
    
    return new LiteralMatcher(literal);
  }
  
  protected _parseReference(): RuleMatcher {
    const piece = this._getStringPiece();
    if (this.nom() !== '<')
      throw Error('Unexpected non-angle bracket character: ' + this.prevChar());
    
    const start = this.#offset;
    while (this.#offset < piece.length && identifierChars.includes(this.char()))
      ++this.#offset;
    const end = this.#offset;
    
    if (this.nom() !== '>')
      throw Error('Unexpected non-angle bracket character: ' + this.prevChar());
    
    return new RuleMatcher(piece.slice(start, end));
  }
  
  /** Parse suffix operators, such as multiplicities ('*', '+', '?', '{...}') */
  protected _parseSuffix(choices: Choices) {
    const c = this.char();
    switch (c) {
      case '*':
      case '+': {
        this.nom();
        let lazy = false;
        if (this.char() === '?') {
          this.nom();
          lazy = true;
        }
        choices.swapTail(tail => new MultipleMatcher(tail, c, lazy));
        return ParsingResult.Parsed;
      }
      case '?':
        this.nom();
        choices.swapTail(tail => new MultipleMatcher(tail, '?'));
        return ParsingResult.Parsed;
      case '{':
        this._parseCurlySuffix(choices);
        return ParsingResult.Parsed;
    }
    return ParsingResult.NotParsed;
  }
  
  /** Parse curly braces suffix. Currently only `{min}`, `{min, max}`, and `{,max}` */
  protected _parseCurlySuffix(choices: Choices) {
    const matches = this.match(/\{\s*(\d+,?|\d*\s*,\s*\d+)\s*?\}/);
    if (!matches) throw Error('Invalid curly brace multiplicity syntax');
    
    let min: number, max: number;
    if (matches[1].includes(',')) {
      [min = 0, max = Infinity] = matches[1].split(',').map(s => s.trim()).map(s => s ? parseInt(s) : undefined);
    } else {
      min = max = parseInt(matches[1]);
    }
    if (isNaN(min) || isNaN(max))
      throw Error('Invalid multiplicity min/max');
    
    choices.swapTail(tail => new MultipleMatcher(tail, {min, max}));
  }
  
  /** Advance to the `n`th next piece & reset internal offset */
  protected _nextPiece() {
    ++this.#piece;
    this.#offset = 0;
    return this;
  }
  
  startsWith(s: string) {
    if (this.options.caseSensitive)
      s = s.toLowerCase();
    return this._getStringPiece().startsWith(s, this.#offset);
  }
  
  match(pattern: RegExp) {
    pattern = normalizeRegex(this.options.caseSensitive, pattern);
    return pattern.exec(this._getStringPiece().slice(this.#offset));
  }
  
  protected _normalizePieces() {
    this.pieces = this.pieces.map(p => {
      if (typeof p !== 'string') return p;
      p = p.trim().replace(/\s+/g, ' ');
      if (!this.options.caseSensitive)
        p = p.toLowerCase();
      return p;
    });
  }
  
  protected _getStringPiece(): string {
    const piece = this.pieces[this.#piece];
    if (typeof piece !== 'string') throw Error('Not a string piece');
    return piece;
  }
  
  protected char() { return this._getStringPiece()[this.#offset] }
  protected prevChar() { return this._getStringPiece()[this.#offset-1] }
  protected nom() { return this._getStringPiece()[this.#offset++] }
}

/** Helper class for building a ChoiceMatcher from string rep */
class Choices {
  constructor(public matchers: IGrammarMatcher[][] = [[]]) {}
  
  /** Pushes the given `items` to the last  */
  push(...items: IGrammarMatcher[]) {
    this.matchers[this.matchers.length-1].push(...items);
    return this;
  }
  
  pushChoice() {
    this.matchers.push([]);
    return this;
  }
  
  swapTail(cb: (tail: IGrammarMatcher) => IGrammarMatcher) {
    const group = this.matchers[this.matchers.length-1];
    group[group.length-1] = cb(group[group.length-1]);
    return this;
  }
  
  build() {
    return deflateMatcher(
      new ChoiceMatcher(
        this.matchers
          .filter(m => Boolean(m.length))
          .map(m => deflateMatcher(new SequenceMatcher(m)))
      )
    );
  }
}

const zip = <L, R>(lhs: L[], rhs: R[]): [L | undefined, R | undefined][] => lhs.map((l, i) => [l, rhs[i]]);
function normalizeRegex(caseSensitive: boolean, pattern: RegExp): RegExp {
  let source = pattern.source;
  if (!source.startsWith('^')) source = '^' + source;
  return new RegExp(source, caseSensitive ? '' : 'i');
}

/** For `ChoiceMatcher`s & `SequenceMatcher`s, returns their first child if it's their only.
 * If they have no children, return the EpsilonMatcher.
 * For all other matchers, returns the matcher itself.
 */
function deflateMatcher(matcher: IGrammarMatcher): IGrammarMatcher {
  if (matcher instanceof SequenceMatcher || matcher instanceof ChoiceMatcher) {
    if (matcher.matchers.length === 0)
      return EpsilonMatcher.instance;
    if (matcher.matchers.length === 1)
      return deflateMatcher(matcher.matchers[0]);
  }
  return matcher;
}
