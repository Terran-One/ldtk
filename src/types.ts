import { ParserRuleContext } from 'antlr4ts';
import { TerminalNode } from 'antlr4ts/tree/TerminalNode';

export { ParserRuleContext };

export type Fn<Args extends any[] = any[], R = any> = (...args: Args) => R;
export type Defined<T> = T extends undefined | null | never ? never : T;

export type ASTNodeBase = IRuleASTNode | IOptionsASTNode | IVirtualASTNode;

/** A location within a source code. */
export interface Location {
  startIndex: number;
  stopIndex: number;
  startLine: number;
  stopLine: number;
  startColumn: number;
  stopColumn: number;
}

interface ASTNodeCommon {
  type: string;
  family: 'rule' | 'options' | 'virtual';
  ctx?: ParserRuleContext;
  children: ASTNodeBase[];
  location?: Location;
}

export interface IRuleASTNode extends ASTNodeCommon {
  family: 'rule';
  rules: Record<string, ASTNodeBase[]>;
  tokens: Record<string, TerminalNode[]>;
}

export interface IOptionsASTNode extends ASTNodeCommon {
  family: 'options';
  option: ASTNodeBase;
}

export interface IVirtualASTNode extends ASTNodeCommon {
  family: 'virtual';
}

export class RuleASTNode<
  Type extends string = string,
  Rules extends string = string,
  Tokens extends string = string,
> implements IRuleASTNode
{
  family = 'rule' as const;
  children: ASTNodeBase[];
  location: Location;
  
  constructor(
    public type: Type,
    public ctx: ParserRuleContext,
    public rules: Record<Rules, ASTNodeBase[]>,
    public tokens: Record<Tokens, TerminalNode[]>,
  ) {
    this.children = (Object.values(rules) as ASTNodeBase[]).flat();
    this.location = contextLocation(ctx);
  }
}

export class OptionsASTNode<Type extends string = string> implements IOptionsASTNode {
  family = 'options' as const;
  children: ASTNodeBase[];
  location: Location;
  
  constructor(
    public type: Type,
    public ctx: ParserRuleContext,
    public option: RuleASTNode,
  ) {
    this.children = [option];
    this.location = contextLocation(ctx);
  }
}

export function contextLocation(ctx: ParserRuleContext): Location {
  const { start, stop } = ctx;
  
  if (!stop) {
    return {
      startIndex: start.startIndex,
      stopIndex: start.startIndex,
      startLine: start.line,
      stopLine: start.line,
      startColumn: start.charPositionInLine,
      stopColumn: start.charPositionInLine,
    }
  } else {
    return {
      startIndex: start.startIndex,
      stopIndex: stop.stopIndex,
      startLine: start.line,
      stopLine: stop.line,
      startColumn: start.charPositionInLine,
      stopColumn: stop.charPositionInLine + (stop.stopIndex - stop.startIndex),
    };
  }
}

export function tokensLocation(tokens: TerminalNode[]): Location {
  const first = tokens[0].symbol;
  const last = tokens[tokens.length-1].symbol;
  
  return {
    startIndex: first.startIndex,
    stopIndex: last.stopIndex,
    startLine: first.line,
    stopLine: last.line,
    startColumn: first.charPositionInLine,
    stopColumn: last.charPositionInLine + (last.stopIndex - last.startIndex),
  }
}
