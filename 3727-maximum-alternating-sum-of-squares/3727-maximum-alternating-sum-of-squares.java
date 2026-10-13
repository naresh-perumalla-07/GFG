class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for (int i = 0; i < n; i++) sq[i] = 1L * nums[i] * nums[i];

        Arrays.sort(sq);

        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i < n / 2) ans -= sq[i];
            else ans += sq[i];
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna