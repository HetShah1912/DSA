import java.util.Scanner;
import java.util.TreeMap;

public class Frquency_Count_Treemap {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter No. of Elements in Array : ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    TreeMap<Integer, Integer> map = new TreeMap<>();

    // User Input + Pre Compute

    for (int i = 0; i < n; i++) {
      System.out.print("Enter Element : ");
      arr[i] = sc.nextInt();
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    System.out.print("Enter No. of Queries : ");
    int noOfQueries = sc.nextInt();

    for (int i = 0; i < noOfQueries; i++) {
      System.out.print("Enter Query " + (i + 1) + " : ");
      int q = sc.nextInt();
      // Fetch
      System.out.println("Count of " + q + " in Array is : " + map.getOrDefault(q, 0));
    }

    sc.close();

  }

}
