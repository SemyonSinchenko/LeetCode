package AddTwoNumbers;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode((l1.val + l2.val) % 10);
        int residual = (l1.val + l2.val) / 10;
        ListNode current = head;
        l1 = getNext(l1);
        l2 = getNext(l2);
        do {
            residual = addNewNode(current, l1, l2, residual);
            l1 = getNext(l1);
            l2 = getNext(l2);
            current = current.next;
        } while (current != null);

        return head;
    }

    ListNode getNext(ListNode x) {
        if((x == null) || (x.next == null)) return null;
        else return x.next;
    }

    int addNewNode(ListNode current, ListNode first, ListNode second, int residual) {
        if(first == null) {
            if (second == null) {
                if (residual == 0) {
                    current.next = null;
                    return 0;
                } else {
                    current.next = new ListNode(residual % 10);
                    return residual / 10;
                }
            } else {
                residual += second.val;
                current.next = new ListNode(residual % 10);
                return residual / 10;
            }
        } else if(second == null) {
            residual += first.val;
            current.next = new ListNode(residual % 10);
            return residual / 10;
        } else {
            residual += first.val + second.val;
            current.next = new ListNode(residual % 10);
            return residual / 10;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public int getNumber() {
        ListNode next = this;
        int res = 0;
        int i = 0;
        while (next != null) {
            res += next.val * (int) Math.pow(10, i);
            next = next.next;
            i++;
        }

        return res;
    }
}
