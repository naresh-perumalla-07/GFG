class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
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
        
        boolean[] vis=new boolean[V];
        
        
        int cnt=0;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                ArrayList<Integer>comp=new ArrayList<>();
                
                dfs(i,adj,ans,vis,comp);
                ans.add(comp);
                cnt+=1;
            }
        }
        
        return ans;
    }
    
    public void dfs(int node, ArrayList<ArrayList<Integer>>adj, ArrayList<ArrayList<Integer>>ans,boolean[]vis,ArrayList<Integer>comp){
        vis[node]=true;
        comp.add(node);
        
        for(int Node:adj.get(node)){
            if(!vis[Node]){
                dfs(Node,adj,ans,vis,comp);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna