import java.util.Scanner;

public class Character_Count_Hash_Array {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = "abcdefgeeee";
    int[] hash = new int[26];

    // Pre Compute
    for (int i = 0; i < s.length(); i++) {
      hash[s.charAt(i) - 'a']++;
    }

    System.out.print("Enter No. of Queries : ");
    int noOfQueries = sc.nextInt();

    for (int i = 0; i < noOfQueries; i++) {
      System.out.print("Enter Query " + (i + 1) + " : ");
      char q = sc.next().charAt(0);
      // Fetch
      System.out.println("Count of " + q + " in String is : " + hash[q - 'a']);
    }
    sc.close();
  }
}
