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
    public ListNode appendNodes(ListNode head,ListNode main, ListNode node, int sum){
        if(node==null){
            return head.next;
        }
        if(node.val!=0){
            return appendNodes(head,main,node.next,sum+node.val);
        }
        else{
            main.val=sum;
            if(node.next==null){
                main.next=null;
            }
            return appendNodes(head,main.next,node.next,0);
        }
    }
    public ListNode mergeNodes(ListNode head) {
        return appendNodes(head,head,head,0);
    }
}
