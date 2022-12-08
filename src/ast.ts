export class GrammarSpec {
	constructor(
		public grammarType: string,
		public identifier: string,
		public rules: ParserRule[]) {
	}

	public toString(): string {
		return `${this.grammarType} ${this.identifier} { ${this.rules.join('\n')} }`;
	}
}

export class ParserRule {
	constructor(public name: string, public rule: Block) {
	}

	toString(): string {
		return `${this.name}: ${this.rule};`;
	}
}

export class Alt {
	constructor(public elements: Element[], public label?: string) {
	}

	toString(): string {
		return this.elements.map(x => x.toString()).join(" ") + (this.label ? ` # ${this.label}` : "");
	}
}

export class Block {
	constructor(public alts: Alt[]) {
	}

	toString(): string {
		return this.alts.map(x => x.toString()).join(" | ");
	}
}

export type _Element = Atom | LabeledElement | Block;
export type Wrapper = (x: _Element) => WrappedElement<_Element>;
export type WrappedElement<T extends _Element> = Optional<T> | ZeroOrMore<T> | OneOrMore<T>;
export type Element = _Element | WrappedElement<_Element>;


export class LabeledElement {
	public _type: 'LabeledElement' = 'LabeledElement';

	constructor(public assignOp: AssignOp, public label: string, public element: Atom | Block) {
	}

	toString(): string {
		return "(" + this.label + this.assignOp + this.element.toString() + ")";
	}
}

export enum AssignOp {
	ASSIGN = "=",
	PLUS_ASSIGN = "+="
}

export enum Suffix {
	QUESTION = "?",
	STAR = "*",
	PLUS = "+"
}

export class Optional<T extends _Element> {
	constructor(public element: T, public optional: boolean = false) {
	}

	toString(): string {
		return this.element.toString() + "?";
	}
}

export class ZeroOrMore<T extends _Element> {
	constructor(public element: T, public optional: boolean = false) {
	}

	toString(): string {
		return this.element.toString() + "*";
	}
}

export class OneOrMore<T extends _Element> {
	constructor(public element: T, public optional: boolean = false) {
	}

	toString(): string {
		return this.element.toString() + "+";
	}
}


export class RuleRef {
	constructor(public text: string) {
	}

	toString(): string {
		return this.text;
	}
}

export class Terminal {
	constructor(public text: string, public ty: TerminalType) {
	}

	toString(): string {
		return this.text;
	}
}

export enum TerminalType {
	STRING_LITERAL = "string_literal",
	TOKEN_REF = "token_ref",
}

export class TextSetElement {
	constructor(public text: string, public ty: SetElementType) {
	}

	toString(): string {
		return this.text;
	}
}

export enum SetElementType {
	STRING_LITERAL = "string_literal",
	TOKEN_REF = "token_ref",
	LEXER_CHAR_SET = "lexer_char_set",
}

export class CharacterRange {
	constructor(public start: string, public end: string) {
	}

	toString(): string {
		return `[${this.start}-${this.end}]`;
	}
}

export type SetElement = TextSetElement | CharacterRange;

export class NotSet {
	constructor(public setElement: SetElement | SetElement[]) {
	}

	toString(): string {
		return `~${this.setElement.toString()}`;
	}
}

export class Dot {
	constructor() {
	}

	toString(): string {
		return ".";
	}
}

export type Atom = Terminal | RuleRef | Dot | NotSet;
