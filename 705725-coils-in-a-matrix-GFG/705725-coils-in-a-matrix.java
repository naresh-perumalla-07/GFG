class Solution {
    public ArrayList<ArrayList<Integer>> formCoils(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        int size = 4 * n;

        int[][] d1 = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int r = 0, c = 0, dir = 0;
        int len = size - 1;
        boolean firstDown = true;

        first.add(1);

        while (len > 0) {
            for (int i = 0; i < len; i++) {
                r += d1[dir][0];
                c += d1[dir][1];
                first.add(r * size + c + 1);
            }

            if (dir == 0) {
                if (firstDown) {
                    len -= 1;
                    firstDown = false;
                } else {
                    len -= 2;
                }
            } else if (dir == 2) {
                len -= 2;
            }

            dir = (dir + 1) % 4;
        }

        int[][] d2 = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        r = size - 1;
        c = size - 1;
        dir = 0;
        len = size - 1;
        boolean firstUp = true;

        second.add(size * size);

        while (len > 0) {
            for (int i = 0; i < len; i++) {
                r += d2[dir][0];
                c += d2[dir][1];
                second.add(r * size + c + 1);
            }

            if (dir == 0) {
                if (firstUp) {
                    len -= 1;
                    firstUp = false;
                } else {
                    len -= 2;
                }
            } else if (dir == 2) {
                len -= 2;
            }

            dir = (dir + 1) % 4;
        }

        ans.add(first);
        ans.add(second);

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna