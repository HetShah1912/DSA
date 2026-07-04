public class Armstrong_Number {
  static boolean isArmstrong(int n) {
    int actual = n;
    int temp = n;
    int digits = 0;

    while(temp>0){
      digits++;
      temp = temp/10;
    }

    double sum = 0;
    while(n>0){
      int lastDigit = n%10;
      sum = sum + Math.pow(lastDigit, digits);
      n = n/10;
    }
    return (actual==sum);
  }

  public static void main(String[] args) {
    int n = 9474;
    boolean res = isArmstrong(n);
    if(res){
      System.out.println(n+ " is an Armstrong Number");
    }
    else{
      System.out.println(n+ " is not an Armstrong Number");
    }
  }
}
