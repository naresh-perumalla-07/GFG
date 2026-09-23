class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;

        int Max=Integer.MIN_VALUE;

        for(int num:nums){
            Max=Math.max(Max,num);
        }

        if(n!=Max+1)return false;

        int[] freq=new int[201];

        for(int i=0;i<n;i++){
            
            int num=nums[i];

            freq[num]++;
            // if(freq[num]==0){
            //     freq[num]++;
            // }else if(num==Max){
            //     freq[num]++;
            // }else{
            //     return false;
            // }
        }

        for(int i=1;i<=Max;i++){

            // int num=nums[i];
           

            if(i==Max){
                if(freq[i]!=2)return false;
            }
            // else if(freq[i]==0){
            //     return false;
            else{
                if(freq[i] != 1)
        return false;
            }
        }

        return true;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna