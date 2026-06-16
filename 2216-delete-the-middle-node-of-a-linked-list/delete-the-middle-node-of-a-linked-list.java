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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int idx=0;
        if(head.next==null){
            return null;
        }
        while(temp!=null){
            idx++;
            temp=temp.next;

        }
        int middlenode=idx/2;
        ListNode temp2=head;

        for(int i=0;i<middlenode-1;i++){
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        return head;
        

        
    }
}