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
    public int sumRootToLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        int[] sum = new int[1];
        dfs(root, sb, sum);
        return sum[0];
    }
    public void dfs(TreeNode root, StringBuilder sb, int[] sum){
        if(root == null){return;}
        sb.append(root.val);
        if(root.left == null && root.right == null){
            String binary = sb.toString();
            sum[0] += Integer.parseInt(binary,2);
            //System.out.println(sum[0] + "  " + binary);
            
        }else{
        
            dfs(root.left, sb, sum);
            dfs(root.right, sb, sum);
        }
        sb.deleteCharAt(sb.length()-1);
        
    }
}