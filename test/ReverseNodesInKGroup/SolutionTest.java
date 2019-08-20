package ReverseNodesInKGroup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution tstObj = new Solution();

    @Test
    void reverseKGroup_1() {
        assertEquals(
                ListNode.fromArray(new int[]{2, 1, 4, 3, 5}),
                tstObj.reverseKGroup(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 2)
        );
    }

    @Test
    void reverseKGroup_2() {
        assertEquals(
                ListNode.fromArray(new int[]{3, 2, 1, 4, 5}),
                tstObj.reverseKGroup(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 3)
        );
    }

    @Test
    void reverseKGroup_3() {
        assertEquals(
                ListNode.fromArray(new int[]{1, 2, 3, 4, 5}),
                tstObj.reverseKGroup(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 1)
        );
    }
}