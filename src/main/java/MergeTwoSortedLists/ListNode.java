package MergeTwoSortedLists;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode fromArray(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode pointer = head;

        for (int i=1; i<arr.length; i++) {
            pointer.next = new ListNode(arr[i]);
            pointer = pointer.next;
        }

        return head;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListNode) {
            ListNode other = new ListNode(((ListNode) obj).val);
            ListNode pointer = new ListNode(val);
            while (pointer != null) {
                if (other == null || other.val != val) {
                    return false;
                } else {
                    pointer = pointer.next;
                    other = other.next;
                }
            }
        } else {
            return false;
        }

        return true;
    }
}
