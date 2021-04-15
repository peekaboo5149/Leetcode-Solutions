function decode(encoded: number[], a0: number): number[] {
  const n = encoded.length;
  const original: number[] = [a0];

  for (let i = 0; i < n; i++) {
    let temp = original[i] ^ encoded[i];
    original.push(temp);
  }

  return original;
}

function xorOperation(n: number, start: number): number {
  let res = 0;
  for (let i = 0; i < n; i++) res ^= start + (i << 1);
  return res;
}
