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
}