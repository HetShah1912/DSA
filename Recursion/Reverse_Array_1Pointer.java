public class Reverse_Array_1Pointer {
  static void reverseArray(int[] arr, int i) {
    if (i >= (arr.length / 2)) {
      return;
    }
    int temp = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = temp;
    reverseArray(arr, i + 1);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    reverseArray(arr, 0);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }
  }
}
