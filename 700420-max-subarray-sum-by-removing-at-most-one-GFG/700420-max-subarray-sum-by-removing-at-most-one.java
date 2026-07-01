class Solution {
    public int maxSumSubarray(int[] arr) {
        int noDel = arr[0];
        int oneDel = Integer.MIN_VALUE;
        int ans = arr[0];

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int prevNoDel = noDel;

            noDel = Math.max(arr[i], noDel + arr[i]);

            if (oneDel == Integer.MIN_VALUE) {
                oneDel = prevNoDel;
            } else {
                oneDel = Math.max(oneDel + arr[i], prevNoDel);
            }

            ans = Math.max(ans, Math.max(noDel, oneDel));
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna