class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;

        int low=0,high=n-1;

        int first=findFirst(nums,target);

        int sec=findSec(nums,target);

        return new int[]{first,sec};

    }
    public int  findFirst(int[] nums,int target){
        int n=nums.length;

        int low=0,high=n-1;
        int first=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                first=mid;
                high=mid-1;


            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }

    public int findSec(int[]nums,int target){
        int n=nums.length;

        int low=0,high=n-1;

        int sec=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                sec=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return sec;
    }
        
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna