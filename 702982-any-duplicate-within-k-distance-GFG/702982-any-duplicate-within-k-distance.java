class Solution {
    public boolean checkWithinK(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int nums : arr) {
            map.put(nums, map.getOrDefault(nums, 0) + 1);
        }

        int n = arr.length;

        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {

            if (mp.getValue() >= 2) {

                int dist = mp.getKey();
                int[] ans = new int[2];
                int idx = 0;

                for (int i = 0; i < n; i++) {
                    if (arr[i] == dist) {
                        ans[idx] = i;
                        idx++;

                        if (idx == 2) {
                            if (ans[1] - ans[0] <= k) {
                                return true;
                            }

                            ans[0] = ans[1];
                            idx = 1;
                        }
                    }
                }
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna