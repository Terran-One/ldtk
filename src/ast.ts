export class Node {
	constructor(public _parent: Node | null = null) {
	}

	setParentForChildren() {
		for (let key in this) {
			if (key !== '_parent' && this[key] instanceof Node) {
				// @ts-ignore
				this[key]._parent = this;
			}

			if (key !== '_parent' && this[key] instanceof List) {
				// @ts-ignore
				this[key].forEach((item: Node) => item._parent = this);
			}
		}
	}

	walkDescendantsDFS(): Node[] {
		let nodes: Node[] = [];
		for (let key in this) {
			if (key !== '_parent' && this[key] instanceof Node) {
				// @ts-ignore
				nodes.push(this[key]);
				// @ts-ignore
				nodes = nodes.concat(this[key].walkDescendantsDFS());
			}
		}
		return nodes;
	}

	walkDescendantsBFS(): Node[] {
		let nodes: Node[] = [];
		let queue: Node[] = [this];
		while (queue.length > 0) {
			let node = queue.shift()!;
			for (let key in node) {
				// @ts-ignore
				if (key !== '_parent' && node[key] instanceof Node) {
					// @ts-ignore
					nodes.push(node[key]);
					// @ts-ignore
					queue.push(node[key]);
				}
			}
		}
		return nodes;
	}

	descendantsWhere(predicate: (node: Node) => boolean): Node[] {
		return this.walkDescendantsDFS().filter(predicate);
	}

	nearestAncestorWhere(predicate: (node: Node) => boolean): Node | null {
		let node: Node | null = this;
		while (node !== null && !predicate(node)) {
			node = node._parent;
		}
		return node;
	}

}


export class List<T extends Node> extends Node {
	constructor(public items: T[]) {
		super();
		this.setParentForChildren();
	}

	walkDescendantsDFS(): Node[] {
		let nodes: Node[] = [];
		for (let item of this.items) {
			nodes.push(item);
			nodes = nodes.concat(item.walkDescendantsDFS());
		}
		return nodes;
	}

	walkDescendantsBFS(): Node[] {
		let nodes: Node[] = [];
		let queue: Node[] = this.items;
		while (queue.length > 0) {
			let node = queue.shift()!;
			for (let key in node) {
				// @ts-ignore
				if (key !== '_parent' && node[key] instanceof Node) {
					// @ts-ignore
					nodes.push(node[key]);
					// @ts-ignore
					queue.push(node[key]);
				}
			}
		}
		return nodes;
	}

	static empty<T extends Node>(): List<T> {
		return new List<T>([]);
	}

	static of<T extends Node>(items: T[]): List<T> {
		return new List<T>(items);
	}

	map<U>(fn: (item: T) => U): U[] {
		return this.items.map(fn);
	}

	forEach(fn: (item: T) => void): void {
		this.items.forEach(fn);
	}

}

export class GrammarSpec extends Node {
	constructor(
		public grammarType: string,
		public identifier: string,
		public rules: List<ParserRule>) {
		super();
		this.setParentForChildren();
	}

	public toString(): string {
		return `${this.grammarType} ${this.identifier} { ${this.rules.map(x => x.toString()).join('\n')} }`;
	}
}

export class ParserRule extends Node {
	constructor(public name: string, public rule: Block) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return `${this.name}: ${this.rule};`;
	}
}

export class Alt extends Node {
	constructor(public elements: List<Element>, public label?: string) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return this.elements.map(x => x.toString()).join(" ") + (this.label ? ` # ${this.label}` : "");
	}
}

export class Block extends Node {
	constructor(public alts: List<Alt>) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return this.alts.map(x => x.toString()).join(" | ");
	}
}

export type _Element = Atom | LabeledElement | Block;
export type Wrapper = (x: _Element) => WrappedElement<_Element>;
export type WrappedElement<T extends _Element> = Optional<T> | ZeroOrMore<T> | OneOrMore<T>;
export type Element = _Element | WrappedElement<_Element>;

export namespace Element {
	export function isElement(node: Node): node is Element {
		return node instanceof Terminal || node instanceof RuleRef || node instanceof Dot || node instanceof NotSet || node instanceof LabeledElement || node instanceof Block || node instanceof Optional || node instanceof ZeroOrMore || node instanceof OneOrMore;
	}
}


export class LabeledElement extends Node {

	constructor(public assignOp: AssignOp, public label: string, public element: Atom | Block) {
		super();
		this.setParentForChildren();
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

export class Optional<T extends _Element> extends Node {
	constructor(public element: T, public optional: boolean = false) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return this.element.toString() + "?";
	}
}

export class ZeroOrMore<T extends _Element> extends Node {
	constructor(public element: T, public optional: boolean = false) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return this.element.toString() + "*";
	}
}

export class OneOrMore<T extends _Element> extends Node {
	constructor(public element: T, public optional: boolean = false) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return this.element.toString() + "+";
	}
}


export class RuleRef extends Node {
	constructor(public text: string) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return this.text;
	}
}

export class Terminal extends Node {
	constructor(public text: string, public ty: TerminalType) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return this.text;
	}
}

export enum TerminalType {
	STRING_LITERAL = "string_literal",
	TOKEN_REF = "token_ref",
}

export class TextSetElement extends Node {
	constructor(public text: string, public ty: SetElementType) {
		super();
		this.setParentForChildren();
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

export class CharacterRange extends Node {
	constructor(public start: string, public end: string) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return `[${this.start}-${this.end}]`;
	}
}

export type SetElement = TextSetElement | CharacterRange;

export class NotSet extends Node {
	constructor(public setElement: SetElement | List<SetElement>) {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return `~${this.setElement.toString()}`;
	}
}

export class Dot extends Node {
	constructor() {
		super();
		this.setParentForChildren();
	}

	toString(): string {
		return ".";
	}
}

export type Atom = Terminal | RuleRef | Dot | NotSet;
