class Solution {
    public String lexicographicallySmallest(String s, int k) {
        int n=s.length();
        if(k==0)return s;        
        
        if((n&(n-1))==0){
            k/=2;
        }else{
            k*=2;
        }
        
        if(k>=n)return "-1";
        // n&n-1 determines whether it is a pow of 2 or not 
        // how pow 0f 2 has always a 1set of 1's
        
        
        Stack<Character>st=new Stack<>();
        
       
        for(char c:s.toCharArray()){
        
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        
        
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        
        if(st.isEmpty())return "-1";
        
        StringBuilder sb=new StringBuilder();
        
        for(char ch:st){
            sb.append(ch);
        }
        
        return sb.toString();
        
        // code here
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna