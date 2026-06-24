import java.util.*;

class Solution {

    int[][] dp;

    public ArrayList<ArrayList<Integer>> shortestDist(int[][] mat) {

        int n = mat.length;

        int[][] sol = new int[n][n];
        dp = new int[n][n];

        if (!solve(mat, 0, 0, n, sol)) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> row = new ArrayList<>();
            row.add(-1);
            ans.add(row);
            return ans;
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(sol[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }

    private boolean solve(int[][] mat, int x, int y,
                          int n, int[][] sol) {

        if (x < 0 || y < 0 || x >= n || y >= n)
            return false;

        if (mat[x][y] == 0)
            return false;

        if (dp[x][y] == -1)
            return false;

        if (x == n - 1 && y == n - 1) {
            sol[x][y] = 1;
            return true;
        }

        sol[x][y] = 1;

        int jump = mat[x][y];

        for (int k = 1; k <= jump; k++) {

            // Right first
            if (solve(mat, x, y + k, n, sol))
                return true;

            // Down second
            if (solve(mat, x + k, y, n, sol))
                return true;
        }

        sol[x][y] = 0;
        dp[x][y] = -1;

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna