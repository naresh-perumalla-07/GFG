class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);

        }

        while(max!=0){
            int rem=min%max;
            min=max;
            max=rem;

        }
        return min;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna