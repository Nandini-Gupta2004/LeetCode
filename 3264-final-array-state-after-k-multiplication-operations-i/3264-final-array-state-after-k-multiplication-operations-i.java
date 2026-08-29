class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        while (k > 0) {

            // Find index of first minimum
            int minIndex = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }

            // Multiply minimum
            nums[minIndex] = nums[minIndex] * multiplier;

            k--;
        }

        return nums;
    }
}