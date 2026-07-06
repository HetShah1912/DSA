public class Print_Name_N_Times {

  static void printName(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.println("Het Shah");
    printName(i + 1, n);
  }

  public static void main(String[] args) {
    int n = 5;
    printName(1, n);
  }
}
