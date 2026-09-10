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
    public int averageOfSubtree(TreeNode root) {
        int[] count = new int[1]; // count[0] = number of equal avg nodes
        dfs(root, count);
        return count[0];
    }
    public int[] dfs(TreeNode root, int[] count){
        if(root == null){return new int[]{-1, 0};}
        
        int[] left = dfs(root.left, count);
        int[] right = dfs(root.right, count);

        int sum = root.val;
        if(left[0] != -1){
            sum += left[0];
        }
        if(right[0] != -1){
            sum += right[0];
        }
        if(Math.round(sum/(left[1] + right[1] + 1)) == root.val){
            count[0] += 1;
        }
        return new int[]{sum, (left[1] + right[1] + 1)};
    }
}