class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        if(n==1){
            if(nums[0]==0)return 0;
        }
        // int ans=-1;
        for(int i=0;i<n;i++){
            int sum=dSum(nums[i]);
            if(sum==i){
                return i;
            }
            

        }
        return -1;
        
    }
    public int dSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;

        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna