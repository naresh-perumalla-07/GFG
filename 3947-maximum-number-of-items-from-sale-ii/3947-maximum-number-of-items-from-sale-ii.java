import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        int[] freq = new int[n + 1];

        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            freq[item[0]]++;
            minPrice = Math.min(minPrice, item[1]);
        }

        int[] multiples = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                multiples[i] += freq[j];
            }
        }

        int[][] candidates = new int[n][2];
        int size = 0;

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

            int freeCount = multiples[factor] - 1;

            if (freeCount > 0 && price < 2 * minPrice) {
                candidates[size][0] = price;
                candidates[size][1] = freeCount;
                size++;
            }
        }

        Arrays.sort(candidates, 0, size,
            (a, b) -> Integer.compare(a[0], b[0]));

        long ans = 0;
        long remaining = budget;

        for (int i = 0; i < size; i++) {
            long price = candidates[i][0];
            long count = candidates[i][1];

            long buy = Math.min(count, remaining / price);

            remaining -= buy * price;
            ans += buy * 2;
        }

        ans += remaining / minPrice;

        return (int) ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna