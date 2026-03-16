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
    public int convert(ListNode node, int sum){
        if(node==null){
            return sum;
        }
        sum=sum*2+node.val;
        return convert(node.next,sum);
    }
    public int getDecimalValue(ListNode head) {
        return convert(head,0);
    }
}
