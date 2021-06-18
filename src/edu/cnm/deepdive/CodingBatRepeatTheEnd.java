package edu.cnm.deepdive;

/*

Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
 */

public class CodingBatRepeatTheEnd {

  public static void main(String[] args) {
    System.out.printf("for the String %s with the int %d, the result will be "
        + repeatEnd("Hello", 3) + ".\n", "Hello", 3);
    System.out.printf("for the String %s with the int %d, the result will be "
        + repeatEnd("Hello", 2) + ".\n", "Hello", 2);
    System.out.printf("for the String %s with the int %d, the result will be "
        + repeatEnd("Hello", 1) + ".\n", "Hello", 1);
  }

  public static String repeatEnd(String str, int n) {
    String result = "";

    for (int i = 0; i < n; i++) {
      result += str.substring(str.length() - n, str.length());
    }
    return result;
  }

}
