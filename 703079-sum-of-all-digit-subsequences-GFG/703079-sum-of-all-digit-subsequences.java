
class Solution {
    static final long MOD = 1000000007;

    public int subsequenceSum(String s) {

        int n = s.length();

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0';
        }

        long power = 1;

        for (int i = 1; i < n; i++) {
            power = (power * 2) % MOD;
        }

        return (int)((sum * power) % MOD);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna