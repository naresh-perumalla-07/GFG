class Solution {
    int[][] dp;

    public int maxDotProduct(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(n - 1, m - 1, a, b);
    }

    private int solve(int i, int j, int[] a, int[] b) {

        if (j < 0) {
            return 0;
        }

        if (i < 0) {
            return Integer.MIN_VALUE;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int skip = solve(i - 1, j, a, b);

        int take = solve(i - 1, j - 1, a, b);
        if (take != Integer.MIN_VALUE) {
            take += a[i] * b[j];
        }

        return dp[i][j] = Math.max(skip, take);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna