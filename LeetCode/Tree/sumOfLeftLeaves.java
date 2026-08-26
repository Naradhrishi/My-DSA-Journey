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
    public int sumOfLeftLeaves(TreeNode root) {
        int[] tempSum =  new int[1];
        tempSum[0] = 0;
        travel(root, tempSum, false);
        return tempSum[0];
    }
    public void travel(TreeNode root, int[] tempSum, boolean flag){
        if(root == null){
            return;
        }
        travel(root.left, tempSum, true);

        if(root.left == null && root.right ==  null && flag){
            tempSum[0] += root.val;
        }

        travel(root.right, tempSum, false);

    }
}