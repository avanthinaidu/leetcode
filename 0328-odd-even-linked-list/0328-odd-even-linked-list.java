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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
          return head; 
        }
        ListNode even = head.next;
        ListNode odd = head;
        ListNode evenHead = even;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}

// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         ListNode tail = head;
//         int i=0;
//         if(head.next==null || head==null || head.next.next==null){
//             return head;
//         }
//         while(tail.next!=null){
//             tail=tail.next;
//          
        
    
