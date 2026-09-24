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
    private TreeNode prev = null, first = null, second = null, last = null, ultimateRoot = null;
    public void recoverTree(TreeNode root) {
        if(root == null){return;}
        if(ultimateRoot == null){ultimateRoot = root;}
        recoverTree(root.left);
        if(prev != null){
            if(root.val < prev.val && first == null){
                first = prev;
                second = root;
            }else if(root.val < prev.val){last = root;}
        }
        prev = root;
        recoverTree(root.right);
        if(root == ultimateRoot){
            int temp = 0;
            if(last != null){
                temp = last.val;
                last.val = first.val;
                first.val = temp;
            }else if(last == null){
                temp = second.val;
                second.val = first.val;
                first.val = temp;
            }
        }
    }
}