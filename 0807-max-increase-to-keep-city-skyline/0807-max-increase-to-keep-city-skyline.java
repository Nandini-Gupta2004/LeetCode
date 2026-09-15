class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;

        int[] rowMax = new int[n];
        int[] colMax = new int[n];

        // Find maximum height in every row and column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        int totalIncrease = 0;

        // Maximum possible height at grid[i][j]
        // is the minimum of its row and column maximums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxHeight = Math.min(rowMax[i], colMax[j]);
                totalIncrease += maxHeight - grid[i][j];
            }
        }

        return totalIncrease;
    }
}