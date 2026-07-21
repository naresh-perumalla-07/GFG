class Solution {
    public int maxIndexDifference(String s) {

        int n = s.length();

        int[] dp = new int[n];
        int[] best = new int[26];

        // -1 means this character has not appeared to the right
        Arrays.fill(best, -1);

        int ans = -1;

        for (int i = n - 1; i >= 0; i--) {

            int cur = s.charAt(i) - 'a';

            if (cur == 25) {
                // 'z'
                dp[i] = i;
            } else {

                if (best[cur + 1] == -1) {
                    dp[i] = i;
                } else {
                    dp[i] = best[cur + 1];
                }
            }

            best[cur] = Math.max(best[cur], dp[i]);

            if (cur == 0) {
                ans = Math.max(ans, dp[i] - i);
            }
        }

        return ans;
    }
}










// class Solution {
//     public int maxIndexDifference(String s) {

//         int n = s.length();

//         int[] dp = new int[n];

//         for (int i = n - 1; i >= 0; i--) {

//             dp[i] = i;

//             char next = (char) (s.charAt(i) + 1);

//             if (next > 'z')
//                 continue;

//             for (int j = i + 1; j < n; j++) {

//                 if (s.charAt(j) == next) {
//                     dp[i] = Math.max(dp[i], dp[j]);
//                 }
//             }
//         }

//         int ans = -1;

//         for (int i = 0; i < n; i++) {
//             if (s.charAt(i) == 'a') {
//                 ans = Math.max(ans, dp[i] - i);
//             }
//         }

//         return ans;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna