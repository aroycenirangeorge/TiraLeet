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
    public ListNode remove(ListNode head, ListNode node){
        if(node==null || node.next==null){
            return head;
        }
        if(node.val==node.next.val){
            node.next=node.next.next;
            return remove(head,node);
        } else {
            return remove(head,node.next);
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        return remove(head, head);
    }
}
