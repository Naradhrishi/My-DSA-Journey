/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        List<TreeNode> ans = new ArrayList<>();
        dfs(original, cloned, target, ans);
        return ans.get(0);
    }
    public void dfs(TreeNode original, TreeNode cloned,TreeNode target, List<TreeNode> ans){
        if(original == null || cloned == null){return;}
        if(target == original){
            ans.add(cloned);
        }
        if(ans.size() == 0){
            
        dfs(original.left, cloned.left, target, ans);
        dfs(original.right, cloned.right, target, ans);
        }
    }
}