class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();

       int[]freq=new int[26];

       StringBuilder left=new StringBuilder();

       String mid="";

       for(char ch:s.toCharArray()){
         freq[ch-'a']++;
       }

       for(int i=0;i<26;i++){
         int cnt=freq[i]/2;

         while(cnt>0){
            left.append((char)(i+'a'));
            cnt--;
         }

         if(freq[i]%2==1)mid=String.valueOf((char)(i+'a'));

       }

       String right=new StringBuilder(left).reverse().toString();

       return left.toString()+mid+right;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna