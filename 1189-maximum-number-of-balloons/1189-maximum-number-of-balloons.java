class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map=new HashMap<>();

        for(char ch:text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int letters1=Math.min(map.getOrDefault('b',0),map.getOrDefault('a',0));
        int letters2=Math.min(Math.min(map.getOrDefault('l',0)/2,map.getOrDefault('o',0)/2),map.getOrDefault('n',0));

        return Math.min(letters1,letters2);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna