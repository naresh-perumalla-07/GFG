class Solution {
    public int maxFruits(ArrayList<Integer> arr, int m) {
        
        int n = arr.size();

        int sum = 0;

        // First window
        for (int i = 0; i < m; i++) {
            sum += arr.get(i);
        }

        int max = sum;

        // Slide the window around the circle
        for (int i = 1; i < n; i++) {

            // Remove the previous first element
            sum -= arr.get(i - 1);

            // Add the new element
            sum += arr.get((i + m - 1) % n);

            max = Math.max(max, sum);
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna