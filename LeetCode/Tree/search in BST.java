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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode tempRoot = root;
        while(tempRoot != null){
            if(tempRoot.val == val){
                return tempRoot;
            }
            if(val < tempRoot.val){
                tempRoot = tempRoot.left;
            }else{
                tempRoot = tempRoot.right;
            }
        }
        return null;
    }
}