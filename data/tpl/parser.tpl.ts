import { CharStreams, CommonTokenStream } from 'antlr4ts';
import { BaseVisitor } from './visitor';

export class Parser {
	constructor(public _lexer: AntlrLexer, public _parser: AntlrParser) {
	}

	public buildAST(): AST {
		let tree = this._parser.grammarSpec();
		let visitor = new BaseVisitor();
		return visitor.visitGrammarSpec(tree);
	}

	public static fromString(source: string): Parser {
		let antlrLexer = new AntlrLexer(CharStreams.fromString(source));
		let antlrParser = new AntlrParser(new CommonTokenStream(antlrLexer));
		return new Parser(antlrLexer, antlrParser);
	}

	public static parse(source: string): AST {
		return Parser.fromString(source).buildAST();
	}
}
