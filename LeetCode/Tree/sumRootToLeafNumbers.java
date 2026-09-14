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
    public int sumNumbers(TreeNode root) {
        int[] sum = new int[1];
        dfs(root, 0, sum);
        return sum[0];
    }
    public void dfs(TreeNode root, int n, int[] sum){
        if(root == null){return;}

        int val = root.val;
        n *= 10;
        n += val;

        if(root.left == null && root.right == null){
            // add sum 
            sum[0] += n;
        }

        dfs(root.left, n, sum);
        dfs(root.right, n, sum);

    }
}