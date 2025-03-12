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
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) return result;
        dfs(root, targetSum);
        return result; 
    }

    private void dfs(TreeNode node, int targetSum){
        if(node == null) return;
        
        
        path.add(node.val);
        targetSum -= node.val;
        if(node.left == null && node.right == null && targetSum == 0){
            result.add(new LinkedList<>(path));
        }
        dfs(node.left, targetSum);
        dfs(node.right, targetSum);

        path.removeLast();
    }
}