class Solution {
    ArrayList<Integer> ans = new ArrayList<>();

    public ArrayList<Integer> increasingNumbers(int n) {

        if (n == 1) {
            for (int i = 0; i <= 9; i++)
                ans.add(i);
            return ans;
        }

        if (n > 9)
            return ans;

        solve(n, 1, "");

        return ans;
    }

    void solve(int n, int start, String s) {

        if (s.length() == n) {
            ans.add(Integer.parseInt(s));
            return;
        }

        for (int d = start; d <= 9; d++) {
            solve(n, d + 1, s + d);
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna