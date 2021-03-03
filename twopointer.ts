//1 Squares of Sorted Array
function sortedSquares(nums: number[]): number[] {
  let n = nums.length;
  let i = 0,
    j = n - 1;
  let k = n - 1;
  let res: number[] = [];
  while (i <= j) {
    //[-4,-1,0,3,10]
    if (Math.abs(nums[i]) > Math.abs(nums[j])) {
      res.push(nums[i] * nums[i]);
      i++;
    } else {
      res.push(nums[j] * nums[j]);
      j--;
    }
    k--;
  }
  return res.reverse();
}

function reverseString(s: string[]): void {
  //   let i = 0,
  //     j = s.length - 1;
  //   while (i < j) {
  //     let temp = s[i];
  //     s[i] = s[j];
  //     s[j] = temp;
  //     i++;
  //     j--;
  //   }
  s.reverse();
  return;
}

function intersection(a: number[], b: number[]): number[] {
  const imap = new Map<number, number>();
  const set = new Set<number>();

  for (let i of a) {
    if (imap.has(i)) {
      let f = imap.get(i);
      imap.set(i, ++f);
    } else imap.set(i, 1);
  }

  for (let i of b) {
    if (imap.has(i)) set.add(i);
  }

  return Array.from(set);
}

//Wrong method
// function intersect(a: number[], b: number[]): number[] {
//   const imap = new Map<number, number>();
//   const res: number[] = [];
//   for (let i of a) {
//     if (imap.has(i)) {
//       let f = imap.get(i);
//       imap.set(i, ++f);
//     } else imap.set(i, 1);
//   }

//   for (let i of b) if (imap.has(i)) res.push(i);

//   return res;
// }
