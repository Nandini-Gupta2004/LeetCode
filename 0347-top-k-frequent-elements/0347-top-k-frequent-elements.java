class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        // Store all elements
        List<Integer> list = new ArrayList<>(mp.keySet());

        // Sort by frequency in descending order
        Collections.sort(list, (a, b) -> mp.get(b) - mp.get(a));

        // Take first k elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}