class Solution {
    public String reverseParentheses(String s) {

        Stack<StringBuilder>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        // int n=s.length();

        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(sb);
                sb=new StringBuilder();
            }else if(ch==')'){
                sb.reverse();
                StringBuilder prev=st.pop();
                prev.append(sb);
                sb=prev;

            }else{
                sb.append(ch);
            }
        }
        return sb.toString();



        // int n=s.length();

        // char[] words=s.toCharArray();

        // StringBuilder sb=new StringBuilder();

        // for(char ch:words){
        //     if(ch=='(' || ch==')')continue;
        //     sb.append(ch);
        // }
        // return sb.reverse().toString();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna