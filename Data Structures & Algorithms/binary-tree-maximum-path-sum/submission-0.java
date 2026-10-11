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
    int maxsum = Integer.MIN_VALUE;
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(dfs(root.left),0);
        int  right = Math.max(dfs(root.right),0);
        int pathSum = root.val+left+right;
        maxsum = Math.max(maxsum, pathSum);
        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxsum;
    }
}
