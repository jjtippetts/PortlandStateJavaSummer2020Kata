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
  public void RomanNumeralfor1isI(){
    assertThat(Kata.numberToRomanNumeral(1), equalTo("I"));
  }

}
