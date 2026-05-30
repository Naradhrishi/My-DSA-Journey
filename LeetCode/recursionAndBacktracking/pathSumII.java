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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> subAns = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans = helper(root, targetSum, subAns, ans);
        return ans;
    }
    
    public List<List<Integer>> helper(TreeNode root, int tarSum, List<Integer> subAns, List<List<Integer>> ans){
        if(root == null) return ans;
        subAns.add(root.val);
        System.out.println(subAns);

        if(root.left == null && root.right == null && tarSum-root.val == 0){
            ans.add(new ArrayList<>(subAns));
            
            
        }else if(root.left == null && root.right == null){
            subAns.remove(Integer.valueOf(root.val));
        }
        helper(root.left, tarSum-root.val, new ArrayList<>(subAns), ans);
        helper(root.right, tarSum-root.val, new ArrayList<>(subAns), ans);
        return ans;
        
    }
}