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
    private List<String> list = new ArrayList<>();
    private void getPath(TreeNode root,String path){
        if(root == null) return;
        path = path + root.val;
        if(root.left == null && root.right == null){
            list.add(path);
            return;
        }
        if(root.left != null){
            getPath(root.left, path + "->");
        }
        if(root.right != null){
            getPath(root.right, path + "->");
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        getPath(root, "");
        return list;
    }
}