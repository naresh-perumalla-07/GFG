class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;

      

        int sum=0;

        for(int i=0;i<n;i++){
            sum=0;
            while(nums[i]>0){
                int last=nums[i]%10;
                sum+=last;
                
                nums[i]/=10;

            }
            nums[i]=sum;
        }

        // // min=Integer.MAX_VAULE;
        // int ans=0;
     
        for(int num:nums){
            min=Math.min(min,num);
            
        }
        return min;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna