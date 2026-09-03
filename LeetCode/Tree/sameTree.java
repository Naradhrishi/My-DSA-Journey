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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        int[] first = new int[201];
        int[] second = new int[201];
        int[] count = new int[1];

        dfs(p, first, count);
        int firstCount = count[0];
        count[0] = 0;
        dfs(q, second, count);
        if(count[0] != firstCount){return false;}
        for(int i=0; i<firstCount; i++){
            if(first[i] != second[i]){
                return false;
            }
        }
        return true;

    }
    public void dfs(TreeNode p, int[] tree, int[] count){
        if(p == null){
            tree[count[0]] = Integer.MIN_VALUE;
            count[0] += 1;
            return;
        }
        tree[count[0]] = p.val;
        count[0] += 1;
        dfs(p.left, tree, count);
        dfs(p.right, tree, count);
    }
}