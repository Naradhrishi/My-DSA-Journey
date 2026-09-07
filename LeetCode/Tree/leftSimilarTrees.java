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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> t1Leaves = new ArrayList<>();
        List<Integer> t2Leaves = new ArrayList<>();
        dfs(root1, t1Leaves);
        dfs(root2, t2Leaves);
        return t1Leaves.equals(t2Leaves);

    }
    public void dfs(TreeNode root, List<Integer> l){
        if(root == null){return;}
        if(root.left == null && root.right == null){
            l.add(root.val);
        }
        dfs(root.left, l);
        dfs(root.right, l);
    }
}