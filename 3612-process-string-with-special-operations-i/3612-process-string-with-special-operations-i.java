class Solution {
    public String processStr(String s) {
        int n=s.length();

        StringBuilder ans=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch=='#'){
                ans.append(ans);
            }else if(ch=='*'){
                if(ans.length()>=1){
                    ans.deleteCharAt(ans.length()-1);
                }
            }else if(ch=='%'){
                ans.reverse();
            }else{
                ans.append(ch);
            }
        }
    return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna