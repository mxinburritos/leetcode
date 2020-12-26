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
    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(!allLessThan(root.left, root.val) || !allGreaterThan(root.right, root.val)) {
            return false;
        }
        return isValidBST(root.left) && isValidBST(root.right);
    }
​
    public boolean allLessThan(TreeNode root, int num) {
        if(root == null) {
            return true;
        }
        if(root.val >= num) {
            return false;
        }
        return allLessThan(root.left, num) && allLessThan(root.right, num);
    }
​
    public boolean allGreaterThan(TreeNode root, int num) {
        if(root == null) {
            return true;
        }
        if(root.val <= num) {
            return false;
        }
        return allGreaterThan(root.left, num) && allGreaterThan(root.right, num);
    }
}
