class Solution {
    public int waysToIncreaseLCSBy1(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Forward LCS DP
        int[][] pre = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    pre[i][j] = 1 + pre[i - 1][j - 1];
                } else {
                    pre[i][j] = Math.max(pre[i - 1][j], pre[i][j - 1]);
                }
            }
        }

        int lcs = pre[n][m];

        // Suffix LCS DP
        int[][] suf = new int[n + 1][m + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    suf[i][j] = 1 + suf[i + 1][j + 1];
                } else {
                    suf[i][j] = Math.max(suf[i + 1][j], suf[i][j + 1]);
                }
            }
        }

        int ans = 0;

        // Try every insertion position in s1
        for (int pos = 0; pos <= n; pos++) {

            // Avoid counting same character twice at same position
            boolean[] used = new boolean[26];

            for (int j = 0; j < m; j++) {

                char ch = s2.charAt(j);

                if (used[ch - 'a']) continue;

                if (pre[pos][j] + 1 + suf[pos][j + 1] == lcs + 1) {
                    ans++;
                    used[ch - 'a'] = true;
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna