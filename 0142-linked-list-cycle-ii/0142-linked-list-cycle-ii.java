/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=head;
        if(head==null || head.next==null){
            return null;
        }
        while(temp2!=null && temp2.next!=null){
            temp1=temp1.next;
            temp2=temp2.next.next;
            if(temp1==temp2)
                break;
            

        }
        if(temp2==null || temp2.next==null){
            return null;
        }
        temp1=head;
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}