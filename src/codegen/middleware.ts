import type { Parser } from 'langkit';
import type { Tail } from './types';

export type Middleware<In, Out> = {
	transform(input: In): Out | Promise<Out>;
}

export type MiddlewareInput<T>  = T extends Middleware<infer In, any> ? In : never;
export type MiddlewareOutput<T> = T extends Middleware<any, infer Out> ? Out : never;

export type MiddlewareStack<T extends Middleware<any, any>[]> =
  T extends []
  ? {
      push<Out>(middleware: Middleware<Parser, Out>): MiddlewareStack<[Middleware<Parser, Out>]>;
      transform(parser: Parser): Parser;
    }
  : {
      push<Out>(middleware: Middleware<MiddlewareOutput<Tail<T>>, Out>): MiddlewareStack<[...T, Middleware<Tail<T>, Out>]>;
      transform(parser: Parser): MiddlewareOutput<Tail<T>>;
    }

export function createMiddlewareStack(): MiddlewareStack<[]> {
  const middlewares: Middleware<any, any>[] = [];
  
  return {
    push(middleware) {
      middlewares.push(middleware);
      return this as any;
    },
    transform(input: Parser) {
      let result: any = input;
      for (const middleware of middlewares) {
        result = middleware.transform(result);
      }
      return result;
    },
  }
}
