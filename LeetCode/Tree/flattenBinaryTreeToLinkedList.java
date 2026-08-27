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
    public void flatten(TreeNode root) {
        List<TreeNode> preOrder = new ArrayList<>();
        dfs(root, preOrder);
        TreeNode prev = null;
        for(int i=0; i<preOrder.size(); i++){
            preOrder.get(i).left = null;
            if(prev != null){
                prev.right = preOrder.get(i);
            }
            prev = preOrder.get(i);

        }
        return;

    }
    public void dfs(TreeNode root, List<TreeNode> preOrder){
        if(root == null){return;}
        preOrder.add(root);
        dfs(root.left, preOrder);
        dfs(root.right, preOrder);

    }
}