
import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int[] p : prerequisites) {
            int course = p[0];
            int prerequisite = p[1];

            adj.get(prerequisite).add(course);
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;

        while (!q.isEmpty()) {
            int front = q.remove();
            count++;

            for (int ele : adj.get(front)) {
                indegree[ele]--;

                if (indegree[ele] == 0) {
                    q.add(ele);
                }
            }
        }

        return count == numCourses;
    }
}