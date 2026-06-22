class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int cnt=0;
        long ans=0;
        for(int i=1;;i++){
            ans+=1L*i*i;
            if(ans>p)break;
            cnt++;
            
            
        }
        return cnt;
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna