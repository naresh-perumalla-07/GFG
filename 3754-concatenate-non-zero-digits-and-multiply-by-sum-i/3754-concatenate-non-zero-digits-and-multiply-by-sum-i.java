class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)return 0;
        int ans=0;
        String num="";
        int sum=0;
        while(n>0){
            int last=n%10;
            if(last!=0){
               
                num=last+num;

            }
            sum+=last;
            n/=10;
        }

        int digits=Integer.parseInt(num);
        
        return 1L*digits*sum;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna