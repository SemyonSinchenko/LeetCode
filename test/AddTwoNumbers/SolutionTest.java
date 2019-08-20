package AddTwoNumbers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution tstObj = new Solution();

    ListNode fromArray(int[] in) {
        ListNode a = new ListNode(in[0]);
        ListNode b = a;
        for(int i=1; i<in.length; i++) {
            b.next = new ListNode(in[i]);
            b = b.next;
        }

        return a;
    }

    @Test
    void addTwoNumbers_1() {
        ListNode a = fromArray(new int[]{1, 1, 1});
        ListNode b = fromArray(new int[]{1, 1, 1});

        assertEquals(222, tstObj.addTwoNumbers(a, b).getNumber());
    }

    @Test
    void addTwoNumbers_2()  {
        ListNode a = fromArray(new int[]{2, 4, 3});
        ListNode b = fromArray(new int[]{5, 6, 4});

        assertEquals(807, tstObj.addTwoNumbers(a, b).getNumber());
    }

    @Test
    void addTwoNumbers_3()  {
        ListNode a = fromArray(new int[]{2});
        ListNode b = fromArray(new int[]{5, 6, 4});

        assertEquals(467, tstObj.addTwoNumbers(a, b).getNumber());
    }

    @Test
    void addTwoNumbers_4()  {
        ListNode a = fromArray(new int[]{6});
        ListNode b = fromArray(new int[]{7});

        assertEquals(13, tstObj.addTwoNumbers(a, b).getNumber());
    }
}