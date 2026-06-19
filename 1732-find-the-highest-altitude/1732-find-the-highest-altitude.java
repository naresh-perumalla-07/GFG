class Solution {
    public int largestAltitude(int[] gain) {
        // int start=0;
        int ans=0;
        // int cnt=0;
        int altitude=0;

        for(int point:gain){
            altitude+=point;

            ans=Math.max(ans,altitude);
        }
        return ans;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna