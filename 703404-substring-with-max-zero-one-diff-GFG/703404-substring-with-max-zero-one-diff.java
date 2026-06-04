class Solution {
    int maxSubstring(String s) {
        // code here
        int max=Integer.MIN_VALUE;
        int currSum=0;
        
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            if(num==1){
                currSum-=1;
            }else{
                currSum+=1;
            }
            if(currSum<0)currSum=0;
            max=Math.max(currSum,max);
        }
        return max==0 ? -1: max;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna