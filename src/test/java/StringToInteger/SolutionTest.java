package StringToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution testObj = new Solution();

    @Test
    void myAtoi_1() {
        assertEquals(42, testObj.myAtoi("42"));
    }

    @Test
    void myAtoi_2() {
        assertEquals(42, testObj.myAtoi("    42"));
    }

    @Test
    void myAtoi_3() {
        assertEquals(0, testObj.myAtoi("words and 987"));
    }

    @Test
    void muAtoi_4() {
        assertEquals(-42, testObj.myAtoi("   -42"));
    }

    @Test
    void muAtoi_5() {
        assertEquals(987, testObj.myAtoi("   987 word"));
    }

    @Test
    void muAtoi_6() {
        assertEquals(2147483647, testObj.myAtoi("2147483648"));
    }

    @Test
    void muAtoi_7() {
        assertEquals(-2147483648, testObj.myAtoi("-91283472332"));
    }

    @Test
    void muAtoi_8() {
        assertEquals(1, testObj.myAtoi("+1"));
    }

    @Test
    void muAtoi_9() {
        assertEquals(12345678, testObj.myAtoi("  0000000000012345678"));
    }

    @Test
    void muAtoi_10() {
        assertEquals(-1, testObj.myAtoi("-000000000000001"));
    }

    @Test
    void muAtoi_11() {
        assertEquals(-12, testObj.myAtoi("  -0012a42"));
    }

    @Test
    void muAtoi_12() {
        assertEquals(0, testObj.myAtoi("   +0 123"));
    }

    @Test
    void muAtoi_13() {
        assertEquals(2147483646, testObj.myAtoi("2147483646"));
    }

    @Test
    void muAtoi_14() {
        assertEquals(0, testObj.myAtoi("0-1"));
    }

    @Test
    void muAtoi_15() {
        assertEquals(Integer.MAX_VALUE, testObj.myAtoi("20000000000000000000"));
    }

    @Test
    void muAtoi_16() {
        assertEquals(-1010023630, testObj.myAtoi(" -1010023630o4"));
    }
}