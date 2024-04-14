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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        addLeft(root,false);
        return sum;
    }
    public void addLeft(TreeNode root,boolean add){
        if(root.left==null&&root.right==null){
            if(add) sum+=root.val;
            return;
        }
        if(root.left!=null)
            addLeft(root.left,true);
        if(root.right!=null)
            addLeft(root.right,false);
    }
}