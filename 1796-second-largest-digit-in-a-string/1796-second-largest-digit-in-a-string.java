class Solution {
    public int secondHighest(String s) {

        boolean[] digit = new boolean[10];

        // Mark digits that appear
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digit[c - '0'] = true;
            }
        }

        // Find largest digit
        int count = 0;

        for (int i = 9; i >= 0; i--) {

            if (digit[i]) {
                count++;

                if (count == 2) {
                    return i;
                }
            }
        }

        return -1;
    }
}