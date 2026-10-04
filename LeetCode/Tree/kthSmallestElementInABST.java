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
    public int kthSmallest(TreeNode root, int k) {
        int[] c = new int[1];
        return inorder(root, k, c);
    }
    private int inorder(TreeNode root, int k, int[] c){
        if(root ==  null){return 0;}
        int left = inorder(root.left, k, c);
        c[0] += 1;
        if(c[0] == k){return root.val;}
        int right = inorder(root.right, k, c);
        return Math.max(left, right);
    }
}