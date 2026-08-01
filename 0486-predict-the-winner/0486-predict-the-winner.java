class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;

        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){

        Arrays.fill(dp[i],-1);
        }

        return predict(nums,0,n-1,dp)>=0;
        
    }

    public int predict(int[]nums,int left,int right,int[][]dp){
        if(left==right)return nums[left];

        if(dp[left][right]!=-1)return dp[left][right];

        int takeLeft=nums[left]-predict(nums,left+1,right,dp);
        int takeRight=nums[right]-predict(nums,left,right-1,dp);

        return dp[left][right]=Math.max(takeLeft,takeRight);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna