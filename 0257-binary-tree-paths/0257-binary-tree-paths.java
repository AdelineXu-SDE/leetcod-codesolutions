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
    public List<String> binaryTreePaths(TreeNode root) {
        //DS:BST
        //A:DFS + backtracking
        //O(V+E) O(h)

        List<String> result = new LinkedList<>();
        if(root == null) return result;
        dfs(root, "", result);
        return result;   
    }

    private void dfs(TreeNode node, String path, List<String> result){
        if(node == null){
            return;
        }
        path += node.val;

        if(node.left == null && node.right == null){
            result.add(path);
            return;
        }

        if(node.left != null) dfs(node.left, path + "->", result);
        if(node.right != null) dfs(node.right, path + "->", result);
    }
}