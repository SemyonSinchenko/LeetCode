package LongestPalindromicSubstring;

/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 */

public class Solution {
    int lo;
    int hi;

    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        lo = 0;
        hi = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            getPalindromic(s, i, i);
            getPalindromic(s, i, i + 1);
        }

        return s.substring(lo, hi + 1);
    }

    private void getPalindromic(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        if (j - i - 2 > hi - lo) {
            lo = i + 1;
            hi = j - 1;
        }
    }
}
