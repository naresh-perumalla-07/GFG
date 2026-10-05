class Solution {

    int[][] dp;
    int n, m;

    public int longIncPath(int[][] matrix, int n, int m) {

        this.n = n;
        this.m = m;

        dp = new int[n][m];

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, dfs(matrix, i, j));
            }
        }

        return ans;
    }

    private int dfs(int[][] matrix, int i, int j) {

        // Already calculated
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        // At least the current cell itself
        int max = 1;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int k = 0; k < 4; k++) {

            int ni = i + dr[k];
            int nj = j + dc[k];

            // Check boundary + increasing condition
            if (ni >= 0 && ni < n &&
                nj >= 0 && nj < m &&
                matrix[ni][nj] > matrix[i][j]) {

                max = Math.max(max, 1 + dfs(matrix, ni, nj));
            }
        }

        dp[i][j] = max;

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna