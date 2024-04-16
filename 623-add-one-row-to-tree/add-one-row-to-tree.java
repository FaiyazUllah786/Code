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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot = new TreeNode(val,root,null);
            return newRoot;
        }
        dfs(root,val,depth,1);
        return root;
    }
    public void dfs(TreeNode root,int val,int depth,int level){
        if(root==null) return;
        if(level==depth-1){
            root.left = new TreeNode(val,root.left!=null?root.left:null,null);
            root.right = new TreeNode(val,null,root.right!=null?root.right:null);
            return;
        }
        dfs(root.left,val,depth,level+1);
        dfs(root.right,val,depth,level+1);
    }
}