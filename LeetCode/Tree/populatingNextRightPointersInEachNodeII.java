/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){return null;}
        Node nextLevel = root, curr = null, next = null;
        while(nextLevel != null){
            if(curr == null){
                // assign curr here with nextLevel
                curr = nextLevel;
                next = nextLevel;
                while(nextLevel != null && next != null){
                    if(next.left != null){nextLevel = next.left; break;}
                    if(next.right != null){nextLevel = next.right; break;}
                    next = next.next;
                    
                }
                if(next == null){break;} 

            }
            Node firstNode = null, secondNode = null;
            while(curr != null){
                if(curr.left != null && firstNode == null){firstNode = curr.left;}
                if(curr.right != null && firstNode == null){firstNode = curr.right;}
                
                if(curr.left != null && secondNode == null && firstNode != null && curr.left != firstNode){secondNode = curr.left;}
                if(curr.right != null && secondNode == null && firstNode != null && curr.right != firstNode){secondNode = curr.right;}

                while(firstNode != null && secondNode != null){
                    firstNode.next = secondNode;
                    firstNode = secondNode;
                    secondNode = null;
                    if(curr.right != null && curr.right != firstNode){secondNode = curr.right;}
                }
                
                curr = curr.next;
            }
        }
        return root;
    }
}