public class Print_Linear_N_to_1 {
  static void printLinear(int i, int n) {
    // if (n < i) {
    // return;
    // }
    // System.out.println(n);
    // printLinear(i, n - 1);
    if (i < 1) {
      return;
    }
    System.out.println(i);
    printLinear(i - 1, n);
    ;
  }

  public static void main(String[] args) {
    int n = 10;
    printLinear(n, n);
  }
}
