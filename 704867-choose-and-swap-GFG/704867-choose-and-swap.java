class Solution {
    public String chooseSwap(String s) {
        int n = s.length();

        int[] lastOccur = new int[26];
        Arrays.fill(lastOccur, -1);

        for (int i = 0; i < n; i++) {
            lastOccur[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];

        char first = 0, second = 0;

        for (int i = 0; i < n; i++) {
            int cur = s.charAt(i) - 'a';

            for (int ch = 0; ch < cur; ch++) {
                if (!seen[ch] && lastOccur[ch] > i) {
                    first = s.charAt(i);
                    second = (char) (ch + 'a');
                    break;
                }
            }

            if (first != 0) {
                break;
            }

            seen[cur] = true;
        }

        if (first == 0) {
            return s;
        }

        char[] arr = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (arr[i] == first) {
                arr[i] = second;
            } else if (arr[i] == second) {
                arr[i] = first;
            }
        }

        return new String(arr);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna