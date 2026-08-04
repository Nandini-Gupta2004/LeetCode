
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        int[] nums = new int[n];
        temp = head;
        int i = 0;
        while (temp != null) {
            nums[i++] = temp.val;
            temp = temp.next;
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (st.isEmpty()) {
                st.push(nums[j]);
                nums[j] = 0;
            } else if (st.peek() <= nums[j]) {
                int num = nums[j]; // Save current value
                while (!st.isEmpty() && st.peek() <= num) {
                    st.pop();
                }
                if (!st.isEmpty()) nums[j] = st.peek();
                else nums[j] = 0;

                st.push(num); // Push original value
            } 
            else if (st.peek() > nums[j]) {
                int num = nums[j];
                nums[j] = st.peek();
                st.push(num);
            }
        }
        return nums;
    }
}