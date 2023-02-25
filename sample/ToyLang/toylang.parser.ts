import { Parser } from '../../src/langkit';
import lexer from './toylang.lexer';

const parser = Parser.create('ToyParser', lexer, $ => {
  const { EOF, r, T } = $;
  const { expr, exprx } = r;
  const { COMMA, LPAREN, RPAREN, LBRACE, RBRACE, LBRACK, RBRACK, NL, Ident } = T;
  const nls = NL.star;
  
  return {
    program: $(
      r.cmdsep.star,
      $(r.import_, $.or(r.cmdsep.plus, EOF)).star,
      $(r.root, $.or(r.cmdsep.plus, EOF)).star,
      EOF,
    ),
    
    // $.options is a special $.or which may only appear on the root level of a rule.
    // Its keys are the labels for the options under which they will be available
    // to your processing pipeline.
    root: $.options({
      FunctionDefRoot: r.fnDef,
      ExprxRoot: exprx,
      FnCallNakedRoot: r.fnCallNaked,
    }),
    import_: $(T.IMPORT, T.String),
    cmdsep: $.or(NL, T.SEMIC),
    
    expr: $.options({
      GroupExpr:          $(LPAREN, expr, RPAREN),
      BinaryOpExpr:       $.option(expr, r.binaryOp, expr).assoc('right'),
      AssignExpr:         $.option(Ident, T.ASSIGNOP, expr).assoc('right'),
      ArrowFnExpr:        r.fnArrow,
      FnCallParenExpr:    r.fnCallParen,
      LetExpr:            r.let,
      ForLoopExpr:        r.forLoop,
      WhileLoopExpr:      r.whileLoop,
      UnaryOpExpr:        $(r.unaryOp, expr),
      ExclusiveRangeExpr: $(expr, T.DOTS2, expr),
      InclusiveRangeExpr: $(expr, T.DOTS3, expr),
      SubscriptExpr:      $(expr, LBRACK, expr, RBRACK),
      PropExpr:           $(expr, $(T.DOT, Ident).plus),
      LiteralExpr:        r.literal,
      IdentExpr:          Ident,
      BlockExpr:          r.block,
      ReturnExpr:         $(T.RETURN, exprx.optional),
    }),
    exprx: $.options({
      ExprExprx: expr,
      IfExprx: r.ifStmt, // `if` is a reserved keyword, so we use `ifStmt` instead
    }),
    unaryOp: $(T.EXCL, T.TILDE),
    binaryOp: $.or(
      T.PLUS, T.DASH, T.STAR, T.SLASH, T.PERCENT,
      T.EQ, T.NEQ, T.GTE, T.GT, T.LTE, T.LT,
      Ident,
    ),
    
    let: $(T.LET, $.alias('variableName', Ident), $(T.ASSIGN, $.alias('variableValue', exprx)).optional),
    
    literal: $.options({
      BooleanLiteral: $.or(T.TRUE, T.FALSE),
      NumberLiteral: T.Number,
      StringLiteral: T.String,
      TemplateStringLiteral: r.templateString,
      SymbolLiteral: $(T.COLON, Ident),
      ArrayLiteral: r.array,
      TupleLiteral: r.tuple,
    }),
    array: $(LBRACK, $.list(exprx, COMMA).optional, RBRACK).inbetween(NL.star),
    tuple: $.or(
      $(LPAREN, NL.star, RPAREN), // ()
      $(LPAREN, expr, COMMA, RPAREN).inbetween(NL.star), // (value0,)
      $(LPAREN, $.list(expr, COMMA), RPAREN).inbetween(NL.star), // (value0, value1, ...)
    ),
    templateString: $(
      T.Tick,
      $.or(
        T.EscapeSequence,
        r.stringInterpolation,
        T.TplStringContent.plus,
      ).star,
      T.Tick,
    ),
    stringInterpolation: $(T.InterpolationStart, exprx, T.InterpolationEnd).inbetween(nls),
    
    ifStmt: $(
      T.IF,
      $.alias('condition[]', expr),
      $.alias('ifBranch', exprx),
      $(T.ELSE, T.IF, $.alias('condition[]', expr), $.alias('elseIfBranch[]', exprx)).inbetween(nls),
      $(T.ELSE, $.alias('elseBranch', exprx)).inbetween(nls).optional,
    ).inbetween(nls),
    
    fnArg: $(Ident, $(T.ASSIGN, exprx).optional),
    fnArgs: $.or(
      $(r.posArgs, $(COMMA, NL.star, r.varArgs).optional),
      r.varArgs,
    ).wrap(NL.star),
    posArgs: $.list(r.fnArg, COMMA),
    varArgs: $(Ident, T.DOTS3),
    
    fnDef: $(
      $.alias('fnName', Ident),
      $.or(r.fnArgs.optional, $(LPAREN, r.fnArgs.optional, RPAREN)),
      $(T.IF, $.alias('condition', expr)).optional,
      $.or(
        $(T.COLON, exprx),
        T.DOT,
      ),
    ),
    
    fnArrow: $(LPAREN, r.fnArgs.optional, RPAREN, T.FAT_ARROW, exprx),
    
    block: $(
      NL.star,
      LBRACE,
      NL.star,
      $(r.blockBody, $.or(NL, T.SEMIC)).star.lazy,
      RBRACE,
    ),
    blockBody: $.or(
      exprx,
      r.fnCallNaked,
    ),
    
    fnCallParen: $(Ident, LPAREN, $(r.fnCallArg, $(COMMA, r.fnCallArg).star.lazy).optional, RPAREN),
    fnCallNaked: $.or(
      $(Ident, $.or(r.fnCallNaked, r.fnCallParen)),
      $(Ident, r.fnCallArg, $(COMMA, r.fnCallArg).star.lazy),
    ),
    fnCallArg: $.or(r.spread, expr),
    spread: $(T.DOTS3, expr),
    
    forLoop: $(T.FOR, Ident, T.IN, $.alias('source', expr), $.alias('body', expr)),
    whileLoop: $(T.WHILE, $.alias('condition', expr), $.alias('body', expr)),
  }
})
.build();
export default parser;
