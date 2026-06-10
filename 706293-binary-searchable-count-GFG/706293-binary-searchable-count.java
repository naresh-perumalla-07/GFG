
class Solution {

    int solve(int[] arr, int l, int r, int low, int high) {

        if (l > r) return 0;

        int mid = (l + r) / 2;

        int ans = 0;

        if (low < arr[mid] && arr[mid] < high) {
            ans = 1;
        }

        ans += solve(
                arr,
                l,
                mid - 1,
                low,
                Math.min(high, arr[mid])
        );

        ans += solve(
                arr,
                mid + 1,
                r,
                Math.max(low, arr[mid]),
                high
        );

        return ans;
    }

    public int binarySearchable(int[] arr) {

        return solve(
                arr,
                0,
                arr.length - 1,
                Integer.MIN_VALUE,
                Integer.MAX_VALUE
        );
    }
}




// class Solution {
//     public int binarySearchable(int[] arr) {
//         // code here
//       int n = arr.length;
//         if (n == 0) return 0;
//         if (n == 1) return 1;

//         // Step 1: Create an array to track minimum values from the right side.
//         int[] minRight = new int[n];
        
//         // The last element has nothing to its right, so its barrier is set to infinity.
//         minRight[n - 1] = Integer.MAX_VALUE; 
        
//         for (int i = n - 2; i >= 0; i--) {
//             minRight[i] = Math.min(minRight[i + 1], arr[i + 1]);
//         }

//         int searchableCount = 0;
        
//         // The first element has nothing to its left, so its barrier is set to negative infinity.
//         int maxLeft = Integer.MIN_VALUE; 

//         // Step 2: Traverse from left to right to check both bounds simultaneously
//         for (int i = 0; i < n; i++) {
//             // An element is binary searchable if it is larger than everything to its left
//             // AND smaller than everything to its right.
//             if (arr[i] > maxLeft && arr[i] < minRight[i]) {
//                 searchableCount++;
//             }
            
//             // Update the running maximum for the next iteration
//             maxLeft = Math.max(maxLeft, arr[i]);
//         }

//         return searchableCount;
//     }
// };
        
            
        // int[]preMax=new int[n];
        // int[] sufMin=new int[n];
        // preMax[0]=arr[0];
        // sufMin[n-1]=arr[n-1];
        
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        
        // for(int i=1;i<n;i++){
        //     //  max=Math.max(max,arr[i-1]);
        //     //  preMax[i]=max;
            
            
        //     preMax[i]=Math.max(preMax[i-1],arr[i]);
        // }
        
        // for(int i=n-2;i>=0;i--){
        //     // min=Math.min(min,arr[i+1]);
        //     // sufMin[i]=min;
            
        //     sufMin[i]=Math.min(sufMin[i+1],arr[i]);
        // }
        
        // for(int i=0;i<n;i++){
        //     int target=arr[i];
        //     // if(preMax[i]<target && sufMin[i]>target)cnt++;
            
        //     if(preMax[i]==target && sufMin[i]==target)cnt++;
            
        // }
        // return cnt;
        
    
    
    
        // public boolean bs(int[] nums,int[]sMin,int[]pMax,int i){
    //     int n=nums.length;
    //     int l=0;
    //     int r=n-1;
        
    //     while(l<=r){
    //         int mid=l+(r-l)/2;
            
    //         if(nums[mid]==tar){
    //             return true;
    //         }else if(pMax[i-1]>arr[i] && sMin[i+1]<arr[i]){
    //             return false;
    //     }
    //         }
    //     return false;
    // }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna