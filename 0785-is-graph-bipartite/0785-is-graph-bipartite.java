import java.util.*;

class Solution {

    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        // -1 = not colored
        //  0 = color 0
        //  1 = color 1
        int[] color = new int[n];

        Arrays.fill(color, -1);

        // Graph can be disconnected
        for (int i = 0; i < n; i++) {

            if (color[i] == -1) {

                if (!bfs(i, graph, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean bfs(
        int start,
        int[][] graph,
        int[] color
    ) {

        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        color[start] = 0;

        while (!q.isEmpty()) {

            int node = q.poll();

            for (int neighbour : graph[node]) {

                // Not colored
                if (color[neighbour] == -1) {

                    // Give opposite color
                    color[neighbour] = 1 - color[node];

                    q.add(neighbour);
                }

                // Same color → conflict
                else if (color[neighbour] == color[node]) {

                    return false;
                }
            }
        }

        return true;
    }
}