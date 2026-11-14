class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }
        int best = Integer.MAX_VALUE;
        for (int j = l; j <= n; j++) {
            for (int len = l; len <= Math.min(r, j); len++) {
                int sum = prefix[j] - prefix[j - len];
                if (sum > 0 && sum < best) {
                    best = sum;
                }
            }
        }
        return best == Integer.MAX_VALUE ? -1 : best;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna