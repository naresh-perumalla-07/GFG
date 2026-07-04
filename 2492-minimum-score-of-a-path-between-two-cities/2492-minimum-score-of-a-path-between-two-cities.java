class Solution {
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();

        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());

        }

        for(int[]road:roads){
            int u=road[0];
            int v=road[1];
            int w=road[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});

        }

        int ans=Integer.MAX_VALUE;

        boolean[] vis=new boolean[n+1];

        Queue<Integer>q=new LinkedList<>();

        q.add(1);
        vis[1]=true;

        while(!q.isEmpty()){
            int node=q.poll();
        

            

            for(int neigh[]:adj.get(node)){

                int u=neigh[0];
                // int v=neigh[1];
                int wt=neigh[1];
                ans=Math.min(ans,wt);
                if(!vis[u]){
                    q.add(u);
                    vis[u]=true;

                }
            }
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna