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
public class SwapNodesInPair {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print the original linked list
        System.out.println("Original Linked List:");
        printList(head);

        // Swap pairs
        Solution solution = new Solution();
        ListNode swappedHead = solution.swapPairs(head);

        // Print the swapped linked list
        System.out.println("Linked List After Swapping Pairs:");
        printList(swappedHead);
    }

    // Utility function to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


 class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null|| head.next==null)
        return head;

        ListNode curr=head.next.next;
        ListNode prev=head;
        head=head.next;
        head.next=prev;

        while(curr!=null && curr.next!=null){
            prev.next=curr.next;
            prev=curr;
            ListNode temp=curr.next.next;
            curr.next.next=curr;
            curr=temp;
        }
        prev.next=curr;

        return head;  
    }
}
