class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int i=0;
        int pos=0;
        int[]ans=new int[n];

        while(i<n){
            if(nums[i]<pivot){
                ans[pos]=nums[i];
                pos++;
            }
                i++;

        }
        i=0;
        while(i<n){
            if(nums[i]==pivot){
                ans[pos]=nums[i];
                pos++;
            }
                i++;

        }
        i=0;
        while(i<n){
            if(nums[i]>pivot){
                ans[pos]=nums[i];
                pos++;
            }
                i++;

        }

        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna