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
    public boolean isPalindrome(ListNode head) {
         ListNode p=head;
         ListNode q=head;
         while(q!=null && q.next!=null){
            p=p.next;
            q=q.next.next;

         }

         ListNode previous=null;
         ListNode curr=p;
         while(curr!=null){
            ListNode next=curr.next;
            curr.next=previous;

             previous=curr;
             curr=next;

         }
         ListNode first=head;
         ListNode second=previous;
         while(second!=null){
            if(first.val != second.val){
                return false;
            }
            first=first.next;
            second=second.next;
         }
         return true;
    }
}