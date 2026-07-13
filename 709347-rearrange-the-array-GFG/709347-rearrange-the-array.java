class Solution {
    static final long MOD = 1000000007L;

    int minOperations(int[] b) {
        int n = b.length;

        boolean[] vis = new boolean[n];

        // prime -> maximum power needed in LCM
        HashMap<Integer, Integer> maxPower = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (!vis[i]) {

                int curr = i;
                int len = 0;

                while (!vis[curr]) {
                    vis[curr] = true;
                    curr = b[curr] - 1; // convert to 0-based
                    len++;
                }

                factorize(len, maxPower);
            }
        }

        long ans = 1;

        for (int prime : maxPower.keySet()) {
            ans = (ans * modPow(prime, maxPower.get(prime))) % MOD;
        }

        return (int) ans;
    }

    void factorize(int num, HashMap<Integer, Integer> maxPower) {

        int temp = num;

        for (int p = 2; p * p <= temp; p++) {

            int cnt = 0;

            while (num % p == 0) {
                cnt++;
                num /= p;
            }

            if (cnt > 0) {
                maxPower.put(p,
                    Math.max(maxPower.getOrDefault(p, 0), cnt));
            }
        }

        if (num > 1) {
            maxPower.put(num,
                Math.max(maxPower.getOrDefault(num, 0), 1));
        }
    }

    long modPow(long a, long b) {

        long res = 1;

        while (b > 0) {

            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }

            a = (a * a) % MOD;
            b >>= 1;
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna