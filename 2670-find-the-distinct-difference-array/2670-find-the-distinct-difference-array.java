import java.util.*;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {

        int n = nums.length;
        int[] suffix = new int[n + 1];
        int[] diff = new int[n];

        HashSet<Integer> set = new HashSet<>();

        // Calculate suffix distinct counts
        for (int i = n - 1; i >= 0; i--) {

            set.add(nums[i]);

            suffix[i] = set.size();
        }

        // Calculate prefix distinct counts
        set.clear();

        for (int i = 0; i < n; i++) {

            set.add(nums[i]);

            int prefixCount = set.size();
            int suffixCount = suffix[i + 1];

            diff[i] = prefixCount - suffixCount;
        }

        return diff;
    }
}