import java.util.*;

class Solution {
    public int minGroups(int[][] intervals) {
        
        // Sort intervals by starting point
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Store ending points of intervals currently in groups
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            // If the earliest ending interval ends BEFORE
            // this interval starts, we can reuse that group.
            if (!pq.isEmpty() && pq.peek() < start) {
                pq.poll();
            }

            // Put current interval in a group
            pq.offer(end);
        }

        return pq.size();
    }
}