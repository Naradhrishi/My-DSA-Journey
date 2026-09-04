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
    public int findTilt(TreeNode root) {
        int[] sum = new int[1];
        dfs(root, sum);
        return sum[0];
    }
    public int dfs(TreeNode root, int[] sum){
        if(root == null){ return 0;}
        int left = dfs(root.left, sum);
        int right = dfs(root.right, sum);
        sum[0] += Math.abs(left - right);

        return left + right + root.val ;

    }
}