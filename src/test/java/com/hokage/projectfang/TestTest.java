package com.hokage.projectfang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
  @Test
  public void charCheck() {
    char char1= 'Z';
    char char2 = 'Z';
    char char3 = (char) (char1 &0x5f);
    System.out.println(char3);
    System.out.println((char1&0x5f) == char2);

    char char11= 'Z';
    char char21 = 'z';
    System.out.println((char11^0x20) == char21);


  }
}