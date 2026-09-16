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
    public boolean isValidBST(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        check(root,lst);
        for(int i=1; i<lst.size(); i++){
            if(lst.get(i) <= lst.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public void check(TreeNode root,List lst){
        if(root == null){
            return;
        }
        check(root.left,lst);
        lst.add(root.val);
        check(root.right,lst);
    }
}