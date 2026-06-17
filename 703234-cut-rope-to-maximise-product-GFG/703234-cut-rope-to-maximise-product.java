class Solution {
    public int maxProduct(int n) {
        
        if(n==2)return 1;
        if(n==3)return 2;
        
        int ans=1;
        
        while(n>4){
            ans*=3;
            n-=3;
        }
        
        return ans*n;
        //version 01 
        // // code here
        // if(n==2)return 1;
        // int diff=1;
        // int ans=Math.max(n,Integer.MIN_VALUE);
        
        // for(int i=1;i*i<n;i++){
        //     diff=n-i;
        //     ans=Math.max(ans,diff*i);
            
            
        // }
        // return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna