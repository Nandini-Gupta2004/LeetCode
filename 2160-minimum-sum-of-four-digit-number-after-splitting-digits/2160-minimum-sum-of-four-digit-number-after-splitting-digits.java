import java.util.*;

class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];

        // Extract all four digits
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        // Sort digits in ascending order
        Arrays.sort(digits);

        // Use the two smallest digits as tens digits
        int new1 = digits[0] * 10 + digits[2];
        int new2 = digits[1] * 10 + digits[3];

        return new1 + new2;
    }
}