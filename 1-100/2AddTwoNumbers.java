/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode((l1.val + l2.val) % 10);
        ListNode ptr = head;
        int carrier = l1.val + l2.val > 9 ? 1 : 0;
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null && l2 != null){
            ptr.next = new ListNode((l1.val + l2.val + carrier) % 10);
            carrier = l1.val + l2.val + carrier > 9 ? 1 : 0;
            ptr = ptr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        /*
        ptr.next = new ListNode((l1.val + l2.val + carrier) % 10);
        carrier = l1.val + l2.val + carrier > 9 ? 1 : 0;
        l1 = l1.next;
        l2 = l2.next;
        */
        while(true){
        if(l1 == null && l2 != null){
            ptr.next = new ListNode((l2.val + carrier) % 10);
            carrier = l2.val + carrier > 9 ? 1 : 0;
            ptr = ptr.next;
            l2 = l2.next;
        }else if(l2 == null && l1 != null){
            ptr.next = new ListNode((l1.val + carrier) % 10);
            carrier = l1.val + carrier > 9 ? 1 : 0;
            ptr = ptr.next;
            l1 = l1.next;
        }else if(l1 == null && l2 == null && carrier == 1){
            ptr.next = new ListNode(1);
            break;
        }else if(l1 == null && l2 == null && carrier == 0){
            break;
        }
        }
        return head;
    }
}