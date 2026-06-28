class Solution {
    static final long MOD = 1000000007L;

    int countStrings(int n, int k) {

        if (k > n - 1) return 0;

        long[][] prev = new long[k + 1][2];
        long[][] curr = new long[k + 1][2];

        prev[0][0] = 1; // "0"
        prev[0][1] = 1; // "1"

        for (int len = 2; len <= n; len++) {

            for (int j = 0; j <= k; j++) {
                curr[j][0] = 0;
                curr[j][1] = 0;
            }

            for (int j = 0; j <= k; j++) {

                // append 0
                curr[j][0] = (curr[j][0]
                        + prev[j][0]
                        + prev[j][1]) % MOD;

                // append 1 after 0
                curr[j][1] = (curr[j][1]
                        + prev[j][0]) % MOD;

                // append 1 after 1 -> creates one more "11"
                if (j > 0) {
                    curr[j][1] = (curr[j][1]
                            + prev[j - 1][1]) % MOD;
                }
            }

            long[][] temp = prev;
            prev = curr;
            curr = temp;
        }

        return (int) ((prev[k][0] + prev[k][1]) % MOD);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna