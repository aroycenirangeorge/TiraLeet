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
    public ListNode twoPointer(ListNode i, ListNode j){
        if(j==null){
            return i;
        }
        else if(j.next==null){
            return i;
        }
        return twoPointer(i.next, j.next.next);
    }
    public ListNode middleNode(ListNode head) {
        return twoPointer(head,head);
    }
}
