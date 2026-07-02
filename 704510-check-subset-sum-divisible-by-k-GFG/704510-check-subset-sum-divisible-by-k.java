class Solution {
    public boolean divisibleByK(int[] arr, int k) {
        
        if (arr.length > k) {
            return true;
        }

        boolean[] dp = new boolean[k];

        for (int num : arr) {

            boolean[] next = dp.clone();

            int rem = num % k;

            // Start a new subset with only this element
            next[rem] = true;

            // Extend previously achievable remainders
            for (int r = 0; r < k; r++) {
                if (dp[r]) {
                    int newRem = (r + rem) % k;
                    next[newRem] = true;
                }
            }

            dp = next;

            if (dp[0]) {
                return true;
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna