class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        int n=edges.length;
        
        int m=edges[0].length;
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[]edge:edges){
            int u=edge[0];
            int v=edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        int[]color=new int[V];
        
        Arrays.fill(color,-1);
      
        boolean ans=false;
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                ans=bfs(i,color,adj);
                if(!ans)return false;
                
            }
        }
        
        return true;
    }
    
    public boolean bfs(int start,int[]color, ArrayList<ArrayList<Integer>>adj){
        
        Queue<Integer>q=new LinkedList<>();
        
       color[start]=0;
        
        q.add(start);
        while(!q.isEmpty()){
          
           int node=q.poll();
            for(int neigh:adj.get(node)){
                if(color[neigh]==-1){
                    color[neigh]=1-color[node];
                    q.add(neigh);
                }else if(color[neigh]==color[node])return false;
            }
        }
        return true;
        // color[start]=1-color[]
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna