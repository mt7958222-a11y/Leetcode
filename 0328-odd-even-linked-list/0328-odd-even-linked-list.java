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
        List<ListNode> odd = new ArrayList<>();
        List<ListNode> even = new ArrayList<>();
         
        ListNode curr=head;
        int pos=1;

        if (head == null || head.next == null) {
            return head;
        }
        while(curr!=null){
            if(pos%2==1){
                odd.add(curr);
            }
            else{
                even.add(curr);
            }
            curr=curr.next;
            pos++;
        }
        for(int i=0;i<odd.size()-1;i++){
            odd.get(i).next=odd.get(i+1);
        }
        for(int j=0;j<even.size()-1;j++){
            even.get(j).next=even.get(j+1);
        }
        if(!even.isEmpty()){
        odd.get(odd.size()-1).next=even.get(0);
        even.get(even.size()-1).next=null;
        }
        else {
             odd.get(odd.size() - 1).next = null;
              }
        return odd.get(0);
    }
}