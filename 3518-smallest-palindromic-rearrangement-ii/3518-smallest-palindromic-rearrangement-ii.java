class Solution {

    long LIMIT = 1000001; // k <= 1e6, cap counts to avoid overflow

    public String smallestPalindrome(String s, int k) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        String middle = "";

        int[] half = new int[26];
        int len = 0;

        for (int i = 0; i < 26; i++) {
            if ((freq[i] & 1) == 1) {
                middle = String.valueOf((char) ('a' + i));
            }
            half[i] = freq[i] / 2;
            len += half[i];
        }

        if (countWays(half, len) < k) {
            return "";
        }

        StringBuilder left = new StringBuilder();

        while (len > 0) {

            for (int c = 0; c < 26; c++) {

                if (half[c] == 0) continue;

                half[c]--;

                long ways = countWays(half, len - 1);

                if (ways >= k) {
                    left.append((char) ('a' + c));
                    len--;
                    break;
                } else {
                    k -= ways;
                    half[c]++;
                }
            }
        }

        StringBuilder ans = new StringBuilder(left);
        ans.append(middle);
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }

    private long countWays(int[] half, int total) {

        long ans = 1;
        int rem = total;

        for (int i = 0; i < 26; i++) {

            int cnt = half[i];

            if (cnt == 0) continue;

            ans *= nCr(rem, cnt);

            if (ans > LIMIT) ans = LIMIT;

            rem -= cnt;
        }

        return ans;
    }

    private long nCr(int n, int r) {

        r = Math.min(r, n - r);

        long ans = 1;

        for (int i = 1; i <= r; i++) {

            ans = ans * (n - r + i) / i;

            if (ans > LIMIT) return LIMIT;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna