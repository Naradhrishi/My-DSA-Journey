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
    public int deepestLeavesSum(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        int sum = 0;
        if(root == null){return sum;}
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            sum = 0;
            for(int i=0; i<s; i++){
                TreeNode curr = q.poll();
                if(curr.left != null){q.offer(curr.left);}
                if(curr.right != null){q.offer(curr.right);}
                sum += curr.val;
            }
            
        }
        return sum;
    }
}
