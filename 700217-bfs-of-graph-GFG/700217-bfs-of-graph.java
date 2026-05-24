class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        bfs(0,adj,ans);
        return ans;
    }
    
    public ArrayList<Integer> bfs(int start,ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>ans){
        int size=adj.size();
        
        boolean[] vis=new boolean[size];
        
        Queue<Integer>q=new LinkedList<>();
        
        
        vis[start]=true;
        q.add(start);
        
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            
            for(int neigh:adj.get(node)){
                if(!vis[neigh]){
                    vis[neigh]=true;
                    q.add(neigh);
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna