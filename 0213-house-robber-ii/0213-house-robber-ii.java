class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        int case1 = robLinear(nums, 0, n - 2);
        int case2 = robLinear(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    public int robLinear(int[] nums, int start, int end) {

        int[] dp = new int[end - start + 1];

        dp[0] = nums[start];

        if (dp.length > 1) {
            dp[1] = Math.max(nums[start], nums[start + 1]);
        }

        for (int i = 2; i < dp.length; i++) {

            dp[i] = Math.max(
                dp[i - 1],
                dp[i - 2] + nums[start + i]
            );
        }

        return dp[dp.length - 1];
    }
}