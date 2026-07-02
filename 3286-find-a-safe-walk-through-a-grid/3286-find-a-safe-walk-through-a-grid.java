class Solution {
    int[][]dir={{0,1},{0,-1},{1,0},{-1,0}};
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n=grid.size();
        int m=grid.get(0).size();

        int[][]dist=new int[n][m];

        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],-1);
        }

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);

        int start=grid.get(0).get(0);
        dist[0][0]=start;

        pq.offer(new int[]{start,0,0});

        while(!pq.isEmpty()){
            int[]info=pq.poll();
            int cost=info[0];
            int r=info[1];
            int c=info[2];

            if(cost>dist[r][c])continue;

            for(int[] d:dir){
                int nr=r+d[0];
                int nc=c+d[1];

                if(nr>=n || nr<0 || nc>=m || nc<0)continue;

                int newCost=cost+grid.get(nr).get(nc);

                if(dist[nr][nc]==-1 || newCost<dist[nr][nc]){
                    dist[nr][nc]=newCost;

                    pq.offer(new int[]{newCost,nr,nc});
                }
            }

        }

        return dist[n-1][m-1]<health;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna