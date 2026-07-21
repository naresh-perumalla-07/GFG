class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        
        String t="1"+s+"1";

        ArrayList<Character>characters=new ArrayList<>();

        ArrayList<Integer>len=new ArrayList<>();

        int cnt=1;
        int totalOnes=0;

        for(char ch:s.toCharArray()){
            if(ch=='1')totalOnes++;
        }

        for(int i=1;i<t.length();i++){
            if(t.charAt(i)==t.charAt(i-1)){
                cnt++;
            }else{
                characters.add(t.charAt(i-1));
                len.add(cnt);
                cnt=1;
            }
        }
        characters.add(t.charAt(t.length()-1));
        len.add(cnt);

        int ans=totalOnes;


        for(int i=1;i<characters.size()-1;i++){
            if(characters.get(i)=='1' && characters.get(i-1)=='0' && characters.get(i+1)=='0'){
                int left=len.get(i-1);
                int right=len.get(i+1);

                ans=Math.max(ans,totalOnes+left+right);


            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna