import { ASTMap } from '../utils';
import type { AnyVisitor, ASTNodeBase, Defined, Fn, OptionsASTNode, RuleASTNode, VisitorASTNodes } from './types';

type NodeMap = {
  [K: string]: ASTNodeBase;
}
type NodeMapFrom<V extends AnyVisitor> = ASTMap<V>;
type Nodes<V extends AnyVisitor> = VisitorASTNodes<V>;

type TransformMap<M extends NodeMap> = {
  [K in keyof M]?: (node: M[K]) => ASTNodeBase;
}

type TransformNodeMap<M extends NodeMap, T extends TransformMap<M>> =
  Omit<M, keyof T> & { [K in keyof T]: ReturnType<Defined<T[K]>> };
type TransformNode<M extends NodeMap, T extends TransformMap<M>, N extends ASTNodeBase> =
  N['type'] extends keyof T
  ? TransformNodeGeneric<M, T, ReturnType<Defined<T[N['type']]>>>
  : TransformNodeGeneric<M, T, N>;
type TransformNodeGeneric<M extends NodeMap, T extends TransformMap<M>, N extends ASTNodeBase> =
  N extends OptionsASTNode
  ? (
    & Omit<N, 'children' | 'option'>
    & {
        option: TransformNode<M, T, N['option']>;
        children: [TransformNode<M, T, N['option']>];
      }
    )
  : N extends RuleASTNode
  ? (
    & Omit<N, 'children' | 'rules'>
    & { children: TransformNode<M, T, N['children'][number]>[] }
    & (
        N extends { rules: any }
        ? { rules: { [K in keyof N['rules']]: TransformNode<M, T, N['rules'][K][number]>[] } }
        : {}
      )
    )
  : never;

/** Abstract representation of an entire Abstract Syntax Tree. */
export class AST<M extends NodeMap, Root extends ASTNodeBase> {
  constructor(private _root: Root) {}
  
  transform<T extends TransformMap<M>>(
    transforms: T,
  ): AST<TransformNodeMap<M, T>, TransformNode<M, T, Root>>
  {
    this._root = this._inner_transform(this._root, transforms, new Map());
    return this as any;
  }
  
  private _inner_transform(node: ASTNodeBase, transforms: TransformMap<M>, transformed: Map<ASTNodeBase, ASTNodeBase>): any {
    if (transformed.has(node)) return transformed.get(node);
    
    let newNode: any = node;
    if (node.type in transforms)
      newNode = transforms[node.type]!(node as any);
    transformed.set(node, newNode);
    return this._basic_transform(newNode, transforms, transformed);
  }
  
  private _basic_transform(node: ASTNodeBase, transforms: TransformMap<M>, transformed: Map<ASTNodeBase, ASTNodeBase>): any {
    if (node.family === 'options') {
      node.option = this._inner_transform(node.option, transforms, transformed);
      node.children = [node.option];
    }
    else {
      node.children = node.children.map(child => this._inner_transform(child, transforms, transformed));
      if ('rules' in node) {
        for (const key in node.rules) {
          node.rules[key] = node.rules[key].map((child: any) => this._inner_transform(child, transforms, transformed));
        }
      }
    }
    return node;
  }
  
  /** Find direct children of this represented AST's root of given `type`. */
  find<Type extends keyof M>(type: Type): M[Type][] {
    return this.root.children.filter(child => child.type === type) as any;
  }
  
  /** Find all nested children of given `type` up until a node of type `before`.
   * 
   * In a tree of this structure:
   * |- A
   *    |- B
   *    |  \- C
   *    \- B
   *       \- C
   *          \-B
   * `findBefore('B', 'C')` would return the two `B` nodes that hierarchically appear before each `C` node.
   */
  findBefore<Type extends keyof M>(type: Type, before: keyof M): M[Type][] {
    return [...this._inner_findBefore(type, before, this._root)] as any;
  }
  
  private _inner_findBefore(type: keyof M, before: keyof M, node: ASTNodeBase, set = new Set<ASTNodeBase>()) {
    if (node.type === before) return set;
    if (node.type === type) set.add(node);
    if (node.family === 'options') {
      this._inner_findBefore(type, before, node.option, set);
    } else {
      node.children.forEach(child => this._inner_findBefore(type, before, child, set));
    }
    return set;
  }
  
  /** Find all nodes of given `type` deeply within the entire represented AST. */
  findDeep<Type extends keyof M>(type: Type): M[Type][] {
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
