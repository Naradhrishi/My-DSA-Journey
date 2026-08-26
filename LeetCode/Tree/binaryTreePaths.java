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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        List<String> past =  new ArrayList<>();

        findPaths(root, path, past);
        return path;

    }
    public void findPaths(TreeNode root, List<String> path, List<String> past){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            past.add(root.val + "");

        }else{
            past.add(root.val + "->");

        }
        findPaths(root.left, path, past);

        findPaths(root.right, path, past);
        if(root.left == null && root.right == null){
            String currPath = "";
            for(int i=0; i<past.size(); i++){
                currPath += past.get(i);
            }
            path.add(currPath);
            past.remove(past.size() -1);

        }else{
            past.remove(past.size() -1);
        }

    }
}