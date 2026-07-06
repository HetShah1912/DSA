public class Print_1_to_N_Backtrack {
  static void printBacktrack(int i, int n) {
    if (i < 1) {
      return;
    }
    printBacktrack(i - 1, n);
    System.out.println(i);
  }

  public static void main(String[] args) {
    int n = 10;
    printBacktrack(10, n);
  }

}