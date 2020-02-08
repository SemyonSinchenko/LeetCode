package RomanToInteger;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * For example, two is written as II in Roman numeral, just two one's added together.
 * Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 *
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {
    private final static Map<Character, Integer> BASE = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        if (s.length() == 1) {
            return BASE.get(s.charAt(0));
        }

        int result = 0;
        Deque<Character> queue = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            if (queue.isEmpty()) {
                queue.addLast(c);
            } else {
                Character prev = queue.pollFirst();
                if (
                        (prev.equals('I') && (c.equals('V') || c.equals('X')))
                        || (prev.equals('X') && (c.equals('L') || c.equals('C')))
                        || (prev.equals('C') && (c.equals('D') || c.equals('M')))
                ) {
                    result += BASE.get(c) - BASE.get(prev);
                } else {
                    result += BASE.get(prev);
                    queue.addLast(c);
                }
            }
        }

        if (queue.isEmpty()) {
            return result;
        } else {
            return result + BASE.get(queue.getFirst());
        }
    }
}
