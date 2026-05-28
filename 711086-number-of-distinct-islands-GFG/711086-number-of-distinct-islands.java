// User function Template for Java

class Solution {
    
    private int[] row={1,0,-1,0};
    private int[]col={0,1,0,-1};

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int n=grid.length;
        int m=grid[0].length;
        
        boolean[][]vis=new boolean[n][m];
        
        Set<String>s=new HashSet<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    StringBuilder sb=new StringBuilder();
                    dfs(grid,i,j,vis,sb,i,j,n,m);
                    s.add(sb.toString());
                }
            }
        }
        return s.size();
    }
    public void dfs(int[][]grid,int i,int j,boolean[][]vis,StringBuilder sb,int baseR,int baseC,int n,int m){
        if(i<0 || i>=n || j>=m||j<0 || grid[i][j]==0 || vis[i][j])return;
        
        vis[i][j]=true;
        
        sb.append((baseR-i)+","+(baseC-j));
        
        for(int k=0;k<4;k++){
            int r=i+row[k];
            int c=j+col[k];
            dfs(grid,r,c,vis,sb,baseR,baseC,n,m);
        }
        
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna