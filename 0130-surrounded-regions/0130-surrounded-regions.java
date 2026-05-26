class Solution {
    public void solve(char[][] board) {

        int n=board.length;
        int m=board[0].length;

        boolean[][]vis=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(board[i][j]=='O' && !vis[i][j]){
                        dfs(i,j,n,m,vis,board);
                    }
                }
            }
        }

        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j]='X';
                }
            }
        }

        // return board;
        
    }

    public void dfs(int i,int j,int n,int m,boolean[][]vis,char[][]board){
        if(i<0||i>=n||j<0||j>=m||vis[i][j]||board[i][j]=='X')return;

        vis[i][j]=true;

        dfs(i+1,j,n,m,vis,board);
        dfs(i-1,j,n,m,vis,board);
        dfs(i,j+1,n,m,vis,board);
        dfs(i,j-1,n,m,vis,board);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna