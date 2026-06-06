class Solution {
    public int numOfWays(int n, int m) {
        // code here
        long cells=1L*n*m;
        
        long res=cells*(cells-1)-4L*((n-1L)*(m-2L)+(n-2L)*(m-1L));
        return (int)res;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna