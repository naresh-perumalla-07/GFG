class Solution {
    public int totalWaviness(int num1, int num2) {
        int cnt=0;
        for(int i=num1;i<=num2;i++){
            String digit=String.valueOf(i);
            int n=digit.length();
            for(int j=1;j<n-1;j++){
                int curr=digit.charAt(j)-'0';
                int left=digit.charAt(j-1)-'0';
                int right=digit.charAt(j+1)-'0';

                if((curr<left && curr<right) || (curr>left && curr>right))cnt++;
            }
        }
        return cnt;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna