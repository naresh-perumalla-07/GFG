class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        // code here
        int n=grid.length;
        
        int m=grid[0].length;
        
        int[][]ans=new int[n][m];
        
        
        Queue<int[]>q=new LinkedList<>();
        
        int ones=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                    ans[i][j]=0;
                    ones++;
                }else{
                    ans[i][j]=-1;
                }
            }
        }
        
        // if(ones==0)return grid;
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int k=0;k<size;k++){
                int pos[]=q.poll();
                
                int r=pos[0];
                int c=pos[1];
                
                int[][]dir={{r+1,c},{r-1,c},{r,c+1},{r,c-1}};
                
                for(int[]d:dir){
                    int rw=d[0];
                    int cl=d[1];
                    
                    if(rw<0|| rw>=n || cl<0 || cl>=m || ans[rw][cl]!=-1)continue;
                    
                    if(grid[rw][cl]==0 && ans[rw][cl]==-1){
                        ans[rw][cl]=ans[r][c]+1;
                        q.add(new int[]{rw,cl});
                    }
                }
            }
        }
        
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            ArrayList<Integer>row=new ArrayList<>();
            
            for(int j=0;j<m;j++){
                
                row.add(ans[i][j]);
            }
            res.add(row);
        }
        return res;
        
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna