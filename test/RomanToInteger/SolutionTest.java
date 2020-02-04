package RomanToInteger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void before() {
        solution = new Solution();
    }

    @Test
    void romanToInt_1() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void romanToInt_2() {
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    void romanToInt_3() {
        assertEquals(9, solution.romanToInt("IX"));
    }

    @Test
    void romanToInt_4() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void romanToInt_5() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}