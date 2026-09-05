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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        if(root1 == null && root2 == null){return null;}

        return helper(root1, root2);
    }
    public TreeNode helper(TreeNode r1, TreeNode r2){
        TreeNode node = null, left = null, right = null;
        if(r1 == null && r2 == null){return node;}
        if(r1 != null && r2 != null){
            node = new TreeNode(r1.val + r2.val);
            left = helper(r1.left, r2.left);
            right = helper(r1.right, r2.right);
            
        }else if(r1 == null || r2 == null){
            node = new TreeNode(r1 == null ? r2.val : r1.val);
            if(r1 == null){
                left = helper(r1, r2.left);
                right = helper(r1, r2.right);
            }else{
                left = helper(r1.left, r2);
                right = helper(r1.right, r2);
            }
        }
            

        node.left = left;
        node.right = right;

        return node;
    }
}