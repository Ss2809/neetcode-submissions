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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode>pq = new LinkedList<>();
        pq.offer(root);
        while(!pq.isEmpty()){
            int n = pq.size();
            for(int i = 0 ; i < n; i++){
                TreeNode node = pq.poll();
                if(i == n-1){
                    ans.add(node.val);
                }
                if(node.left != null){
                    pq.add(node.left);
                }
                if(node.right != null){
                    pq.add(node.right);
                }
            }
        }
        return ans;
    }
}
