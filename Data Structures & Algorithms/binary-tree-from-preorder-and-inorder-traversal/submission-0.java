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
    int index = 0;
     public TreeNode build(int[] pre, int[] in, int start, int end) {
        if(start > end){
            return null;
        }
        int val = pre[index++];
        TreeNode root = new TreeNode(val);
        int mid = start;
        while(in[mid] != val){
            mid++;
        }
        root.left = build(pre,in, start, mid-1);
        root.right = build(pre,in,mid+1,end);
        return root;
     }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
    }
}
