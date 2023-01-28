
/** Collect values into an array.
 * 
 * This specialization simply returns the original array `value`.
 */
export function collect<T>(value: T[]): T[];
/** Collect values into an array.
 * 
 * This specialization wraps the given string in a 1-element array.
 */
export function collect(value: string): string[];
/** Collect values into an array. */
export function collect<T>(value: Iterable<T>): T[];
/** Collect values into an array.
 * 
 * This specialization wraps the given value in a 1-element array.
 */
export function collect<T>(value: T): T[];
export function collect(value: any) {
  if (Array.isArray(value))
    return value;
  if (typeof value === 'string')
    return [value];
  if (Symbol.iterator in value)
    return [...value];
  return [value];
}

export const capitalize = (v: string) => v[0].toUpperCase() + v.substring(1);
