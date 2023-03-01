import { ASTMap } from '../utils';
import type { AnyVisitor, ASTNodeBase, Fn, OptionsASTNode, RuleASTNode, VisitorASTNodes } from './types';

type NodeMap = {
  [K: string]: ASTNodeBase;
}
type NodeMapFrom<V extends AnyVisitor> = ASTMap<V>;
type Nodes<V extends AnyVisitor> = VisitorASTNodes<V>;

type TransformNodeMap<M extends NodeMap, Type extends keyof M, R extends ASTNodeBase> =
  Omit<M, Type> & { [K in Type]: R };
type TransformNode<M extends NodeMap, N extends ASTNodeBase, Type extends keyof M, R extends ASTNodeBase> =
  N['type'] extends Type ? R
  : N extends OptionsASTNode
  ? (
    & Omit<N, 'children' | 'option'>
    & {
        option: TransformNode<M, N['option'], Type, R>;
        children: [TransformNode<M, N['option'], Type, R>];
      }
    )
  : N extends RuleASTNode
  ? (
    & Omit<N, 'children' | 'rules'>
    & { children: TransformNode<M, N['children'][number], Type, R>[] }
    & (
        N extends { rules: any }
        ? { rules: { [K in keyof N['rules']]: TransformNode<M, N['rules'][K][number], Type, R>[] } }
        : {}
      )
    )
  : never;

/** Abstract representation of an entire Abstract Syntax Tree. */
export class AST<M extends NodeMap, Root extends ASTNodeBase> {
  constructor(private _root: Root) {}
  
  transform<Type extends keyof M, R extends ASTNodeBase>(
    type: Type,
    sub: (node: M[Type]) => R,
  ): AST<TransformNodeMap<M, Type, R>, TransformNode<M, Root, Type, R>>
  {
    return new AST(this._inner_transform(type, this._root, sub));
  }
  
  private _inner_transform(type: keyof M, node: ASTNodeBase, sub: Fn): any {
    if (node.type === type) {
      return this._basic_transform(type, sub(node), sub);
    } else {
      return this._basic_transform(type, node, sub);
    }
  }
  
  private _basic_transform(type: keyof M, node: ASTNodeBase, sub: Fn): any {
    if (node.family === 'options') {
      node.option = this._inner_transform(type, node.option, sub) as any;
      node.children = [node.option];
    }
    else {
      node.children = node.children.map(child => this._inner_transform(type, child, sub));
      if ('rules' in node) {
        for (const key in node.rules) {
          node.rules[key] = node.rules[key].map((child: any) => this._inner_transform(type, child, sub));
        }
      }
    }
    return node;
  }
  
  find<Type extends keyof M>(type: Type): M[Type][] {
    return [...this._inner_find(type, this._root)] as any;
  }
  
  private _inner_find(type: keyof M, node: ASTNodeBase, set = new Set<ASTNodeBase>()) {
    if (node.type === type) set.add(node);
    if (node.family === 'options') {
      this._inner_find(type, node.option, set);
    } else {
      node.children.forEach(child => this._inner_find(type, child, set));
    }
    return set;
  }
  
  static from<M extends AnyVisitor, Root extends Nodes<M>>(visit: M, root: Root) {
    return new AST<NodeMapFrom<M>, Root>(root);
  }
  
  get root() { return this._root; }
}
