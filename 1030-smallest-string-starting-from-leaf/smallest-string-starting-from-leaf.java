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
    String ans = "zzzzzzzzzzzzzzzzzzzzzzzzzz";
    public String smallestFromLeaf(TreeNode root) {
        addString(root,"");
        return ans;
    }

    public void addString(TreeNode root,String str){
        if(root==null) return;
        str+=(char)(97+root.val);
        if(root.left==null && root.right==null){
            StringBuilder sb = new StringBuilder(str);
            String nodeStr = sb.reverse().toString();
            if(nodeStr.compareTo(ans)<0){
                ans=nodeStr;
            }
            return;
        }
        addString(root.left,str);
        addString(root.right,str);
    }
}