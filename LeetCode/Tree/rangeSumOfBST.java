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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] rangeSum = new int[3];
        rangeSum[0] = low;
        rangeSum[1] = high;
        dfs(root, rangeSum);
        return rangeSum[2];
        
    }
    public void dfs(TreeNode root, int[] rangeSum){
        if(root == null){return;}
        if(root.val >= rangeSum[0] && root.val <= rangeSum[1]){
            rangeSum[2] += root.val;
        }
        dfs(root.left, rangeSum);
        dfs(root.right, rangeSum);
    }
}