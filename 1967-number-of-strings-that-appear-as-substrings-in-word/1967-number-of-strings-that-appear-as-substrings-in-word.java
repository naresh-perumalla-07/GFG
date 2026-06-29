class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for(String patt: patterns){

            if(word.contains(patt))cnt++;
        }
        return cnt;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna