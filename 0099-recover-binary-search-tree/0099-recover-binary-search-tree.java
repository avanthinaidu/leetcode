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
    public void recoverTree(TreeNode root) {
        TreeNode pred = null;
        TreeNode x = null; // the first wrong node
        TreeNode y = null; // the second wrong node
        Deque<TreeNode> stack = new ArrayDeque<>();
        
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pred != null && root.val < pred.val) {
                y = root;
                if (x == null) x = pred;
                else break;
            }
            pred = root;
            root = root.right;
        }
        swap(x, y);
    }
    
    private void swap(TreeNode x, TreeNode y) {
        int temp = x.val;
        x.val = y.val;
        y.val = temp;
    }
}
