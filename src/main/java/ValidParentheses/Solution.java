package ValidParentheses;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *    - Open brackets must be closed by the same type of brackets.
 *    - Open brackets must be closed in the correct order.
 *
 * Note that an empty string is also considered valid.
**/

class Solution {
  public boolean isValid(String s) {
    Deque<Character> stack = new LinkedList<>();
    Map<Character, Character> brackets = Map.of('(', ')', '[', ']', '{', '}');

    for (char c : s.toCharArray()) {
      if (brackets.containsKey(c)) {
        stack.push(c);
      } else {
        if (stack.size() == 0) {
          return false;
        }

        if (c != brackets.get(stack.pop())) {
          return false;
        }
      }
    }

    return stack.size() == 0;
  }
}
