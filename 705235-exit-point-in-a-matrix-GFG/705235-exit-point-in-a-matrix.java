class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        int row = 0;
        int col = 0;
        int dir = 0; // 0=Right, 1=Down, 2=Left, 3=Up
        
        while (row >= 0 && row < n && col >= 0 && col < m) {
            
            if (mat[row][col] == 1) {
                dir = (dir + 1) % 4;
                mat[row][col] = 0;
            }
            
            if (dir == 0) {
                col++;
            } else if (dir == 1) {
                row++;
            } else if (dir == 2) {
                col--;
            } else {
                row--;
            }
        }
        
        // Move back to last valid cell
        if (dir == 0) {
            col--;
        } else if (dir == 1) {
            row--;
        } else if (dir == 2) {
            col++;
        } else {
            row++;
        }
        
        List<Integer> ans = new ArrayList<>();
        ans.add(row);
        ans.add(col);
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna