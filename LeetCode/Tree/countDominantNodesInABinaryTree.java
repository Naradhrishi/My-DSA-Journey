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
    public int countDominantNodes(TreeNode root) {
        int[] count = new int[1];
        dfs(root, count);
        return count[0];
    }
    public int dfs(TreeNode root, int[] count){
        if(root == null){return 0;}
        int left = dfs(root.left, count);
        int right = dfs(root.right, count);
        if(root.val >= left && root.val >= right){count[0] += 1; return root.val;}
        return Math.max(left,right);
    }
}