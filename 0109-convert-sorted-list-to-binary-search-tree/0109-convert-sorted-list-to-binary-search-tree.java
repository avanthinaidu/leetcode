/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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





public class Solution {
    private ListNode current;

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;

        int size = getSize(head);
        current = head;

        return convertListToBST(0, size - 1);
    }

    private int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    private TreeNode convertListToBST(int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        TreeNode leftChild = convertListToBST(left, mid - 1);

        TreeNode node = new TreeNode(current.val);
        node.left = leftChild;

        current = current.next;

        node.right = convertListToBST(mid + 1, right);

        return node;
    }
}
