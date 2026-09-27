class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        // Remainder 0 has occurred once initially
        mp.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int rem = sum % k;

            // Handle negative remainder
            if (rem < 0) {
                rem += k;
            }

            if (mp.containsKey(rem)) {
                count += mp.get(rem);
            }

            mp.put(rem, mp.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}