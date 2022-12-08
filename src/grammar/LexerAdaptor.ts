import {Lexer, Token} from 'antlr4ts';
import {ANTLRv4Lexer} from "./ANTLRv4Lexer";

export default class LexerAdaptor extends ANTLRv4Lexer {

	public insideOptionsBlock: boolean = false;


	handleBeginArgument() {
		if (this.inLexerRule()) {
			this.pushMode(ANTLRv4Lexer.LexerCharSet);
			this.more();
		} else {
			this.pushMode(ANTLRv4Lexer.Argument);
		}
	}

	handleEndArgument() {
		this.popMode();
		if (this._modeStack.size > 0) {
			this._type = ANTLRv4Lexer.ARGUMENT_CONTENT;
		}
	}

	handleEndAction() {
		var oldMode = this._mode;
		var newMode = this.popMode();
		var isActionWithinAction = this._modeStack.size > 0
			&& newMode == ANTLRv4Lexer.TargetLanguageAction
			&& oldMode == newMode;

		if (isActionWithinAction) {
			this._type = ANTLRv4Lexer.ACTION_CONTENT;
		}
	}

	inLexerRule() {
		return this.type == ANTLRv4Lexer.TOKEN_REF;
	}

	inParserRule() { // not used, but added for clarity
		return this.type == ANTLRv4Lexer.RULE_REF;
	}

	reset() {
		this.type = Token.INVALID_TYPE;
		this.insideOptionsBlock = false;
		super.reset();
	}
}
