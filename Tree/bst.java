import java.util.*;
public class bst{
    public static void main(String[] args){
        BinaryTree bst = new BinaryTree();
        bst.insert(76);
        bst.insert(7);
        bst.insert(3);
        bst.insert(12);
        bst.insert(2);
        bst.insert(18);
        bst.insert(6);
        bst.insert(5);
        //bst.printInorder(bst.root);
        //boolean res = bst.search(6);
        //System.out.println(res);
        //bst.bfs();
        //bst.bfsWithEachLevelOnNewLine();
        System.out.println(bst.heightOfBST());
        
        
    }
}
class BinaryTree{
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    
    public void printInorder(Node root){
        if(root == null) return;
        
        printInorder(root.left);
        System.out.println(root.val);
        printInorder(root.right);
    }
    
    public int heightOfBST(){
        Deque<Node> myQ = new ArrayDeque<>();
        int height = 0;
        myQ.offer(this.root);
        int size = 0;
        while(!myQ.isEmpty()){
            size = (size == 0) ? myQ.size() : size;
            Node lastPolled = myQ.poll();
            size--;
            //System.out.print(lastPolled.val+" ");
            if(size == 0){
                //System.out.println();
                height++;
            }
            if(lastPolled.left != null){
                myQ.offer(lastPolled.left);
            }
            if(lastPolled.right != null){
                myQ.offer(lastPolled.right);
            }
            
        }
        return height;
        
    }
    
    public void bfsWithEachLevelOnNewLine(){
        Deque<Node> myQ = new ArrayDeque<>();
        myQ.offer(this.root);
        int size = 0;
        while(!myQ.isEmpty()){
            size = (size == 0) ? myQ.size() : size;
            Node lastPolled = myQ.poll();
            size--;
            System.out.print(lastPolled.val+" ");
            if(size == 0){
                System.out.println();
            }
            if(lastPolled.left != null){
                myQ.offer(lastPolled.left);
            }
            if(lastPolled.right != null){
                myQ.offer(lastPolled.right);
            }
            
        }
    }
    public void bfs(){
        Deque<Node> myQ = new ArrayDeque<>();
        myQ.offer(this.root);
        
        while(!myQ.isEmpty()){
            Node lastPolled = myQ.poll();
            System.out.println(lastPolled.val);
            if(lastPolled.left != null){
                myQ.offer(lastPolled.left);
            }
            if(lastPolled.right != null){
                myQ.offer(lastPolled.right);
            }
            
        }
    }
    public boolean search(int val){
        Node tempRoot = this.root;
        while(tempRoot != null){
            if(tempRoot.val == val){
                return true;
            }
            if(val < tempRoot.val){
                tempRoot = tempRoot.left;
                
            }else{
                tempRoot = tempRoot.right;
            }
        }
        return false;
    }
    
    public void insert(int val){
        Node node = new Node(val);
        if(this.root == null){
            this.root = node;
            return;
        }
        Node rt = this.root;
        while(rt != null){
            if(val < rt.val){
                if(rt.left == null){
                    rt.left = node;
                    break;
                }else{
                    rt = rt.left;
                }
            }else{
                if(rt.right == null){
                    rt.right = node;
                    break;
                }else{
                    rt = rt.right;
                }
            }
        }
    }
}

class Node{
    int val;
    Node left, right;
    
    public Node(int val){
        this.val = val;
        left = right = null;
    }
}
