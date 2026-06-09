class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[]edge:prerequisites){
            int u=edge[0];
            int v=edge[1];
            adj.get(v).add(u);
        }
        
        int[]indeg=new int[n];
        
       for(int i=0;i<n;i++){
           for(int neigh:adj.get(i)){
               indeg[neigh]++;
           }
       }
       
       Queue<Integer>q=new LinkedList<>();
       
       for(int i=0;i<n;i++){
           if(indeg[i]==0)q.add(i);
       }
       
       int cnt=0;
       
       while(!q.isEmpty()){
           int node=q.poll();
                   cnt++;
           for(int neigh:adj.get(node)){
               indeg[neigh]--;
               if(indeg[neigh]==0){
                   q.add(neigh);
               }
           }
       }
       return cnt==n;
        // code here
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna