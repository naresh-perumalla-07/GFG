class Solution {
    int start = 0;
    int count = 0;
    
    public int maxPalindromes(String s, int k) {
        for(int i=0; i<s.length(); i++) {
            helper(s, i, i, k);
            helper(s, i, i+1, k);
        }
        
        return count;
    }
    
    void helper(String s, int i, int j, int k) {
        while(i >= start && j < s.length()) {
            if(s.charAt(i) != s.charAt(j)) break;
            if(j-i+1 >= k) {
                count++;
                start = j+1;
                break;
            }
            i--;
            j++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna