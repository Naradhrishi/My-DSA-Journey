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
    public boolean isBalanced(TreeNode root) {
        boolean[] ans = new boolean[1];
        ans[0] = true;
        dfs(root, ans);
        return ans[0];

    }
    public int dfs(TreeNode root, boolean[] ans){
        if(root == null){return 0;}
        if(ans[0] == false){return 0;}
        int lHeight = dfs(root.left, ans);
        int rHeight = dfs(root.right, ans);
        if(Math.abs(lHeight - rHeight) > 1){ ans[0] = false;}
        return Math.max(lHeight, rHeight) + 1;

    }
}