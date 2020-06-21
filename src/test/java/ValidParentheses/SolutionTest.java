package ValidParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  void isValid_test() {
    assertTrue(solution.isValid("()"));
    assertTrue(solution.isValid("[](){}"));
    assertFalse(solution.isValid("(]"));
    assertFalse(solution.isValid("([)]"));
  } 
}
