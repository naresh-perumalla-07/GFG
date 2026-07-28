class Solution {
    public int shortestPath(int V, int src, int dest, int[][] edges) {
        // code here
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
            
        }
        
        for(int[]edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            
            adj.get(u).add(new int[]{v,wt});
            adj.get(v).add(new int[]{u,wt});
        }
        
        int[]dist=new int[V+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        
        pq.add(new int[]{src,0});
        
        dist[src]=0;
        
        while(!pq.isEmpty()){
            int[]p=pq.poll();
            
            int node=p[0];
            int dis=p[1];
            
            if(dis>dist[node])continue;
            
            for(int[]neigh:adj.get(node)){
                int nNode=neigh[0];
                int nDis=neigh[1];
                
                int newDist=dist[node]+nDis;
                
                if(dist[nNode]>newDist){
                    dist[nNode]=newDist;
                    pq.add(new int[]{nNode,newDist});
                }
                
            }
            
           
        }
        
        return dist[dest]==Integer.MAX_VALUE ? -1 : dist[dest];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna