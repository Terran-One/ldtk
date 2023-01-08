
/** Merge rules of RHS into LHS, throwing if a rule name is already in use. */
export function mergeRules<T>(lhs: Record<string, T>, rhs: Record<string, T>) {
  for (const rule in rhs)
    if (lhs[rule]) throw Error(`Rule name ${rule} already in use`);
  Object.assign(lhs, rhs);
  return lhs;
}
