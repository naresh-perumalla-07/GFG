/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
}*/
class Solution {
    int ans=0;
    public int longestConsecutive(Node root) {
        
        if(root==null)return -1;
        
        dfs(root,1);
        
        return ans==1 ? -1 : ans;// code here
        
    }
    
    public void dfs(Node node,int len){
        if(node==null)return;
        
        ans=Math.max(ans,len);
        
        if(node.left!=null){
            if(node.left.data==node.data+1){
                dfs(node.left,len+1);
                
            }else{
                dfs(node.left,1);
            }
        }
        if(node.right!=null){
            if(node.right.data==node.data+1){
                dfs(node.right,len+1);
            }else{
                dfs(node.right,1);
            }
        }
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna