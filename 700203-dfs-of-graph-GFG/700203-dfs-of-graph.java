class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        
       int size=adj.size();
       
       boolean[] vis=new boolean[size];
       
       for(int i=0;i<size;i++){
           
           if(!vis[i]){
               DFS(i,ans,adj,vis);
           }
           
       }
        return ans;
    }
    public void DFS(int node,ArrayList<Integer>ans,ArrayList<ArrayList<Integer>>adj,boolean[]vis){
        
         vis[node] = true;

        ans.add(node);

        for(int neigh : adj.get(node)) {

            if(!vis[neigh]) {

                DFS(neigh,ans, adj, vis);
            }
        }
        
        
        
        
        
        
        
        
        
        // int size=adj.size();
        
        // boolean[] vis=new boolean[size];
        
        // Stack<Integer>s=new Stack<>();
        
        // vis[start]=true;
        // s.add(start);
        
        // while(!s.isEmpty()){
        //     int node=s.pop();
        //     ans.add(node);
            
        //     for(int neigh:adj.get(node)){
        //         if(!vis[neigh]){
        //             vis[neigh]=true;
        //             s.push(neigh);
        //         }
        //     }
        // }
        // return ans;
        
        
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna