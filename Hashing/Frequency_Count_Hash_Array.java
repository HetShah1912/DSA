import java.util.Scanner;

public class Frequency_Count_Hash_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter No. of Elements in Array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      System.out.print("Enter Element : ");
      arr[i] = sc.nextInt();
    }

    // Precompute
    int[] hash = new int[11];
    for(int i =0; i<arr.length; i++){
      hash[arr[i]]++;
    }


    System.out.print("Enter No. of Queries : ");
    int noOfQueries = sc.nextInt();

    for(int i = 0; i < noOfQueries; i++){
      System.out.print("Enter Query "+(i+1)+ " : ");
      int q = sc.nextInt();
      // Fetch
      System.out.println("Count of "+q+" in Array is : "+hash[q]); 
    }
    sc.close();
  }
}
