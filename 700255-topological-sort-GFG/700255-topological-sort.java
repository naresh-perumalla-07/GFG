class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        //dfs
        
        boolean[]vis=new boolean[V];
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[]edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,adj,ans,vis,s);
            }
        }
        for(int i=0;i<V;i++){
            ans.add(s.pop());
        }
        return ans;
    }
    public void dfs(int start,ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>ans,boolean[]vis,Stack<Integer>s){
        vis[start]=true;
       for(int neigh:adj.get(start)){
           if(!vis[neigh]){
               dfs(neigh,adj,ans,vis,s);
               
           }
       }
       s.push(start);
       
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna