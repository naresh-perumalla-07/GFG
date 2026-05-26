class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;

        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || i == n - 1 || j == 0 || j == m - 1) && !vis[i][j]) {
                    dfs(i, j, n, m, vis, grid);
                }
            }
        }
        int cnt = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    cnt += 1;
                }
            }
        }
        return cnt;
    }

    public void dfs(int i, int j, int n, int m, boolean[][] vis, int[][] grid) {
        if (i < 0 || i >=n || j < 0 || j >=m || vis[i][j] || grid[i][j] == 0)
            return;

        vis[i][j] = true;

        dfs(i + 1, j, n, m, vis, grid);
        dfs(i - 1, j, n, m, vis, grid);
        dfs(i, j + 1, n, m, vis, grid);
        dfs(i, j - 1, n, m, vis, grid);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna