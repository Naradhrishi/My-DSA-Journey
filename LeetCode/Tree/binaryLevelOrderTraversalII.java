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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> res = new LinkedList<>();
        if(root == null){return res;}
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> subRes = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr  = q.poll();
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
                subRes.add(curr.val);
            }
            res.addFirst(subRes);

        }
        return res;
    }
   
}