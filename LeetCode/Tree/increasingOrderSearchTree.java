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
    TreeNode newRoot = null, prev = null;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){return null;}
        increasingBST(root.left);
        if(this.newRoot == null){
            newRoot = root;
            prev = root;
        }else{
            prev.right = root;
            prev = root;
        }
        root.left = null;
        increasingBST(root.right);
        return newRoot;
    }
    
}