class Solution {
    public int maxCharGap(String s) {
        // code here
        int n=s.length();
        
        HashMap<Character,int[]>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            
            if(!map.containsKey(ch)){
                map.put(ch,new int[]{i,i});
            }else{
                int[] pos=map.get(ch);
                pos[1]=i;
            }
        }
        int ans=-1;
        for(int[] pos:map.values()){
            if(pos[0]!=pos[1]){
               ans=Math.max(ans,pos[1]-pos[0]-1);
            }
        }
        return ans;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna