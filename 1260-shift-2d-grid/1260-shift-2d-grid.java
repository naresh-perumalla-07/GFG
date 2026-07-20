class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;
        k %= total;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            ans.add(row);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int oldIndex = i * n + j;
                int newIndex = (oldIndex + k) % total;

                int newRow = newIndex / n;
                int newCol = newIndex % n;

                ans.get(newRow).set(newCol, grid[i][j]);
            }
        }

        return ans;
    }







    // public List<List<Integer>> shiftGrid(int[][] grid, int k) {

    //     int n=grid.length;
    //     int m=grid[0].length;
    //     List<List<Integer>>ans=new ArrayList<>();

    //     for(int i=0;i<n;i++){
    //         ans.add(new ArrayList<>());
    //     }
    //     for()


    //         for(int i=0;i<n;i++){
    //             for(int j=0;j<m;j++){
    //                 if(j==m-1 && i!=n-1){
    //                     ans.get(i+1).get(0)=grid[i][j];
    //                 }else if(i==n-1 && j==m-1){
    //                     ans.get(0).get(0)=grid[i][j];
    //                 }else{
    //                     ans.get(i).get(j+1)=grid[i][j];
    //                 }
    //             }
    //             if(k>0)k--;
    //         }

        
    //     return ans;
        
        
    // }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna