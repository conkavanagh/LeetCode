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
    public String tree2str(TreeNode root) {
        return treeBuild(root);
    }

    private String treeBuild(TreeNode node)
    {
        if(node == null) return "";
        else if(node.left == null && node.right == null) return ""+node.val;
        else if(node.right == null) return node.val+"("+treeBuild(node.left)+")";
        return node.val+"("+treeBuild(node.left)+")"+"("+treeBuild(node.right)+")";
    }
}