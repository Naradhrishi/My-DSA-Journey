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
    public boolean isCousins(TreeNode root, int x, int y) {
        int f = dfs(root, x, y);
        if(f == -1 || f == 0){return false;}
        int l = dfs(root, y, x);
        return l == f;

    }
    private int dfs(TreeNode root, int x, int y){
        if(root ==  null){return 0;}
        if(root.val == x){return 1;}
        int left = dfs(root.left, x, y);
        int right = dfs(root.right, x, y);
        if(left == -1 || right == -1){return -1;}
        if(left != 0 || right != 0){
            if(left == 0){
                if(root.left != null && root.left.val == y){return -1;}
                else{return right + 1;}
            }else{
                if(root.right != null && root.right.val == y){return -1;}
                else{return left + 1;}
            }
        }
        return 0;

    }
}