/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return sum(root, sum, 0);
    }
    
    public boolean sum(TreeNode root, int sum, int total) {
        if(root == null) {
            return false;
        } else if (root.val + total == sum && (root.left == null && root.right == null)) {
            return true;
        }
        return sum(root.left, sum, root.val + total) || sum(root.right, sum, root.val + total);
    }
}
