class Solution {
    public long findTheArrayConcVal(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        long ans = 0;

        while (left < right) {

            String s = String.valueOf(nums[left]) 
                     + String.valueOf(nums[right]);

            ans += Long.parseLong(s);

            left++;
            right--;
        }

        if (left == right) {
            ans += nums[left];
        }

        return ans;
    }
}