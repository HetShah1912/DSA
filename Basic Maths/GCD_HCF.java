public class GCD_HCF {
  static int gcd(int n1, int n2) {
    // Brute Force (For Value like 11,13)

    // int ans = 0;
    // for (int i = 1; i <= Math.min(n1, n2); i++) {
    // if (n1 % i == 0 && n2 % i == 0) {
    // ans = i;
    // }
    // }
    // return ans;

    // For Value like 20,40
    // int ans = 0;
    // for (int i = Math.min(n1, n2); i >=1 ; i--) {
    //   if (n1 % i == 0 && n2 % i == 0) {
    //     ans = i;
    //     return ans;
    //   }
    // }
    // return ans;
    
    // Optimal
    while(n1>0 && n2>0){
      if(n1>n2){
        n1 = n1%n2;
      }
      else{
        n2 = n2%n1;
      }
    }
    if(n1==0){
      return n2;
    }
    return n1;
  }

  public static void main(String[] args) {
    int n1 = 52;
    int n2 = 10;
    int res = gcd(n1, n2);
    System.out.println("GCD of " + n1 + " and " + n2 + " is : " + res);
  }
}