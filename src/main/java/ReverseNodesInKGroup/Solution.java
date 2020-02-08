package ReverseNodesInKGroup;

/*
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list.
If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
*/


/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static ListNode fromArray(int[] in) {
        ListNode head = new ListNode(in[0]);
        ListNode current = head;
        for(int i=1; i<in.length; i++) {
            current.next = new ListNode(in[i]);
            current = current.next;
        }

        return head;
    }

    @Override
    public boolean equals(Object obj) {
        ListNode currentThis;
        ListNode currentOther;
        if(obj instanceof ListNode) {
            currentThis = this;
            currentOther = (ListNode) obj;

            while(currentThis != null) {
                if(currentOther == null) return false;
                else if(currentThis.val != currentOther.val) return false;
                else {
                    currentThis = currentThis.next;
                    currentOther = currentOther.next;
                }
            }

            return true;
        } else return false;
    }

    @Override
    public String toString() {
        StringBuilder acc = new StringBuilder();
        ListNode current = this;

        while(current != null) {
            acc.append(current.val);
            acc.append(" -> ");
            current = current.next;
        }

        return acc.toString();
    }
}

public class Solution {
    class ListResult {
        public ListNode head;
        public ListNode tail;
        public ListNode next;

        public ListResult(ListNode head, ListNode tail, ListNode next) {
            this.head = head;
            this.tail = tail;
            this.next = next;
        }
    }

    public ListResult reverseKList(ListNode head, int k) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        int j = 0;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

            j++;

            if(j == k) break;
        }

        if(j < k) return reverseKList(prev, j);
        else {
            return new ListResult(prev, head, current);
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;

        ListNode newHead;
        ListResult current;
        ListResult temp = reverseKList(head, k);

        if(temp.head == head) return head;
        else {
            newHead = temp.head;
            current = temp;
        }

        while (current.next != null) {
            temp = reverseKList(current.next, k);
            current.tail.next = temp.head;
            current = temp;
        }

        return newHead;
    }
}
