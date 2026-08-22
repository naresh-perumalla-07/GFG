class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int orig=n;

        while(n>0){
            int last=n%10;
            sum+=last;
            prod*=last;
            n/=10;
        }

        return orig%(sum+prod)==0 ? true : false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna