class Solution {
    public double angleClock(int hour, int minutes) {
        int min=minutes*6;
        double hr=hour*30+minutes*0.5;

        double diff=Math.abs(min-hr);

        double ans=Math.min(diff,360-diff);
        return ans; 
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna