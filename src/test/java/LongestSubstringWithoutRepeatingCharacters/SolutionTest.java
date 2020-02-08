package LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution tstObj = new Solution();

    @Test
    void lengthOfLongestSubstring_1() {
        assertEquals(3, tstObj.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void lengthOfLongestSubstring_2() {
        assertEquals(1, tstObj.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void lengthOfLongestSubstring_3() {
        assertEquals(3, tstObj.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void lengthOfLongestSubstring_4() {
        assertEquals(2, tstObj.lengthOfLongestSubstring("au"));
    }

    @Test
    void lengthOfLongestSubstring_5() {
        assertEquals(3, tstObj.lengthOfLongestSubstring("dvdf"));
    }
}