import { CharStreams, CommonTokenStream } from 'antlr4ts';
import { Visitor } from './Visitor';

export class Parser {
	constructor(public _lexer: AntlrLexer, public _parser: AntlrParser) {
	}

	public buildAST() {
		let tree = this._parser.root();
		let visitor = new Visitor();
		return visitor.visit(tree);
	}

	public static fromString(source: string): Parser {
		let antlrLexer = new AntlrLexer(CharStreams.fromString(source));
		let antlrParser = new AntlrParser(new CommonTokenStream(antlrLexer));
		return new Parser(antlrLexer, antlrParser);
	}

	public static parse(source: string) {
		return Parser.fromString(source).buildAST();
	}
}
