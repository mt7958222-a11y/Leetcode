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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;        
        ListNode temp1=dummy;        
        ListNode temp2=dummy;        
        while(n>0){
             temp2=temp2.next;
             n--;
        }
        while(temp2.next!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1.next=temp1.next.next;
        return dummy.next;
    }
}