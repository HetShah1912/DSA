import java.util.ArrayList;
import java.util.List;

public class Print_Divisors {
  static void printDivisor(int n) {
    // Brute Force

    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // System.out.print(" " + i);
    // }
    // }

    // Optimal
    List<Integer> li = new ArrayList<>();
    for (int i = 1; i*i<=n; i++) {
      if (n % i == 0) {
        li.add(i);
        if ((n / i) != i) {
          li.add((n / i));
        }
      }
    }
    li.sort(null);
    for(Integer i:li){
      System.out.print(" "+i);
    }
  }

  public static void main(String[] args) {
    int n = 36;
    System.out.print("Divisors of " + n + " is : ");
    printDivisor(n);
  }
}