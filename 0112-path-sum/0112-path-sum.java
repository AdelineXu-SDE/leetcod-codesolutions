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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
        
    }

    private boolean dfs(TreeNode node, int targetSum){
        //base case
        if(node == null) return false;;
        targetSum -= node.val;

        if(node.left == null && node.right == null){
            return targetSum == 0;
        }
        return dfs(node.left, targetSum) || dfs(node.right, targetSum);

    }
}