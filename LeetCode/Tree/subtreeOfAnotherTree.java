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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;

        if (isSub(root, subRoot)) return true;

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot); 
    }
    public boolean isSub(TreeNode r, TreeNode s){
        if(r == null && s == null){return true;}
        if(r == null || s == null){return false;}
        if(r.val != s.val){return false;}
        return isSub(r.left, s.left) && isSub(r.right, s.right);
        
    }
}