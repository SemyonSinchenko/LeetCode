package MergeTwoSortedLists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode resultHead;
        ListNode resultPointer;
        ListNode l1Pointer = l1;
        ListNode l2Pointer = l2;

        if (l1Pointer.val > l2Pointer.val) {
            resultHead = new ListNode(l2Pointer.val);
            l2Pointer = l2Pointer.next;
            resultPointer = resultHead;
        } else {
            resultHead = new ListNode(l1Pointer.val);
            l1Pointer = l1Pointer.next;
            resultPointer = resultHead;
        }

        while (l1Pointer != null && l2Pointer != null) {
            if (l1Pointer.val > l2Pointer.val) {
                resultPointer.next = new ListNode(l2Pointer.val);
                resultPointer = resultPointer.next;
                l2Pointer = l2Pointer.next;
            } else {
                resultPointer.next = new ListNode(l1Pointer.val);
                resultPointer = resultPointer.next;
                l1Pointer = l1Pointer.next;
            }
        }

        while (l1Pointer != null) {
            resultPointer.next = new ListNode(l1Pointer.val);
            resultPointer = resultPointer.next;
            l1Pointer = l1Pointer.next;
        }

        while (l2Pointer != null) {
            resultPointer.next = new ListNode(l2Pointer.val);
            resultPointer = resultPointer.next;
            l2Pointer = l2Pointer.next;
        }

        return resultHead;
    }
}
