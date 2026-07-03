public class Palindrome {
  static boolean isPalindrome(int n){
    int actual = n;
    int rev = 0;
    while(n!=0){
      int lastDigit = n%10;
      rev = rev*10 + lastDigit;
      n = n/10;
    }
    if(actual == rev){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    int n = 1331;
    boolean res = isPalindrome(n);
    System.out.println(n+ " is Palindrome ? : "+res);
  }
}
