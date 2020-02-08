package ImplementStrStr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void strStr() {
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(-1, solution.strStr("aaaaa", "bba"));
        assertEquals(0, solution.strStr("shfjghf", ""));
    }
}