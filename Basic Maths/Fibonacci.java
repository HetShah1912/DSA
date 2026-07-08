public class Fibonacci {
  static void fibo(int[] arr, int n) {
    for (int i = 2; i < n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
  }

  public static void main(String[] args) {
    int n = 10;
    int[] arr = new int[n];
    arr[0] = 0;
    arr[1] = 1;
    fibo(arr, n);
    System.out.print("Fibonacci Series : ");
    for (int i = 0; i < n; i++) {
      System.out.print(" " + arr[i]);
    }
  }
}
