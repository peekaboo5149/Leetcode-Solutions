
class TwoPointer {
    public int[] sortedSquares(int[] a) {
        int n = a.length;
        int i = 0, j = n - 1, k = n - 1;
        int[] res = new int[n];
        while (i <= j) {
            if (Math.abs(a[i]) > Math.abs(a[j])) {
                res[k] = a[i] * a[i];
                i++;
            } else {
                res[k] = a[j] * a[j];
                j--;
            }
            k--;
        }
        return res;
    }

    public void reverseString(char[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public void moveZeroes(int[] a) {
        int i = 0, j = 0;
        while (i < a.length) {
            if (a[i] == 0)
                i++;
            else {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
                i++;
            }
        }
    }

    public int[] twoSum(int[] a, int x) {
        int n = a.length;
        int i = 0, j = n - 1;
        int re1 = -1, re2 = -1;
        while (i < j) {
            if (a[i] + a[j] > x)
                j--;
            else if (a[i] + a[j] < x)
                i++;
            else {
                re1 = i;
                re2 = j;
                break;
            }
        }
        int[] res = { re1 + 1, re2 + 1 };
        return res;
    }
}