import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        int maxlen = 0;

        for (int num : hs) {
            if (!hs.contains(num - 1)) {
                int currnum = num;
                int len = 0;

                while (hs.contains(currnum)) {
                    len++;
                    currnum++;
                }

                maxlen = Math.max(maxlen, len);
            }
        }

        return maxlen;
    }
}