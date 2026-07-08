public class Sum_Of_N_Functional {
  static int sumOfN(int n) {
    if (n < 1) {
      return 0;
    }
    return n + sumOfN(n - 1);
  }

  public static void main(String[] args) {
    int n = 10;
    System.out.println("Sum of N : " + sumOfN(n));
  }
}
