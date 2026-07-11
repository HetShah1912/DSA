public class Character_Count_For_Loop {
  static void Count_Character(String str, char n) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == n) {
        count++;
      }
    }
    System.out.println("Frequency of " + n + " is : " + count);
  }

  public static void main(String[] args) {
    String s = "abcdabefc";
    Count_Character(s, 'a');
  }
}
