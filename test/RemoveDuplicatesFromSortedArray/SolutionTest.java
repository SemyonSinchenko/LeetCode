package RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution tstObj = new Solution();

    @Test
    void removeDuplicates_1() {
        assertEquals(2, tstObj.removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    void removeDuplicates_2() {
        assertEquals(5, tstObj.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}