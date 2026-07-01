class Solution {
    int[][]dir={{0,1},{0,-1},{1,0},{-1,0}};
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n=grid.size();

        int[][]dis=new int[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(dis[i],-1);
        }

        Queue<int[]>q=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid.get(i).get(j)==1){
                    dis[i][j]=0;
                    q.add(new int[]{i,j});
                }
            }
        }


        while(!q.isEmpty()){
            int[]pos=q.poll();
            int r=pos[0];
            int c=pos[1];

            for(int[] d:dir){
                int nr=r+d[0];
                int nc=c+d[1];

                if(nr<0 || nr>=n || nc<0 || nc>=n)continue;

                if(dis[nr][nc]!=-1)continue;

                dis[nr][nc]=dis[r][c]+1;

                q.add(new int[]{nr,nc});

            }

        }

        int low=0;
        int high=2*(n-1);
        int ans=0;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(canReach(dis,mid)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;

    }
        public boolean canReach(int[][]dis,int safe){
            int n=dis.length;
            boolean[][]vis=new boolean[n][n];
            if(dis[0][0]<safe)return false;


            Queue<int[]>q=new LinkedList<>();
            

            q.add(new int[]{0,0});
            vis[0][0]=true;

            while(!q.isEmpty()){
                int[] pos=q.poll();
                int r=pos[0];
                int c=pos[1];

                    if(r==n-1 && c==n-1)return true;

                for(int[] d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];

                    if(nr<0 || nr>=n || nc<0 || nc>=n)continue;
                    if(vis[nr][nc])continue;

                    if(dis[nr][nc]>=safe){
                        vis[nr][nc]=true;
                        q.add(new int[]{nr,nc});
                    }
                }

            }
            return false;
        }
        
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna