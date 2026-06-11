class Solution {
    public int assignEdgeWeights(int[][] edges) {
        int n=edges.length+1;
        boolean[]vis=new boolean[n+1];
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[]edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Queue<Integer>q=new LinkedList<>();

        q.add(1);
        vis[1]=true;


        int level=0;

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
            int node=q.poll();

            for(int neigh:adj.get(node)){
                if(!vis[neigh]){
                    vis[neigh]=true;
                    q.add(neigh);
                }

            }
            }
            level++;

        }

        int depth=level-1;

        long MOD = 1_000_000_007L;

        return (int) power(2, depth - 1, MOD);




        
    }
    private long power(long base, long exp, long mod) {
    long result = 1;

    while (exp > 0) {

        if ((exp & 1) == 1) {
            result = (result * base) % mod;
        }

        base = (base * base) % mod;
        exp >>= 1;
    }

    return result;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna