public class Fibonacci_Multiple_Recursion {
  static int fibo(int n) {
    if (n <= 1) {
      return n;
    }
    int last = fibo(n - 1);
    int slast = fibo(n - 2);
    return last + slast;
  }

  public static void main(String[] args) {
    int n = 8;
    int ans = fibo(n);
    System.out.println("The " + n + "th number of Fibonacci is : " + ans);
  }
}
