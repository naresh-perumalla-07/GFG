class Solution {

    int n, m;
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    int dfs(int r, int c, int xd, int yd, int[][] mat, boolean[][] vis) {

        if (r == xd && c == yd) {
            return 0;
        }

        vis[r][c] = true;

        int maxLen = -1;

        for (int k = 0; k < 4; k++) {

            int nr = r + dr[k];
            int nc = c + dc[k];

            if (nr >= 0 && nr < n &&
                nc >= 0 && nc < m &&
                mat[nr][nc] == 1 &&
                !vis[nr][nc]) {

                int len = dfs(nr, nc, xd, yd, mat, vis);

                if (len != -1) {
                    maxLen = Math.max(maxLen, 1 + len);
                }
            }
        }

        vis[r][c] = false; // backtrack

        return maxLen;
    }

    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {

        n = mat.length;
        m = mat[0].length;

        if (mat[xs][ys] == 0 || mat[xd][yd] == 0) {
            return -1;
        }

        boolean[][] vis = new boolean[n][m];

        return dfs(xs, ys, xd, yd, mat, vis);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna