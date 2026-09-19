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
    int depth(TreeNode root, int depth){
        if(root == null) return Integer.MAX_VALUE;
        depth++;
        if(root.left == null && root.right == null){
            return depth;
        }
        return Math.min(
            depth(root.left, depth),
            depth(root.right,depth)
        );
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root, 0);
    }
}