package edu.cnm.deepdive;

public class PrimitivesCharAndBoolean {

  public static void main(String[] args) {

    char ch = 'a';
//  char ch1 = 'ab'; does not compile; only one character allowed.
    char ch2 = '1'; // this represents a character, not an integer.
    char unicodeChar = '\u03A9'; // which is the unicode for upper case Greek omega.
    char romanNumber = '\u216C'; // which is the roman number 50.

    System.out.println("\nthis is the upper case Greek omega: " + unicodeChar);
    System.out.println("\nthis is the roman number 50: " + romanNumber);

    boolean myBoolean = true;
    boolean myFalseBoolean = false;
//  boolean true = false; // does not compile because 'true' is a reserved key word.
    boolean true1 = false; // not a very good variable name but it does compile.


  }

}
