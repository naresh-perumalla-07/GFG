class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n+1];

        dp[0]=nums[0];

        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1)pick+=dp[i-2];
            int notPick=dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        return dp[n-1];
    }
    //     int n=nums.length;
        
    //     int[]dp=new int[n+1];
        
    //     Arrays.fill(dp,-1);

    //     return rob(n-1,nums,dp);
        
    // }

    // public int rob(int house,int[] houses,int[]dp){
    //     if(house==0)return houses[house];

    //     if(house<0)return 0;

        

    //     if(dp[house]!=-1)return dp[house];

    //     int rob=houses[house]+rob(house-2,houses,dp);
    //     int notRob=rob(house-1,houses,dp);

    //     return Math.max(rob,notRob);
    // }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna