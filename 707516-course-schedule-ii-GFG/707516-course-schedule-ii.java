class Solution {
    public ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[]edge:prerequisites){
            int u=edge[0];
            int v=edge[1];
            adj.get(v).add(u);
        }
        int[] indeg=new int[n];
        
        for(int i=0;i<n;i++){
            for(int niegh:adj.get(i)){
                indeg[niegh]++;
            }
        }
        
        Queue<Integer>q=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            if(indeg[i]==0)q.add(i);
            
    
        }
        
        // int[]ans=new int[n];
        
        ArrayList<Integer>ans=new ArrayList<>();
        
        int cnt=0;
        
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            // ans[cnt]=node;
            cnt++;
            
            for(int neigh:adj.get(node)){
                indeg[neigh]--;
                if(indeg[neigh]==0)q.add(neigh);
            }
        }
        ArrayList<Integer>emp=new ArrayList<>();
        
        return cnt==n ? ans:new ArrayList<>();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna