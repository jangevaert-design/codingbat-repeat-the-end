package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatRepeatTheEndTest {

  private String[] stringParams = {
      "Hello",
      "Hello",
      "Hello"
  };

  private int[] intParams = {3, 2, 1};

  private String[] stringExpected = {"llollollo", "lolo", "o"};


  @Test
  void repeatTheEnd() {
    for (int i = 0; i < stringParams.length; i++) {
      String actual = CodingBatRepeatTheEnd.repeatEnd(stringParams[i], intParams[i]);
      Assertions.assertEquals(actual, stringExpected[i]);

    }
  }

}