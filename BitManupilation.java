
public class BitManupilation {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] original = new int[n + 1];

        original[0] = first;

        for (int i = 0; i < n; i++) {
            int temp = encoded[i] ^ original[i];
            original[i + 1] = temp;
        }

        return original;
    }

    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= (start + (i << 1));
        }
        return res;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int getDecimalValue(ListNode head) {
        int pow = 0, res = 0;

        var temp = head;
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
}