class Solution {
    public int reverseDegree(String s) {
        int len=s.length();
        int sum=0;

        for(int i=1;i<=len;i++){
            int val=26-(s.charAt(i-1)-'a');
            sum+=val*i;

        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna