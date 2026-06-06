class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;

        int[]preSum=new int[n];

        int[]sufSum=new int[n];

        preSum[0]=0;
        sufSum[n-1]=0;

        int sum=0;

        for(int i=1;i<n;i++){
            sum+=nums[i-1];
            preSum[i]=sum;

        }

        sum=0;
        for(int i=n-2;i>=0;i--){
            sum+=nums[i+1];
            sufSum[i]=sum;
        }

        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=Math.abs(preSum[i]-sufSum[i]);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna