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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp1=head;
        ListNode temp2=head;

        for(int i=1;i<left;i++) temp1=temp1.next;
        temp2=temp1;
       List <Integer> v=new ArrayList<>(); 
      
       for(int i=left;i<=right;i++){
        v.add(temp1.val);
        temp1=temp1.next;
       }
       Collections.reverse(v);
       for(int i=0;i<v.size();i++){
         temp2.val=v.get(i);
         temp2=temp2.next;
       }

        
        return head;
    }

}