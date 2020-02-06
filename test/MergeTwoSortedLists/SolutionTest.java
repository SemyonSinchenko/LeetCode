package MergeTwoSortedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void mergeTwoLists_1() {
        assertEquals(ListNode.fromArray(new int[]{1, 1, 2, 3, 4, 4}), solution.mergeTwoLists(
                ListNode.fromArray(new int[]{1, 2, 4}),
                ListNode.fromArray(new int[]{1, 3, 4})
        ));
    }

    @Test
    void mergeTowLists_2() {
        assertNull(solution.mergeTwoLists(null, null));
    }

    @Test
    void mergeTwoLists_3() {
        assertEquals(ListNode.fromArray(new int[]{1, 3, 5}), solution.mergeTwoLists(null, ListNode.fromArray(new int[]{1, 3, 5})));
    }
}