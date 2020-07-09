package edu.pdx.cs410J.tippet2;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void RomanNumeral1IsI(){
    assertThat(Kata.numberToRomanNumeral(1), equalTo("I"));
  }

  @Test
  public void RomanNumeral5iIsV(){
    assertThat(Kata.numberToRomanNumeral(5),equalTo("V"));
  }

  @Test
  public void RomanNumeral10IsX(){
    assertThat(Kata.numberToRomanNumeral(10),equalTo("X"));
  }

  @Test
  public void RomanNumeralLessThan4HasIConcatenated(){
    assertThat(Kata.numberToRomanNumeral(3),equalTo("III"));
  }
}
