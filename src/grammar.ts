function isPOJO(arg: any): arg is object {
	if (arg == null || typeof arg !== 'object') {
		return false;
	}
	const proto = Object.getPrototypeOf(arg);
	if (proto == null) {
		return true; // `Object.create(null)`
	}
	return proto === Object.prototype;
}

function isParenthesized(str: string): boolean {
	return str.startsWith('(') && str.endsWith(')') && (str.match(/\(/g) || []).length === (str.match(/\)/g) || []).length;
}

function group(str: string): string {
	if (isParenthesized(str)) {
		return str;
	} else {
		return '(' + str + ')';
	}
}

export class ParserGrammar<L extends LexerRulesDefn, T extends ParserRulesDefn> {

	public rules: { [name: string]: ParserRule } = {};

	constructor(public name: string, public lexerGrammar: LexerGrammar<L>, defn: T = {} as T) {
		Object.entries(defn).forEach(([name, rule]) => {
			if (isPOJO(rule)) {
				this.rules[name] = new ParserRule(name, new ChoiceWithLabels(Object.entries(rule).map(([label, node]) => ({
					label,
					node
				}))));
			} else {
				this.rules[name] = new ParserRule(name, rule);
			}
		});
	}

	toANTLR(): string {
		let res = `parser grammar ${this.name};\n\n`;
		res += `options { tokenVocab = ${this.lexerGrammar.name}; }\n\n`;
		Object.entries(this.rules).forEach(([name, rule]) => {
			res += `${name}: ${this.nodeToANTLR(rule.rule)};\n`;
		});
		return res;
	}

	nodeToANTLR(node: Node): string {
		if (node instanceof Ref || node instanceof TokenRef) {
			return node.name;
		} else if (node instanceof Sequence) {
			return node.elements.map(x => this.nodeToANTLR(x)).join(' ');
		} else if (node instanceof Choice) {
			return group(`${node.alts.map(x => this.nodeToANTLR(x)).join(' | ')}`);
		} else if (node instanceof ChoiceWithLabels) {
			return `${node.alts.map(x => `${this.nodeToANTLR(x.node)} # ${x.label}`).join(' | ')}`;
		} else if (node instanceof Optional) {
			return group(this.nodeToANTLR(node.element)) + '?';
		} else if (node instanceof ZeroOrMore) {
			return group(this.nodeToANTLR(node.element)) + '*' + (node.greedy ? '' : '?');
		} else if (node instanceof OneOrMore) {
			return group(this.nodeToANTLR(node.element)) + '+' + (node.greedy ? '' : '?');
		} else if (node instanceof AssignChild) {
			return group(`${(node.name)} ${node.assignOp} ${this.nodeToANTLR(node.value)}`);
		} else {
			throw new Error(`Unexpected node type: ${JSON.stringify(node)}`);
		}
	}
}

export class ParserRule {
	constructor(public name: string, public rule: Node) {
	}

	toString(): string {
		return `${this.name}: ${this.rule};`;
	}
}


export function mode(name: string): `__mode__${string}` {
	return ('__mode__' + name) as `__mode__${string}`;
}

type _LexerRulesDefn = {
	[k: string]: any;
}


export type LexerRulesDefn = {
	[k: string]: ({
		[x: string]: LexerRuleDefn
	} | LexerRuleDefn);
};

export type ParserRulesDefn = { [k: string]: Node | object };

export type _TokenNames<T extends LexerRulesDefn> = {
	[k in keyof T]: k extends `__mode__${infer M}` ? keyof T[k] : k;
}

export type _Modes<T extends LexerRulesDefn> = {
	[k in keyof T]: k extends `__mode__${infer M}` ? M : never;
}

export type TokenNames<T extends LexerRulesDefn> = _TokenNames<T>[keyof _TokenNames<T>];
export type TokenRefMap<T extends LexerRulesDefn> = {
	[k in TokenNames<T>]: TokenRef;
}

export type Modes<T extends LexerRulesDefn> = _Modes<T>[keyof _Modes<T>] | 'default';

export type LexerRuleDefn =
	string // literal
	| (string | CharRange)[] // character class
	| Node
	| { pattern: string | (string | CharRange)[] | Node } & LexerRuleCommands;
export type LexerRuleCommands = { skip?: boolean, mode?: string, pushMode?: string, popMode?: boolean, channel?: string | string[] };

