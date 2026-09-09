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
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = root.val;
        dfs(root, max);
        return max[0];
    }
    public int dfs(TreeNode root, int[] max){
        if(root == null){return 0;}
        int left = dfs(root.left, max);
        int right = dfs(root.right, max);
        if(left + right + root.val > max[0]){
            max[0] = left + right + root.val;
        }
        if(left + root.val > max[0]){
            max[0] = left + root.val;
        }
        if(right + root.val > max[0]){
            max[0] = right + root.val;
        }
        if(root.val > max[0]){
            max[0] = root.val;
        }
        return Math.max(root.val, Math.max(right + root.val, root.val + left));
    }
}