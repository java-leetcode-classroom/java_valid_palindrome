import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void isPalindromeExample1() {
    assertTrue(sol.isPalindrome("A man, a plan, a canal: Panama"));
  }
  @Test
  void isPalindromeExample2() {
    assertFalse(sol.isPalindrome("race a car"));
  }
  @Test
  void isPalindromeExample3() {
    assertTrue(sol.isPalindrome(" "));
  }
  @Test
  void isPalindromeExample4() {
    assertFalse(sol.isPalindrome("0P"));
  }
}