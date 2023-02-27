// DO NOT CHANGE THIS FILE, IT IS AUTOMATICALLY GENERATED
import { TerminalNode } from 'antlr4ts/tree/TerminalNode';

export type VisitorEntry = { entry: (ctx: any) => any };
export type VisitorMap = Record<string, any>;
export type VisitHandler<M extends VisitorMap> = {
  [v in keyof M]: (ctx: any) => M[v];
}

export type RuleASTNode<V extends VisitorMap, Name extends keyof V, Ctx, Rules extends (keyof V)[], Tokens extends string[]> =
  & {
      type: Name;
      family: 'rule';
      ctx: Ctx;
      children: V[Rules[number]][];
    }
  & (
    Rules extends []
    ? {} : {rules: {[rule in Rules[number]]: V[rule][]}}
  )
  & (
    Tokens extends []
    ? {} : {tokens: {[token in Tokens[number]]: TerminalNode[]}}
  )

export type OptionsASTNode<V extends VisitorMap, Name extends keyof V, Ctx, Options extends (keyof V)[]> = {
  type: Name;
  family: 'options';
  ctx: Ctx;
  option: V[Options[number]];
  children: [V[Options[number]]];
}

export type WithEOF = { EOF?: TerminalNode };
