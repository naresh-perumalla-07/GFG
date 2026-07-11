class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[]vis=new boolean[n];
        int cnt=0;

        for(int i=0;i<n;i++){
            if(!vis[i]){
                int[]info=bfs(i,adj,vis);
                int node=info[0];
                int edgCnt=info[1];
                if(node*(node-1)/2==edgCnt)cnt++;
            }
        }
        return cnt;
        
    }

    public int[] bfs(int node,List<List<Integer>>adj,boolean[]vis){
        Queue<Integer>q=new LinkedList<>();
        q.add(node);
        vis[node]=true;
        int size=0;
        int nodeCnt=0;
        while(!q.isEmpty()){
            int n=q.poll();
            nodeCnt++;
            size+=adj.get(n).size();
            for(int neigh:adj.get(n)){
                if(!vis[neigh]){
                    vis[neigh]=true;
                    q.add(neigh);
                }
            }
        }
        return new int[]{nodeCnt,size/2};

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna