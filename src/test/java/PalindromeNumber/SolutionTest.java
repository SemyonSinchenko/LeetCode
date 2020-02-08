package PalindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution tstObj = new Solution();

    @Test
    void isPalindrome_1() {
        assertEquals(true, tstObj.isPalindrome(121));
    }

    @Test
    void isPalindrome_2() {
        assertEquals(false, tstObj.isPalindrome(-121));
    }

    @Test
    void isPalindrome_3() {
        assertEquals(true, tstObj.isPalindrome(0));
    }

    @Test
    void isPalindrome_4() {
        assertEquals(false, tstObj.isPalindrome(441));
    }
}