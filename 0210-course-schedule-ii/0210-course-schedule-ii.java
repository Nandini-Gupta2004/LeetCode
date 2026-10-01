
import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        // Build graph
        for (int[] p : prerequisites) {
            int course = p[0];
            int pre = p[1];

            adj.get(pre).add(course);
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[numCourses];
        int idx = 0;

        // Add courses with indegree 0
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // BFS
        while (!q.isEmpty()) {
            int front = q.remove();
            ans[idx++] = front;

            for (int ele : adj.get(front)) {
                indegree[ele]--;

                if (indegree[ele] == 0) {
                    q.add(ele);
                }
            }
        }

        // Check for cycle
        if (idx == numCourses) {
            return ans;
        }

        return new int[0];
    }
}