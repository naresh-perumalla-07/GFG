class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] maxArr=new int[n];
        int[] minArr=new int[n];

        maxArr[0]=nums[0];
        minArr[0]=nums[n-1];
        int maxx=Integer.MIN_VALUE;
        int minn=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            maxx=Math.max(nums[i],maxx);
            maxArr[i]=maxx;

        }

        for(int i=n-1;i>=0;i--){
            minn=Math.min(nums[i],minn);
            minArr[i]=minn;
            
        }
        for(int i=0;i<n;i++){
            if(maxArr[i]-minArr[i]<=k)return i;
        }
        return -1;


        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna