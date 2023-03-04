import type { BaseTransformer, TransformVisitorFromBase } from './transform/transformer';

export type Fn<Args extends any[] = any[], R = any> = (...args: Args) => R;
export type Defined<T> = T extends undefined | null | never ? never : T;

/** Visitor taking any single one input and producing some AST-like output */
export type AnyVisitor = {
  [K: string]: (ctx: any) => ASTNodeBase;
}

export type VisitorASTNodes<V extends AnyVisitor> = ReturnType<V[keyof V]>;
export type TransformerASTNodes<T extends BaseTransformer<any, any>> = VisitorASTNodes<TransformVisitorFromBase<T>>;
export type ASTNodeBase = RuleASTNode | OptionsASTNode;
export type RuleASTNode = {
  type: string;
  family: 'rule';
  rules?: Record<string, ASTNodeBase[]>;
  children: ASTNodeBase[] | never[];
}
export type OptionsASTNode = {
  type: string;
  family: 'options';
  option: ASTNodeBase;
  children: [ASTNodeBase];
};
