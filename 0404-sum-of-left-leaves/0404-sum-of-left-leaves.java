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
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        //DS:tree
        //A:dfs
        dfs(root);
        return sum;
    }
    private void dfs(TreeNode node){
        if(node == null) return;
        dfs(node.left);
        if(node.left != null && node.left.left == null && node.left.right == null){
            sum += node.left.val;
        }
        dfs(node.right);
    }
}