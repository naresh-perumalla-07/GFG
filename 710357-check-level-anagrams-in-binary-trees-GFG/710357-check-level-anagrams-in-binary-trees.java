/* Structure of binary tree Node
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public boolean areAnagrams(Node root1, Node root2) {
        
        //NEED TO SOLVE THISSSS  AGAINNNNNNNN 

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        q1.add(root1);
        q2.add(root2);

        while (!q1.isEmpty() && !q2.isEmpty()) {

            int size1 = q1.size();
            int size2 = q2.size();

            // Different number of nodes at this level
            if (size1 != size2) {
                return false;
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            // Process current level of tree 1
            for (int i = 0; i < size1; i++) {
                Node curr = q1.poll();

                map.put(curr.data, map.getOrDefault(curr.data, 0) + 1);

                if (curr.left != null) {
                    q1.add(curr.left);
                }

                if (curr.right != null) {
                    q1.add(curr.right);
                }
            }

            // Process current level of tree 2
            for (int i = 0; i < size2; i++) {
                Node curr = q2.poll();

                if (!map.containsKey(curr.data)) {
                    return false;
                }

                map.put(curr.data, map.get(curr.data) - 1);

                if (map.get(curr.data) == 0) {
                    map.remove(curr.data);
                }

                if (curr.left != null) {
                    q2.add(curr.left);
                }

                if (curr.right != null) {
                    q2.add(curr.right);
                }
            }

            // Some values/frequencies from tree 1 were not matched
            if (!map.isEmpty()) {
                return false;
            }
        }

        return q1.isEmpty() && q2.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna