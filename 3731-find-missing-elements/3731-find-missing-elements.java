class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int n=nums.length;

        boolean[]exist=new boolean[101];

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int num:nums){
            exist[num]=true;
            max=Math.max(max,num);
            min=Math.min(min,num);
        }

        List<Integer>ans=new ArrayList<>();

        for(int i=min;i<max;i++){
            if(!exist[i])ans.add(i);
        }

        return ans;

        // Arrays.sort(nums);

        // List<Integer>ans=new ArrayList<>();

        // for(int i=1;i<n;i++){
        //     if(nums[i]!=nums[i-1]+1)ans.add(nums[i]-1);
        // }
        // return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna