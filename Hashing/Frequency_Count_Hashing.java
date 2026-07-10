import java.util.Scanner;

public class Frequency_Count_Hashing {
  public static void main(String[] args) {

    int n = 5;
    int[] arr = {1, 2, 1, 3, 2};

    // Precompute
    int[] hash = new int[11];
    for(int i =0; i<arr.length; i++){
      hash[arr[i]]++;
    }


    System.out.print("Enter No. of Queries : ");
    Scanner sc = new Scanner(System.in);
    int noOfQueries = sc.nextInt();

    for(int i = 0; i < noOfQueries; i++){
      System.out.print("Enter Query "+(i+1)+ " : ");
      int q = sc.nextInt();
      // Fetch
      System.out.println("Count of "+q+" in Array is : "+hash[q]); 
    }
  }
}
