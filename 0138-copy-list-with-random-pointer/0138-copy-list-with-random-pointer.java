class Solution {
    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        // Step 1: Copy and merge
        Node temp = head;

        while (temp != null) {
            Node copy = new Node(temp.val);

            copy.next = temp.next;
            temp.next = copy;

            temp = copy.next;
        }

        // Step 2: Copy random pointers
        temp = head;

        while (temp != null) {
            if (temp.random != null)
                temp.next.random = temp.random.next;

            temp = temp.next.next;
        }

        // Step 3: Split
        Node dummy = new Node(0);
        Node copyTail = dummy;

        temp = head;

        while (temp != null) {

            Node copy = temp.next;

            temp.next = copy.next;   // Restore original list

            copyTail.next = copy;    // Build copied list
            copyTail = copy;

            temp = temp.next;
        }

        return dummy.next;
    }
}