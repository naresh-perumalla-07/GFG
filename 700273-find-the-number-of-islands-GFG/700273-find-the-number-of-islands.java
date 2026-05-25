class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        
        int  m=grid[0].length;
        
        boolean[][]vis=new boolean[n][m];
        
        int cnt=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='L' && !vis[i][j]){
                    dfs(i,j,n,m,vis,grid);
                    cnt+=1;
                }
            }
        }
        return cnt;
    }
    
    public void dfs(int i,int j,int n,int m,boolean[][]vis,char[][]grid){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]=='W' || vis[i][j])return;
        
        vis[i][j]=true;
        
        
        dfs(i+1,j,n,m,vis,grid);
        dfs(i-1,j,n,m,vis,grid);
        dfs(i,j+1,n,m,vis,grid);
        dfs(i,j-1,n,m,vis,grid);
        
        
        //diagonals
        
        dfs(i-1,j-1,n,m,vis,grid);
        dfs(i-1,j+1,n,m,vis,grid);
        dfs(i+1,j-1,n,m,vis,grid);
        dfs(i+1,j+1,n,m,vis,grid);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna