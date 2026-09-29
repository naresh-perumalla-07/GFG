class Solution {
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        // code here
        
        boolean[][] vis=new boolean[n+1][n+1];
        
        Queue<int[]>q=new LinkedList<>();
        
        int st=knightPos[0];
        int sc=knightPos[1];
        
        int tr=targetPos[0];
        int tc=targetPos[1];
        
        if(st==tr && sc==tc)return 0;
        
        vis[st][sc]=true;
        
        q.add(new int[]{st,sc});
        
        int level=0;
        
       int[][] dir = {{+2, +1},{+2, -1}, {-2, +1},{-2, -1},{+1, +2},{+1, -2},{-1, +2},{-1, -2}};
    
        while(!q.isEmpty()){
            
            int size=q.size();
            
            for(int i=0;i<size;i++){
                int[]curr=q.poll();
                
                int r=curr[0];
                int c=curr[1];
                
                // vis[r][c]=true;
                
                if(r==tr && c==tc)return level;
                
                
                for(int[]d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    
                    if(nr<1 || nr>n || nc<1 || nc>n || vis[nr][nc])continue;
                    
                    if(!vis[nr][nc]){
                        q.add(new int[]{nr,nc});
                        vis[nr][nc]=true;
                    }
               
                }
                
            }
            level++;
        }
        
        return level;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna