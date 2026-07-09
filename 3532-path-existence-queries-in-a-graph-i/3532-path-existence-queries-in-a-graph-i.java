class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        int[] comp=new int[n];
        comp[0]=0;
        int currComp=0;

        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]>maxDiff){
                currComp++;
            }
            comp[i]=currComp;
        }

        boolean[] ans=new boolean[queries.length];

        for(int i=0;i<queries.length;i++){
            int u=queries[i][0];
            int v=queries[i][1];
            if(comp[u]==comp[v]){
                ans[i]=true;
            }
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna