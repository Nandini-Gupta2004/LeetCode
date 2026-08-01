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

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        // Create a copy of the original list
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode curr = head;

        while (curr != null) {
            temp.next = new ListNode(curr.val);
            temp = temp.next;
            curr = curr.next;
        }

        // Reverse the copied list
        ListNode revHead = reverse(dummy.next);

        // Compare original and reversed copy
        ListNode t1 = head;
        ListNode t2 = revHead;

        while (t1 != null && t2 != null) {
            if (t1.val != t2.val)
                return false;

            t1 = t1.next;
            t2 = t2.next;
        }

        return true;
    }
}