class Solution {

    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer[][] dp = new Integer[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(piles, 0, n - 1, dp) > 0;
    }

    private int solve(int[] piles, int left, int right, Integer[][] dp) {

        if (left == right)
            return piles[left];

        if (dp[left][right] != -1)
            return dp[left][right];

        int takeLeft = piles[left] - solve(piles, left + 1, right, dp);

        int takeRight = piles[right] - solve(piles, left, right - 1, dp);

        return dp[left][right] = Math.max(takeLeft, takeRight);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna