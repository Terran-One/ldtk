import type { Tail } from './types';

export type Middleware<In, Out> = {
	transform(input: In): Out | Promise<Out>;
}

export type MiddlewareInput<T>  = T extends Middleware<infer In, any> ? In : never;
export type MiddlewareOutput<T> = T extends Middleware<any, infer Out> ? Out : never;

export type MiddlewareStack<In, T extends Middleware<any, any>[]> =
  T extends []
  ? {
      push<Out>(middleware: Middleware<In, Out>): MiddlewareStack<In, [Middleware<In, Out>]>;
      transform(input: In): In;
    }
  : {
      push<Out>(middleware: Middleware<MiddlewareOutput<Tail<T>>, Out>): MiddlewareStack<In, [...T, Middleware<Tail<T>, Out>]>;
      transform(input: In): MiddlewareOutput<Tail<T>>;
    }

export function createMiddlewareStack<In = any>(): MiddlewareStack<In, []> {
  const middlewares: Middleware<any, any>[] = [];
  
  return {
    push(middleware) {
      middlewares.push(middleware);
      return this as any;
    },
    transform(input: In) {
      let result: any = input;
      for (const middleware of middlewares) {
        result = middleware.transform(result);
      }
      return result;
    },
  }
}
