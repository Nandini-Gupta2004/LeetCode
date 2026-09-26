class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();

        boolean[] vis = new boolean[n];

        bfs(0, vis, rooms);

        // Check if every room was visited
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                return false;
            }
        }

        return true;
    }

    public void bfs(int start, boolean[] vis, List<List<Integer>> rooms) {

        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {

            int front = q.poll();

            // Keys available in this room
            for (int key : rooms.get(front)) {

                if (!vis[key]) {
                    vis[key] = true;
                    q.add(key);
                }
            }
        }
    }
}