public class Solution {
  public boolean isPalindrome(String s) {
    int lp = 0, rp = s.length() - 1;
    while(lp <= rp) {
      if (!isAlphabet(s.charAt(lp))) {
        lp++;
        continue;
      }
      if (!isAlphabet(s.charAt(rp))) {
        rp--;
        continue;
      }
      if (toLower(s.charAt(rp)) != toLower(s.charAt(lp)) ) {
        return false;
      }
      lp++;
      rp--;
    }
    return true;
  }
  private boolean isAlphabet(char c) {
    if (('a' <= c && c < 'z') || ('A' <= c && c < 'Z') || ('0' <= c && c <= '9')) {
      return true;
    }
    return false;
  }
  private char toLower(char c) {
    if ('A' <= c && c < 'Z') {
      return (char)(c - 'A' + 'a');
    }
    return c;
  }
}
