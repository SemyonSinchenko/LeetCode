package AddTwoNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    ListNode fromArray(int[] in) {
        ListNode a = new ListNode(in[0]);
        ListNode b = a;
        for(int i=1; i<in.length; i++) {
            b.next = new ListNode(in[i]);
            b = b.next;
        }

        return a;
    }

    ListNode t1 = fromArray(new int[]{4, 5, 6});
    ListNode t2 = fromArray(new int[]{1});

    @Test
    void getNumber_1() {
        assertEquals(654, t1.getNumber());
    }

    @Test
    void getNumber_2() {
        assertEquals(1, t2.getNumber());
    }
}