export type LexerRule = { name: string, pattern: string | (string | CharRange)[] | Node, commands?: LexerRuleCommands };


export class LexerGrammar<T extends LexerRulesDefn> {
	public modes: { [mode in Modes<T>]: LexerRule[] } = {'default': []} as { [mode in Modes<T>]: LexerRule[] };

	constructor(public name: string, defn: T = {} as T) {
		Object.entries(defn).forEach(([k, v]) => {
			if (k.startsWith('__mode__')) {
				let mode = k.substring('__mode__'.length) as Modes<T>;
				this.modes[mode] = [];
				Object.entries(v as { [_: string]: LexerRuleDefn }).forEach(([m_k, m_v]) => {
					if (typeof m_v === 'string' || Array.isArray(m_v) || m_v instanceof Node) {
						this.modes[mode].push({name: m_k, pattern: m_v});
					} else if (typeof v === 'object') {
						let {pattern, ...commands} = m_v;
						this.modes[mode].push({name: m_k, pattern, commands});
					} else {
						throw new Error(`Invalid Lexer Rule definition for ${m_k}`);
					}
				});
			} else {
				v = v as LexerRuleDefn;
				if (typeof v === 'string' || Array.isArray(v) || v instanceof Node) {
					this.modes['default'].push({name: k, pattern: v});
				} else if (typeof v === 'object') {
					let {pattern, ...commands} = v;
					this.modes['default'].push({name: k, pattern, commands});
				} else {
					throw new Error(`Invalid Lexer Rule definition for ${k}`);
				}
			}
		});
	}

	getTokens(): TokenRefMap<T> {
		let tokens: TokenRefMap<T> = {} as TokenRefMap<T>;
		for (let mode of Object.keys(this.modes) as Modes<T>[]) {
			for (let rule of this.modes[mode]) {
				tokens[rule.name as TokenNames<T>] = new TokenRef(null, mode, rule.name);
			}
		}
		return tokens;
	}

	renderCommands(commands: LexerRuleCommands): string {
		let strs = [];
		if (commands.skip) {
			strs.push('skip');
		}
		if (commands.pushMode !== undefined) {
			strs.push(`pushMode(${commands.pushMode})`)
		}
		if (commands.popMode) {
			strs.push(`popMode`)
		}
		if (commands.mode) {
			strs.push(`mode(${commands.mode})`)
		}
		if (commands.channel !== undefined) {
			if (Array.isArray(commands.channel)) {
				strs.push(`channel(${commands.channel.join(', ')})`);
			} else {
				strs.push(`channel(${commands.channel})`);
			}
		}
		return strs.join(', ');
	}

	toANTLR(): string {
		let res = `lexer grammar ${this.name};\n\n`;
		Object.entries(this.modes).forEach(([mode, rules]) => {
			if (mode === 'default') {
				rules.forEach((rule: LexerRule) => {
					res += `${rule.name}: ${this.nodeToANTLR(rule.pattern)}`;
					if (rule.commands) {
						res += ` -> ${this.renderCommands(rule.commands)}`;
					}
					res += `;\n`;
				});
			} else {
				res += `\nmode ${mode};\n`;
				rules.forEach((rule: LexerRule) => {
					res += `${rule.name}: ${this.nodeToANTLR(rule.pattern)}`;
					if (rule.commands) {
						res += ` -> ${this.renderCommands(rule.commands)}`;
					}
					res += `;\n`;
				});
			}
		});
		return res;
	}

	nodeToANTLR(node: string | (string | CharRange)[] | Node): string {
		if (typeof node === 'string') {
			return `'${node}'`;
		} else if (Array.isArray(node)) { // char class
			return this.nodeToANTLR(new CharClass(null, node));
		} else if (node instanceof Literal) {
			return `'${node.value}'`;
		} else if (node instanceof Sequence) {
			return node.elements.map(x => this.nodeToANTLR(x)).join(' ');
		} else if (node instanceof Choice) {
			return node.alts.map(x => this.nodeToANTLR(x)).join(' | ');
		} else if (node instanceof Optional) {
			return `(${this.nodeToANTLR(node.element)})?`;
		} else if (node instanceof ZeroOrMore) {
			return `(${this.nodeToANTLR(node.element)})*${node.greedy ? '' : '?'}`;
		} else if (node instanceof OneOrMore) {
			return `(${this.nodeToANTLR(node.element)})+${node.greedy ? '' : '?'}`;
		} else if (node instanceof Not) {
			return `~(${this.nodeToANTLR(node.element)})`;
		} else if (node instanceof CharClass) {
			return `[${node.elements.map(x => {
				if (typeof x === 'string') {
					return x;
				} else {
					return `${x.from}-${x.to}`;
				}
			}).join('')}]`;
		} else if (node instanceof CharRange) {
			return `'${node.from}'..'${node.to}'`;
		} else {
			throw new Error(`Unknown node type: ${node.constructor.name}`);
		}
	}
}

