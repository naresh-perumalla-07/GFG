class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n=isConnected.length;

        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());

        }

            //[[][][]]

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    if(i==j)continue;
                    else{
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                    }

                }
                
            }
        }

        boolean[] vis=new boolean[n];
        int provinces=0;

        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,adj);
                provinces++;
            }
        }
        return provinces;


        
        
    }

    public void dfs(int start,boolean[]vis,ArrayList<ArrayList<Integer>>adj){
        Stack<Integer>s=new Stack<>();

        vis[start]=true;

        s.push(start);

        while(!s.isEmpty()){
            int node=s.pop();

            for(int neigh:adj.get(node)){
                if(!vis[neigh]){
                    vis[neigh]=true;
                    s.push(neigh);
                }
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna