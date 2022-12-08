import {AbstractParseTreeVisitor} from "antlr4ts/tree";
import * as AST from "./ast";
import {_Element, SetElementType, TerminalType} from "./ast";
import {
	Action_Context,
	ActionBlockContext,
	ActionScopeNameContext,
	AlternativeContext,
	AltListContext,
	ArgActionBlockContext,
	AtomContext,
	BlockContext,
	BlockSetContext,
	BlockSuffixContext,
	ChannelsSpecContext,
	CharacterRangeContext,
	DelegateGrammarContext,
	DelegateGrammarsContext,
	EbnfContext,
	EbnfSuffixContext,
	ElementContext,
	ElementOptionContext,
	ElementOptionsContext,
	ExceptionGroupContext,
	ExceptionHandlerContext,
	FinallyClauseContext,
	GrammarDeclContext,
	GrammarSpecContext,
	IdentifierContext,
	IdListContext,
	LabeledAltContext,
	LabeledElementContext,
	LabeledLexerElementContext,
	LexerAltContext,
	LexerAltListContext,
	LexerAtomContext,
	LexerBlockContext,
	LexerCommandContext,
	LexerCommandExprContext,
	LexerCommandNameContext,
	LexerCommandsContext,
	LexerElementContext,
	LexerElementsContext,
	LexerRuleBlockContext,
	LexerRuleSpecContext,
	LocalsSpecContext,
	ModeSpecContext,
	NotSetContext,
	OptionContext,
	OptionsSpecContext,
	OptionValueContext,
	ParserRuleSpecContext,
	PrequelConstructContext,
	RuleActionContext,
	RuleAltListContext,
	RuleBlockContext,
	RuleModifierContext,
	RuleModifiersContext,
	RulePrequelContext,
	RulerefContext,
	RuleReturnsContext,
	RulesContext,
	RuleSpecContext,
	SetElementContext,
	Terminal_Context,
	ThrowsSpecContext,
	TokensSpecContext
} from "./grammar/ANTLRv4Parser";
import {ANTLRv4ParserVisitor} from "./grammar/ANTLRv4ParserVisitor";

const id = (x: any) => x;

export class ANTLRv4ASTVisitor extends AbstractParseTreeVisitor<any> implements ANTLRv4ParserVisitor<any> {
	protected defaultResult(): any {
		return null;
	}

	visitGrammarSpec(ctx: GrammarSpecContext): AST.GrammarSpec {
		let grammarDecl = this.visitGrammarDecl(ctx.grammarDecl());
		let rules = this.visitRules(ctx.rules());
		return new AST.GrammarSpec(
			grammarDecl.grammarType,
			grammarDecl.identifier,
			rules
		);

	}

	visitGrammarDecl(ctx: GrammarDeclContext): any {
		return {
			grammarType: this.visit(ctx.grammarType()),
			identifier: this.visit(ctx.identifier())
		}
	}

	visitPrequelConstruct(ctx: PrequelConstructContext): any {
		return null;
	}

	visitOptionsSpec(ctx: OptionsSpecContext): any {
		return null;
	}

	visitDelegateGrammars(ctx: DelegateGrammarsContext): any {
		return null;
	}

	visitTokensSpec(ctx: TokensSpecContext): any {
		return null;
	}

	visitChannelsSpec(ctx: ChannelsSpecContext): any {
		return null;
	}

	visitAction_(ctx: Action_Context): any {
		return null;
	}

	visitIdList(ctx: IdListContext): string[] {
		return ctx.identifier().map(x => this.visitIdentifier(x))
	}

	visitOption(ctx: OptionContext) {
	}

	visitOptionValue(ctx: OptionValueContext) {
	}

	visitDelegateGrammar(ctx: DelegateGrammarContext) {
	}

	visitActionScopeName(ctx: ActionScopeNameContext) {
	}

	visitActionBlock(ctx: ActionBlockContext) {
	}

	visitArgActionBlock(ctx: ArgActionBlockContext) {

	}

	visitModeSpec(ctx: ModeSpecContext) {

	}

	visitRules(ctx: RulesContext): AST.List<AST.ParserRule> {
		return AST.List.of(ctx.ruleSpec().map(x => this.visitRuleSpec(x)));
	}

	visitRuleSpec(ctx: RuleSpecContext): AST.ParserRule {
		if (ctx.parserRuleSpec()) {
			return this.visitParserRuleSpec(ctx.parserRuleSpec()!);
		} else {
			throw new Error("Not implemented");
		}
	}

	visitParserRuleSpec(ctx: ParserRuleSpecContext): AST.ParserRule {
		let ref = ctx.RULE_REF().text;
		let ruleBlock = this.visitRuleBlock(ctx.ruleBlock());
		return new AST.ParserRule(ref, ruleBlock);
	}

	visitExceptionGroup(ctx: ExceptionGroupContext) {

	}

	visitExceptionHandler(ctx: ExceptionHandlerContext) {

	}

	visitFinallyClause(ctx: FinallyClauseContext) {

	}

	visitRulePrequel(ctx: RulePrequelContext) {

	}

	visitRuleReturns(ctx: RuleReturnsContext) {

	}

	visitThrowsSpec(ctx: ThrowsSpecContext) {

	}

	visitLocalsSpec(ctx: LocalsSpecContext) {

	}

	visitRuleAction(ctx: RuleActionContext) {

	}

	visitRuleModifiers(ctx: RuleModifiersContext) {

	}

	visitRuleModifier(ctx: RuleModifierContext) {

	}

	visitRuleBlock(ctx: RuleBlockContext): AST.Block {
		let alts = this.visitRuleAltList(ctx.ruleAltList());
		return new AST.Block(alts);
	}

	visitRuleAltList(ctx: RuleAltListContext): AST.List<AST.Alt> {
		return AST.List.of(ctx.labeledAlt().map(x => this.visitLabeledAlt(x)));
	}

	visitLabeledAlt(ctx: LabeledAltContext): AST.Alt {
		let alt = this.visitAlternative(ctx.alternative());
		return new AST.Alt(alt.elements, ctx.identifier() ? this.visitIdentifier(ctx.identifier()!) : undefined);
	}

	visitLexerRuleSpec(ctx: LexerRuleSpecContext) {

	}

	visitLexerRuleBlock(ctx: LexerRuleBlockContext) {

	}

	visitLexerAltList(ctx: LexerAltListContext) {

	}

	visitLexerAlt(ctx: LexerAltContext) {

	}

	visitLexerElements(ctx: LexerElementsContext) {

	}

	visitLexerElement(ctx: LexerElementContext) {

	}

	visitLabeledLexerElement(ctx: LabeledLexerElementContext) {

	}

	visitLexerBlock(ctx: LexerBlockContext) {

	}

	visitLexerCommands(ctx: LexerCommandsContext) {

	}

	visitLexerCommand(ctx: LexerCommandContext) {

	}

	visitLexerCommandName(ctx: LexerCommandNameContext) {

	}

	visitLexerCommandExpr(ctx: LexerCommandExprContext) {

	}

	visitAltList(ctx: AltListContext): AST.List<AST.Alt> {
		return AST.List.of(ctx.alternative().map(x => this.visitAlternative(x)));
	}

	visitAlternative(ctx: AlternativeContext): AST.Alt {
		let elements = AST.List.of(ctx.element().map(x => this.visitElement(x)));
		return new AST.Alt(elements);
	}

	visitElement(ctx: ElementContext): AST.Element {
		if (ctx.labeledElement()) {
			let element = this.visit(ctx.labeledElement()!);
			let wrapper = ctx.ebnfSuffix() ? this.visitEbnfSuffix(ctx.ebnfSuffix()!) : id;
			return wrapper(element);
		} else if (ctx.atom()) {
			let element = this.visit(ctx.atom()!);
			let wrapper = ctx.ebnfSuffix() ? this.visitEbnfSuffix(ctx.ebnfSuffix()!) : id;
			return wrapper(element);
		} else if (ctx.ebnf()) {
			return this.visitEbnf(ctx.ebnf()!);
		} else {
			throw new TypeError(`Unknown element type: ${ctx}`);
		}
	}

	visitLabeledElement(ctx: LabeledElementContext): AST.LabeledElement {
		let assignOp = ctx.ASSIGN() ? AST.AssignOp.ASSIGN : AST.AssignOp.PLUS_ASSIGN;
		let identifier = this.visitIdentifier(ctx.identifier()!);
		let element = ctx.atom() ? this.visitAtom(ctx.atom()!) : this.visitBlock(ctx.block()!);
		return new AST.LabeledElement(assignOp, identifier, element);
	}

	visitEbnf(ctx: EbnfContext): AST.Element {
		let block = this.visitBlock(ctx.block());
		let wrapper = ctx.blockSuffix() ? this.visitBlockSuffix(ctx.blockSuffix()!) : id;
		return wrapper(block);
	}

	visitBlockSuffix(ctx: BlockSuffixContext): AST.Wrapper {
		return this.visitEbnfSuffix(ctx.ebnfSuffix());
	}

	visitEbnfSuffix(ctx: EbnfSuffixContext): AST.Wrapper {
		let question = ctx.QUESTION();
		if (question.length === 2) {
			return (x: AST._Element) => new AST.Optional(x, true);
		} else if (ctx.STAR()) {
			return (x: AST._Element) => new AST.ZeroOrMore(x, question.length === 1);
		} else if (ctx.PLUS()) {
			return (x: AST._Element) => new AST.OneOrMore(x, question.length === 1);
		} else if (ctx.QUESTION()) {
			return (x: AST._Element) => new AST.Optional(x, false);
		} else {
			throw new TypeError(`Unknown EBNF suffix: ${ctx}`);
		}
	}

	visitLexerAtom(ctx: LexerAtomContext) {

	}

	visitAtom(ctx: AtomContext): AST.Atom {
		if (ctx.terminal_()) {
			return this.visit(ctx.terminal_()!);
		} else if (ctx.ruleref()) {
			return this.visit(ctx.ruleref()!);
		} else if (ctx.notSet()) {
			return this.visit(ctx.notSet()!);
		} else if (ctx.DOT()) {
			return new AST.Dot();
		} else {
			throw new TypeError("Unknown atom");
		}
	}

	visitNotSet(ctx: NotSetContext): AST.NotSet {
		if (ctx.setElement()) {
			return new AST.NotSet(this.visitSetElement(ctx.setElement()!));
		} else {
			return new AST.NotSet(this.visitBlockSet(ctx.blockSet()!));
		}
	}

	visitBlockSet(ctx: BlockSetContext): AST.List<AST.SetElement> {
		return AST.List.of(ctx.setElement().map(x => this.visitSetElement(x)));
	}

	visitSetElement(ctx: SetElementContext): AST.SetElement {
		if (ctx.TOKEN_REF()) {
			return new AST.TextSetElement(ctx.TOKEN_REF()!.text, SetElementType.TOKEN_REF);
		} else if (ctx.STRING_LITERAL()) {
			return new AST.TextSetElement(ctx.STRING_LITERAL()!.text, SetElementType.STRING_LITERAL);
		} else if (ctx.characterRange()) {
			return this.visitCharacterRange(ctx.characterRange()!);
		} else {
			return new AST.TextSetElement(ctx.LEXER_CHAR_SET()!.text, SetElementType.LEXER_CHAR_SET);
		}
	}

	visitBlock(ctx: BlockContext): AST.Block {
		let alts = this.visitAltList(ctx.altList());
		return new AST.Block(alts);
	}

	visitRuleref(ctx: RulerefContext): AST.RuleRef {
		return new AST.RuleRef(ctx.RULE_REF()!.text);
	}

	visitCharacterRange(ctx: CharacterRangeContext): AST.CharacterRange {
		return new AST.CharacterRange(ctx.STRING_LITERAL(0)!.text, ctx.STRING_LITERAL(1)!.text);
	}

	visitTerminal_(ctx: Terminal_Context): AST.Terminal {
		if (ctx.TOKEN_REF()) {
			return new AST.Terminal(ctx.TOKEN_REF()!.text, TerminalType.TOKEN_REF);
		} else if (ctx.STRING_LITERAL()) {
			return new AST.Terminal(ctx.STRING_LITERAL()!.text, TerminalType.STRING_LITERAL);
		} else {
			throw new TypeError("Unknown terminal type");
		}
	}

	visitElementOptions(ctx: ElementOptionsContext) {

	}

	visitElementOption(ctx: ElementOptionContext) {

	}

	visitIdentifier(ctx: IdentifierContext): string {
		return ctx.text;
	}


}