export class Node {
	constructor(public parent: Node | null = null) {
	}

	zeroOrMore(greedy: boolean = false): ZeroOrMore {
		return new ZeroOrMore(null, this);
	}

	oneOrMore(greedy: boolean = false): OneOrMore {
		return new OneOrMore(null, this);
	}

	optional(): Optional {
		return new Optional(null, this);
	}
}

export function zeroOrMore(node: Node, greedy: boolean = false): ZeroOrMore {
	return new ZeroOrMore(null, node);
}

export function oneOrMore(node: Node, greedy: boolean = false): OneOrMore {
	return new OneOrMore(null, node);
}

export function optional(node: Node): Optional {
	return new Optional(null, node);
}

export function choice(...alts: Node[]): Choice {
	return new Choice(null, alts);
}

export class ZeroOrMore extends Node {
	constructor(public parent: Node | null, public element: Node, public greedy: boolean = false) {
		super(parent);
	}
}

export class OneOrMore extends Node {
	constructor(public parent: Node | null, public element: Node, public greedy: boolean = true) {
		super(parent);
	}
}

export class Choice extends Node {
	constructor(public parent: Node | null, public alts: Node[]) {
		super(parent);
	}
}

export class Optional extends Node {
	constructor(public parent: Node | null, public element: Node) {
		super(parent);
	}
}

export class ChoiceWithLabels extends Node {
	constructor(public alts: { label: string, node: Node }[]) {
		super();
	}
}

enum AssignOp {
	SET = '=',
	PUSH = '+=',
}

export class Sequence extends Node {
	constructor(public parent: Node | null, public elements: Node[] = []) {
		super(parent);
	}

	static resolveElement(x: string | (string | CharRange)[] | Node): Node {
		if (typeof x === 'string') {
			return new Ref(null, x);
		} else if (Array.isArray(x)) {
			return new CharClass(null, x);
		} else if (isPOJO(x)) {
			let name = Object.keys(x)[0];
			let value = (x as any)[name];
			if (name.startsWith('__push__')) {
				return new AssignChild(null, name.substring(8), AssignOp.PUSH, value);
			}
			return new AssignChild(null, name, AssignOp.SET, value);
		} else {
			return x;
		}
	}

	choice(): Choice {
		return new Choice(null, this.elements);
	}
}

export class Not extends Node {
	constructor(public parent: Node | null, public element: Node) {
		super(parent);
	}
}

export class CharClass extends Node {
	constructor(public parent: Node | null, public elements: (string | CharRange)[] = []) {
		super(parent);
	}
}

export class CharRange extends Node {
	constructor(public parent: Node | null, public from: string, public to: string) {
		super(parent);
	}
}

export class Ref extends Node {
	constructor(public parent: Node | null, public name: string) {
		super(parent);
	}
}

export class TokenRef extends Node {
	constructor(public parent: Node | null, public mode: string, public name: string) {
		super(parent);
	}
}

export class AssignChild extends Node {
	constructor(public parent: Node | null, public name: string, public assignOp: AssignOp, public value: Node) {
		super(parent);
	}
}


export function $(...args: [any, ...any[]]): Sequence {
	return new Sequence(null, args.map(x => Sequence.resolveElement(x)));
}

export function not(el: string | Node): Not {
	if (typeof el === 'string') {
		return new Not(null, new Literal(null, el));
	} else {
		return new Not(el.parent, el);
	}
}

export function push(name: string): `__push__${string}` {
	return `__push__${name}` as const;
}

export class Literal extends Node {
	constructor(public parent: Node | null, public value: string) {
		super(parent);
	}
}

export const TAB = '\\t';
export const NL = '\\n';
export const CR = '\\r';
export const SPACE = ' ';
export const EOF = new TokenRef(null, 'default', 'EOF');
