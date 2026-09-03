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
    public int minDepth(TreeNode root) {
        int[] count = new int[2];
        count[1] = Integer.MAX_VALUE;
        dfs(root, count);
        if(root == null){
            return 0;
        }
        return count[1];
    }
    public void dfs(TreeNode root, int[] count){
        if(root == null){return;}
        count[0] += 1;
        if(root.left == null && root.right == null){
            // leaf node
            if(count[0] < count[1]){
                count[1] = count[0];
            }
        }
        dfs(root.left, count);
        dfs(root.right, count);

        count[0] -= 1;

    }
}