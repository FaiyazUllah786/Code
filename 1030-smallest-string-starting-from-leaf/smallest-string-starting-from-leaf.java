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
    ArrayList<String> ans = new ArrayList<>();
    public String smallestFromLeaf(TreeNode root) {
        addString(root,"");
        Collections.sort(ans);
        return ans.get(0);
    }

    public void addString(TreeNode root,String str){
        if(root==null) return;
        str+=(char)(97+root.val);
        if(root.left==null && root.right==null){
            StringBuilder sb = new StringBuilder(str);
            String nodeStr = sb.reverse().toString();
            ans.add(nodeStr);
            return;
        }
        addString(root.left,str);
        addString(root.right,str);
    }
}