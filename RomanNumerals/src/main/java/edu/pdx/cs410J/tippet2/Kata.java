package edu.pdx.cs410J.tippet2;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static String numberToRomanNumeral(int num)
  {
    StringBuilder romanNumeral = new StringBuilder();
    if(num < 5){
      for(int i = 0; i < num; ++i){
        romanNumeral.append("I");
      }
      return romanNumeral.toString();
    }
    else if(num == 5)
      return "V";
    else
      return "X";
  }
}