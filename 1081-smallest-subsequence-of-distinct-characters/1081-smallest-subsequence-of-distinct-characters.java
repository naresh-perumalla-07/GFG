class Solution {
    public String smallestSubsequence(String s) {
        int n=s.length();

        int[]pos=new int[26];

        for(int i=0;i<n;i++){
            int ch=s.charAt(i);
            pos[ch-'a']=i;
        }

        boolean[]vis=new boolean[26];

        Stack<Character>st=new Stack<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(vis[ch-'a'])continue;

            while(!st.isEmpty() && st.peek()>ch && pos[st.peek()-'a']>i){
                vis[st.pop()-'a']=false;
            }
            st.push(ch);
            vis[ch-'a']=true;
        }

        StringBuilder sb=new StringBuilder();

        for(char ch:st){
            sb.append(ch);
        }

        return sb.toString();

        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna