class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // code here
        int n=image.length;
        int m=image[0].length;
        
        boolean[][]vis=new boolean[n][m];
        int originalCol=image[sr][sc];
        dfs(sr,sc,n,m,newColor,originalCol,vis,image);
        return image;
    }
    
    public void dfs(int i,int j,int n,int m,int color,int originalCol,boolean[][]vis,int[][]image){
        if(i<0 || i>=n || j<0 || j>=m  || vis[i][j] ||image[i][j]!=originalCol || image[i][j]==color)return;
        
        image[i][j]=color;
        vis[i][j]=true;
        dfs(i,j+1,n,m,color,originalCol,vis,image);
        dfs(i,j-1,n,m,color,originalCol,vis,image);
        dfs(i+1,j,n,m,color,originalCol,vis,image);
        dfs(i-1,j,n,m,color,originalCol,vis,image);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna