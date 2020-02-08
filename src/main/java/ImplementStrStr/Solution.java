package ImplementStrStr;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class Solution {
    public int strStr(String haystack, String needle) {

        if (needle == null || needle.equals("")) {
            return 0;
        } else {
            for (int i=0; i<haystack.length(); i++) {
                outer:
                if (haystack.charAt(i) == needle.charAt(0)) {
                    for (int j=1; j<needle.length(); j++) {
                        if (i + j >= haystack.length() || needle.charAt(j) != haystack.charAt(i + j)) {
                            break outer;
                        }
                    }

                    return i;
                }
            }
        }

        return -1;
    }
}
