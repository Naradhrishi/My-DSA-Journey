/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Node> q = new ArrayDeque<>();
        if(root == null){return res;}
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> subRes = new ArrayList<>();
            for(int i=0; i<s; i++){
                Node curr = q.poll();
                subRes.add(curr.val);
                for(int j=0; j<curr.children.size(); j++){
                    q.offer(curr.children.get(j));
                }
            }
            res.add(subRes);
        }
        return res;
    }
}