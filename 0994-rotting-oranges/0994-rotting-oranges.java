class Solution {
    public int orangesRotting(int[][] grid) {
       int n=grid.length;

       int m=grid[0].length;

       Queue<int[]>q=new LinkedList<>();

       int fresh=0;

       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==2){
                q.add(new int[]{i,j});
            }
            if(grid[i][j]==1)fresh+=1;
        }}

        if(fresh==0)return 0;

        if(fresh>0 & q.isEmpty())return -1;
        int mint=0;

        while(!q.isEmpty()){
            int size=q.size();

            for(int k=0;k<size;k++){
                int pos[]=q.poll();

                int i=pos[0];
                int j=pos[1];

                if(isValid(i+1,j,n,m,grid)){
                    grid[i+1][j]=2;
                    fresh--;
                    q.add(new int[]{i+1,j});
                }
                if(isValid(i-1,j,n,m,grid)){
                    grid[i-1][j]=2;
                    fresh--;
                    q.add(new int[]{i-1,j});
                }
                if(isValid(i,j+1,n,m,grid)){
                    grid[i][j+1]=2;
                    fresh--;
                    q.add(new int[]{i,j+1});
                }
                if(isValid(i,j-1,n,m,grid)){
                    grid[i][j-1]=2;
                    fresh--;
                    q.add(new int[]{i,j-1});
                }
            }
            if(!q.isEmpty())mint++;
        }

        return fresh>0 ? -1: mint;


       
        
    }

    public boolean isValid(int i,int j,int n,int m,int[][]grid){
        if(i<0 || i>=n|| j<0||j>=m || grid[i][j]==0 || grid[i][j]==2)return false;
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna