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
    private int totalSum = 0;
    public int sumNumbers(TreeNode root) {
        //DS: Tree
        //A: dfs
        //O(n), O(h);

        if(root == null) return 0;

        dfs(root, 0);  
        return totalSum;  
    }
    private void dfs(TreeNode node, int sum){
        if(node == null) return;
        //base case
        sum = sum * 10 + node.val;
        if(node.left == null && node.right == null){
            totalSum += sum; 
            return;
        }
        dfs(node.left, sum);
        dfs(node.right, sum);
    }
}