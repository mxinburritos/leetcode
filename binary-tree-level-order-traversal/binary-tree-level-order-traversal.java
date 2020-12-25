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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        create(root, 0);
        return list;
    }
​
    public void create(TreeNode root, int level) {
        if(root == null) {
            return;
        }
        if(list.size() - 1 < level || list.get(level) == null) {
            List<Integer> levelList = new ArrayList<>();
            levelList.add(root.val);
            list.add(level, levelList);
        } else {
            list.get(level).add(root.val);
        }
        create(root.left, level + 1);
        create(root.right, level + 1);
    }
}
