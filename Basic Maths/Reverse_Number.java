public class Reverse_Number {
  static int reverse(int n){
    int rev = 0;
    while(n!=0){
      int lastDigit = n%10;
      rev = rev*10 + lastDigit;
      n = n/10;
    }
    return rev;  
  }
  public static void main(String[] args) {
    int n = 1234567;
    int ans = reverse(n);
    System.out.println("Reverse of Number "+n+" is "+ans);
  }
}