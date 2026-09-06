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
    public int getMinimumDifference(TreeNode root) {
        int[] min = new int[2];
        min[0] = Integer.MAX_VALUE;
        min[1] = -1;
        dfs(root, min);
        return min[0];
    }
    public void dfs(TreeNode root, int[] min){
        if(root == null){return;}
        dfs(root.left, min);
        min[0] = (Math.abs(root.val - min[1]) < min[0] && min[1] >= 0) ? Math.abs(root.val - min[1]) : min[0];
        min[1] = root.val;
        dfs(root.right, min);
        return;
       
    }
}