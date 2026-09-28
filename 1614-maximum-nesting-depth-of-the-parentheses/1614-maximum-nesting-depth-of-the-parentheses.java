class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        if(n==1){
            return s.charAt(0)=='(' ? 1 : 0;
        }
        int cnt=0;
        int ans=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                cnt++;
                ans=Math.max(cnt,ans);
            }else if(ch==')'){
                cnt--;
            }
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna