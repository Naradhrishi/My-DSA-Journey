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
    public int goodNodes(TreeNode root) {
        if(root == null){return 0;}
        return dfs(root, root.val);
    }
    public int dfs(TreeNode root, int prevMax){
        if(root == null){return 0;}
        return (root.val >= prevMax ? 1 : 0) + dfs(root.left, Math.max(prevMax, root.val)) + dfs(root.right, Math.max(prevMax, root.val));
    }
}