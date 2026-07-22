class Solution {
    public int rob(int[] money) {
        int n=money.length;

        if(n==0)return 0;
        if(n==1)return money[0];

        int[]arr1=new int[n-1];
        int[]arr2=new int[n-1];

        for(int i=0;i<n;i++){
            if(i!=0){
                arr1[i-1]=money[i];

            }
            if(i!=n-1){
                arr2[i]=money[i];
            }
        }

        int[]dp1=new int[n+1];
        int[]dp2=new int[n+1];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        int first=robb(arr1.length-1,arr1,dp1);
        int sec=robb(arr2.length-1,arr2,dp2);

        return Math.max(first,sec);

    }

    public int robb(int idx,int[]arr,int[]dp){
        if(idx==0)return arr[0];

        if(idx<0)return 0;

        if(dp[idx]!=-1)return dp[idx];

        int doRob=arr[idx]+robb(idx-2,arr,dp);
        int dontRob=robb(idx-1,arr,dp);

        return dp[idx]=Math.max(dontRob,doRob);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna