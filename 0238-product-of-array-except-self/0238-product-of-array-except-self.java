 class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prod = 1;
        int cnt0 = 0;

        // Find total product and count zeros
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt0++;
            } else {
                prod *= nums[i];
            }
        }

        // Case 1: More than one zero
        if (cnt0 > 1) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }
        }

        // Case 2: Exactly one zero
        else if (cnt0 == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    nums[i] = prod;
                } else {
                    nums[i] = 0;
                }
            }
        }

        // Case 3: No zero
        else {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = prod / nums[i];
            }
        }

        return nums;
    }
}