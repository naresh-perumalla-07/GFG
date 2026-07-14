class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        // int arr[]=new int[n];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};

                }
            }
            
                
            
        }
        return new int[]{-1,-1}; 
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna