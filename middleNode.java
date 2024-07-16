// Brute - Find length of the linked list and traverse till half of the linkedlist to get the middle

class Solution {
    public ListNode middleNode(ListNode head) {
       
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
}
