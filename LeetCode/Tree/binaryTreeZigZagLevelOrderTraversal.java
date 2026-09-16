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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        if(root == null){return res;}
        q.offer(root);
        boolean isRight = true;
        while(!q.isEmpty()){
            List<Integer> subRes = new ArrayList<>();
            int qSize = q.size();
            for(int i=1; i<=qSize; i++){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
                subRes.add(curr.val);

            }
            if(!isRight){
                Collections.reverse(subRes);
            }
            res.add(subRes);
            isRight = !isRight;
        }
        return res;
    }
}