public class Prime_Number {
  static boolean isPrime(int n){
    // Brute Force

    // for(int i = 2; i<n; i++){
    //   if(n%i==0){
    //     return false;
    //   }
    // }
    // return true;

    // Optimal
    for(int i = 2; i*i<=n; i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int n = 5;
    boolean ans = isPrime(n);
    System.out.println(n+" is Prime : "+ans);
  }
}
