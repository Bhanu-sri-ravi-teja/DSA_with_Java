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
    int val ;
    boolean res = true;
    void check(TreeNode root){
        if(root == null) return;
        check(root.left);
        if(root.val != val){
            res = false;
        }
        check(root.right);
    }
    public boolean isUnivalTree(TreeNode root) {
        val = root.val;
        check(root);
        return res;
    }
}