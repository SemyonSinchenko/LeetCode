package LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {return "";}
        if (strs.length == 1) {return strs[0];}

        String shortest = "";
        int minLength = Integer.MAX_VALUE;
        for (String el : strs) {
            if (el.length() < minLength) {
                minLength = el.length();
                shortest = el;
            }
        }

        boolean res = true;
        String prefix;

        for (int i = shortest.length(); i > 0; i--) {
            prefix = shortest.substring(0, i);
            for (String el : strs) {
                res = el.startsWith(prefix);
                if (!res) {break;}
            }

            if (res) {return prefix;}
        }

        return "";
    }
}
