package ZigZagConversion;

/**
 * Solution
 * 
 * The goal is to correct input String to Zig-Zag form.
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (s == null) {
            return null;
        }

        if (s.length() <= 1) {
            return s;
        }

        if ((numRows == 1) || (numRows >= s.length())) {
            return s;
        }

        int rowLength = s.length();
        char[][] wordMatrix = new char[numRows][rowLength];
        int i = -1;
        int j = 0;

        for (char c: s.toCharArray()) {
            if (j % (numRows - 1) == 0) {
                if (i < (numRows - 1)) {
                    wordMatrix[++i][j] = c;
                } else {
                    wordMatrix[--i][++j] = c;
                }
            } else {
                wordMatrix[--i][++j] = c;
            } 
        }

        char[] resultStr = new char[s.length()];
        int k = 0;
        for (int l=0; l<numRows; l++) {
            for (int m=0; m<rowLength; m++) {
                if (wordMatrix[l][m] != Character.MIN_VALUE) {
                    resultStr[k++] = wordMatrix[l][m];
                }
            }
        }

        return new String(resultStr);
    }
}