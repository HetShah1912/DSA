import java.util.Scanner;
import java.util.TreeMap;

public class Character_Count_Treemap {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    TreeMap<Character, Integer> map = new TreeMap<>();

    // User Input + Pre Compute

    System.out.print("Enter String : ");
    String str = sc.nextLine();

    for (int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    }

    System.out.print("Enter No. of Queries : ");
    int noOfQueries = sc.nextInt();

    for (int i = 0; i < noOfQueries; i++) {
      System.out.print("Enter Query " + (i + 1) + " : ");
      char q = sc.next().charAt(0);
      // Fetch
      System.out.println("Count of " + q + " in String is : " + map.getOrDefault(q, 0));
    }

    sc.close();

  }
}
