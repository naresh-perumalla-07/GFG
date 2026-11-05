class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt=0;
        for(int ele:arr1){
        boolean isValid=true;
            for(int ele2:arr2){
                int val=Math.abs((ele-ele2));
                if(val<=d){
                    isValid=false;
                    break;
                }
            }
            if(isValid)cnt++;
           
        }
        return cnt;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna