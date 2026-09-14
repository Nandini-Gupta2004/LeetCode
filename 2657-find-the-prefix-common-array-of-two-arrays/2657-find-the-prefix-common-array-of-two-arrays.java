import java.util.*;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];

        HashSet<Integer> set = new HashSet<>();
        int common = 0;

        for (int i = 0; i < n; i++) {
            if (set.contains(A[i])) {
                common++;
            } else {
                set.add(A[i]);
            }

            if (set.contains(B[i])) {
                common++;
            } else {
                set.add(B[i]);
            }

            C[i] = common;
        }

        return C;
    }
}