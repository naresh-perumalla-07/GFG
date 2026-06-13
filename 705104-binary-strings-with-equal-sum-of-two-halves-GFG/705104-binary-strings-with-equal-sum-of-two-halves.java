class Solution {
    static final long MOD = 1000000007L;

    public int computeValue(int n) {
        int N = 2 * n;

        long[] fact = new long[N + 1];
        fact[0] = 1;

        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long numerator = fact[N];
        long denominator = (fact[n] * fact[n]) % MOD;

        long answer = (numerator * modInverse(denominator)) % MOD;

        return (int) answer;
    }

    private long modInverse(long x) {
        return power(x, MOD - 2);
    }

    private long power(long base, long exp) {
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna