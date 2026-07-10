public class Frequency_Count_For_Loop {
  static void Count_Frequency(int[] arr, int n) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == n) {
        count++;
      }
    }
    System.out.println("Frequency of " + n + " is : " + count);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 1, 2 };
    Count_Frequency(arr, 1);
  }
}