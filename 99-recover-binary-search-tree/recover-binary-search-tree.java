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
    private TreeNode prev;
    private TreeNode swapNumb;
    private TreeNode firstMax;
    private TreeNode secondMax;

    private void check(TreeNode root){
        if(root == null)
            return;
        check(root.left);
        if(prev != null && (prev.val > root.val)){
            if(swapNumb == null){
                swapNumb = prev;
                firstMax = root;
            }else 
                secondMax = root;
        }
        prev = root;
        check(root.right);
    }

    public void recoverTree(TreeNode root) {
        check(root);
        if(secondMax == null && swapNumb != null){
            int temp = swapNumb.val;
            swapNumb.val = firstMax.val;
            firstMax.val = temp;
        }else if(swapNumb != null){
            int temp = swapNumb.val;
            swapNumb.val = secondMax.val;
            secondMax.val = temp;
        }
    }
}