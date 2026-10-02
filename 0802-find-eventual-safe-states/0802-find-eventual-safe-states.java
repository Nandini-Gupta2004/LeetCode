
import java.util.*;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n];

        // Reverse the graph
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int node : graph[i]) {
                adj.get(node).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        // Add terminal nodes (outdegree 0 in original graph)
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        boolean[] safe = new boolean[n];

        while (!q.isEmpty()) {
            int node = q.remove();
            safe[node] = true;

            for (int prev : adj.get(node)) {
                indegree[prev]--;

                if (indegree[prev] == 0) {
                    q.add(prev);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}