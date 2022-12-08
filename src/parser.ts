import {ANTLRv4Parser} from './grammar/ANTLRv4Parser';
import {ANTLRv4Lexer} from './grammar/ANTLRv4Lexer';
import {CharStreams, CommonTokenStream} from 'antlr4ts';
import {ANTLRv4ASTVisitor} from "./visitor";
import * as AST from './ast';

export class GrammarParser {
	constructor(public _lexer: ANTLRv4Lexer, public _parser: ANTLRv4Parser) {
	}

	public buildAST(): AST.GrammarSpec {
		let tree = this._parser.grammarSpec();
		let visitor = new ANTLRv4ASTVisitor();
		return visitor.visitGrammarSpec(tree);
	}

	public static fromString(source: string): GrammarParser {
		let antlrLexer = new ANTLRv4Lexer(CharStreams.fromString(source));
		let antlrParser = new ANTLRv4Parser(new CommonTokenStream(antlrLexer));
		return new GrammarParser(antlrLexer, antlrParser);
	}

	public static parse(source: string): AST.GrammarSpec {
		return GrammarParser.fromString(source).buildAST();
	}

}
