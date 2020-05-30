package LongestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void longestCommonPrefix() {
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("ab", solution.longestCommonPrefix(new String[]{"abab", "aba", "abc"}));
        assertEquals("a", solution.longestCommonPrefix(new String[]{"aa", "ab"}));
        assertEquals("c", solution.longestCommonPrefix(new String[]{"c", "c"}));
        assertEquals("aa", solution.longestCommonPrefix(new String[]{"aa", "aa"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"ca", "a"}));
    }
}