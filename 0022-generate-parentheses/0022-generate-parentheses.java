class Solution {
    public void generate(String curr,int open,int close,List<String>ans,int n){
        if(open==close && open+close==2*n){
            ans.add(curr);
            return;
        }

        if(open<n){
            generate(curr+'(',open+1,close,ans,n);
        }
        if(close<open){
            generate(curr+')',open,close+1,ans,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        generate("",0,0,ans,n);
        return ans;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna