/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node compute(Node head) {
        // code here
        Stack<Node>s=new Stack<>();
        
        Node temp=head;
        
        while(temp!=null){
            s.push(temp);
            temp=temp.next;
        }
        
        int maxSoFar=Integer.MIN_VALUE;
        
        Node newHead=null;
        
        while(!s.isEmpty()){
            Node curr=s.pop();
            if(curr.data>=maxSoFar){
                maxSoFar=curr.data;
                curr.next=newHead;
                
                newHead=curr;
            }
        }
        
        return newHead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna