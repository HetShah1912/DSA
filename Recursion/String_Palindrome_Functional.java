public class String_Palindrome_Functional {
  static boolean isPalindrome(String s, int i, int n) {
    if (i >= n / 2) {
      return true;
    }
    if (s.charAt(i) != s.charAt(n - i - 1)) {
      return false;
    }
    return isPalindrome(s, i + 1, n);
  }

  public static void main(String[] args) {
    String str = "MADAM";
    String lower = str.toLowerCase();
    System.out.println(lower);
    boolean palindrome = isPalindrome(lower, 0, lower.length());
    System.out.println(str + " is Palindrome : " + palindrome);
  }
}
