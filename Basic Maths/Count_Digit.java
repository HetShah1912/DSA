public class Count_Digit{
  static int countDigit(int n){
    // Brute Force

    // int count = 0;
    // while (n > 0){
    //   n = n/10;
    //   count++;
    // }
    // return count;

    // Optimal
    int count = (int)(Math.log10(n) + 1);
    return count;
  }
  public static void main(String[] args) {
    int n = 12345;
    int digits = countDigit(n);
    System.out.println("The Number "+n+" has "+digits+" digits");
  }
}