public class Sum_Of_N_Parameter {
  // static int sum = 0;
  static void sumOfN(int n, int sum) {
    // if(n < 1){
    // return;
    // }
    // sum += n;
    // sumOfN(n-1);

    if (n < 1) {
      System.out.println("Sum of N : " + sum);
      return;
    }
    sumOfN(n - 1, sum + n);
  }

  public static void main(String[] args) {
    int n = 10;
    sumOfN(n, 0);
  }
}