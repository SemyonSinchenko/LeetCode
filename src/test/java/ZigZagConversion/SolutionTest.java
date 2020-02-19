package ZigZagConversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * SolutionTest
 */
public class SolutionTest {
    Solution solution = new Solution();
    
    @Test
    void convert_test_1() {
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
    }

    @Test
    void convert_test_2() {
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
    }

    @Test
    void convert_test_3() {
        assertEquals("AB", solution.convert("AB", 1));
    }

    @Test
    void convert_test_4() {
        assertEquals("PHASIYIRPLIGAN", solution.convert("PAYPALISHIRING", 5));
    }
}