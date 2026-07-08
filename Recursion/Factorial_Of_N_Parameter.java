public class Factorial_Of_N_Parameter {
  static void fact(int n, int mul) {
    if (n == 1) {
      System.out.println("Factorial is : " + mul);
      return;
    }
    fact(n - 1, mul * n);
  }

  public static void main(String[] args) {
    int n = 5;
    fact(n, 1);
  }
}
