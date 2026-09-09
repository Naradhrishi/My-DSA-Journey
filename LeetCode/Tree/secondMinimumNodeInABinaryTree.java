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
    public int findSecondMinimumValue(TreeNode root) {
        long[] secondMin = new long[2];
        secondMin[0] = root.val;
        secondMin[1] = Long.MAX_VALUE;
        dfs(root, secondMin);
        return (int)(secondMin[1] == Long.MAX_VALUE ? -1 : secondMin[1]);
    }
    public void dfs(TreeNode root, long[] secondMin){
        if(root == null){return;}
        if(root.val > secondMin[0] && root.val < secondMin[1]){
            secondMin[1] = root.val;
        }
        
        dfs(root.left, secondMin);
        dfs(root.right, secondMin);

    }
    
}