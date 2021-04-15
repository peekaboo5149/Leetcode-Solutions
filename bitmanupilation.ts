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

class _ListNode {
  val: number;
  next: ListNode | null;
  constructor(val?: number, next?: ListNode | null) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

function getDecimalValue(head: _ListNode | null): number {
  let pow = 0,
    res = 0;
  let temp = head;
  while (temp != null) {
    pow++;
    temp = temp.next;
  }

  temp = head;
  while (temp != null) {
    res += temp.val * Math.pow(2, pow - 1);
    temp = temp.next;
    pow--;
  }

  return res;
}
