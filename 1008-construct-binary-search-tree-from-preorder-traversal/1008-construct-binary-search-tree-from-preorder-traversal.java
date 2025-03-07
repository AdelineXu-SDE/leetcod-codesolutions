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
    private int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        //DS: tree
        //O(V+E)
        return buildBST(preorder, Integer.MAX_VALUE);    
    }

    private TreeNode buildBST(int[] preorder, int upperBound){
        if(index >= preorder.length || preorder[index] > upperBound) return null;

        TreeNode root = new TreeNode(preorder[index]);
        index++;

        root.left = buildBST(preorder, root.val);
        root.right = buildBST(preorder, upperBound);

        return root;
    }   
}