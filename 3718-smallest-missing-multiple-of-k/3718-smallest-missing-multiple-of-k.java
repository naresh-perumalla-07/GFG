class Solution {
    public int missingMultiple(int[] nums, int k) {

        Set<Integer>numss=new HashSet<>();
        for(int num:nums){
            numss.add(num);
        }
        int n=nums.length;
        int ans=k;

        while(n>0){
            if(!numss.contains(ans))return ans;
            ans+=k;
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna