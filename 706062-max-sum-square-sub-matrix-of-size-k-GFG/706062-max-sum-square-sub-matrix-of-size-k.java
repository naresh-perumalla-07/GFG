class Solution {
    public int maximumSum(int[][] mat, int k) {
        int n = mat.length;

        // Prefix Sum Matrix
        int[][] prefix = new int[n + 1][n + 1];

        // Build Prefix Sum
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        int ans = Integer.MIN_VALUE;

        // Check every k x k submatrix
        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j <= n - k; j++) {

                int r1 = i;
                int c1 = j;

                int r2 = i + k - 1;
                int c2 = j + k - 1;

                int sum = prefix[r2 + 1][c2 + 1]
                        - prefix[r1][c2 + 1]
                        - prefix[r2 + 1][c1]
                        + prefix[r1][c1];

                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna