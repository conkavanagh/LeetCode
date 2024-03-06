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
        return checkValidity(root);
    }

    private long minVal = Long.MIN_VALUE;
    private boolean checkValidity(TreeNode node){
        if(node == null) return true;
        if(!checkValidity(node.left)) return false;

        if (minVal >= node.val) return false; 

        minVal = node.val;

        if(!checkValidity(node.right)) return false;

        return true;
    }

}