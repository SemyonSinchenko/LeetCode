package MedianOfTwoSortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution tstObj = new Solution();

    @Test
    void findMedianSortedArrays_1() {
        int[] a = {1, 3};
        int[] b = {2};
        assertEquals(2, tstObj.findMedianSortedArrays(a, b));
    }

    @Test
    void findMedianSortedArrays_2() {
        int[] a = {1};
        int[] b = {2, 3, 4};
        assertEquals(2.5, tstObj.findMedianSortedArrays(a, b));
    }

    @Test
    void findMedianSortedArrays_3() {
        int[] a = {1};
        int[] b = {2, 3, 4, 5};
        assertEquals(3, tstObj.findMedianSortedArrays(a, b));
    }
}