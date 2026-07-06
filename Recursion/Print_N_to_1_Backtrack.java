public class Print_N_to_1_Backtrack {
  static void printBacktrack(int i, int n) {
    if (i > n) {
      return;
    }
    printBacktrack(i + 1, n);
    System.out.println(i);
  }

  public static void main(String[] args) {
    int n = 10;
    printBacktrack(1, n);
  }
  
}