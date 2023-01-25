
export type Tuple<T extends any[]> = [...T];
export type Head<T> = T extends Tuple<[infer H, ...any[]]> ? H : never;
export type Tail<T> = T extends Tuple<[infer S]>
  ? S
  : T extends Tuple<[any, ...(infer R)]>
  ? Tail<R>
  : never;
