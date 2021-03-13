import java.util.*;

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

    // Normal Method
    public boolean backspaceCompare_usingStringBuffers(String S, String T) {

        StringBuffer s = new StringBuffer();
        StringBuffer t = new StringBuffer();

        for (char c : S.toCharArray()) {
            if (c != '#')
                s.append(c);
            else if (s.length() > 0)
                s.deleteCharAt(s.length() - 1);
        }
        for (char c : T.toCharArray()) {
            if (c != '#')
                t.append(c);
            else if (t.length() > 0)
                t.deleteCharAt(t.length() - 1);
        }
        return s.toString().equals(t.toString());
    }

    // Using Stack
    public boolean backspaceCompare_usingstack(String S, String T) {

        Deque<Character> s = new ArrayDeque<>();
        Deque<Character> t = new ArrayDeque<>();

        for (char c : S.toCharArray()) {
            if (c != '#')
                s.push(c);
            else if (!s.isEmpty())
                s.pop();
        }

        for (char c : T.toCharArray()) {
            if (c != '#')
                t.push(c);
            else if (!t.isEmpty())
                t.poll();
        }

        if (s.isEmpty() && t.isEmpty())
            return true;

        return s.toString().equals(t.toString());
    }
}