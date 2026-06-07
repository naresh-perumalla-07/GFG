/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {

        HashMap<Integer,TreeNode>map=new HashMap<>();
        HashSet<Integer>children=new HashSet<>();


        for(int[]d:descriptions){
            int par=d[0];
            int child=d[1];
            int isleft=d[2];

            map.putIfAbsent(par,new TreeNode(par));
            map.putIfAbsent(child,new TreeNode(child));

            TreeNode parNode=map.get(par);
            TreeNode childNode=map.get(child);

            if(isleft==1){
                parNode.left=childNode;
            }else{
                parNode.right=childNode;
            }

            children.add(child);


        }
            for(int node:map.keySet()){
                if(!children.contains(node)){
                    return map.get(node);
                }
            }
            return null;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna