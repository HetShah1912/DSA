public class Print_Linear_1_to_N {
  static void printLinear(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.println(i);
    printLinear(i + 1, n);
  }

  public static void main(String[] args) {
    int n = 10;
    printLinear(1, n);
  }
}
