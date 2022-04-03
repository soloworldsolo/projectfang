package com.hokage.projectfang.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintReverseTest {

    PrintReverse printReverse;
    @Test
    void test1() {
        printReverse = new PrintReverse();
        printReverse.reverse("solomon");
    }
    @Test
    void test2() {
        printReverse = new PrintReverse();
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("hello".toCharArray());
        printReverse.reverse("malayalam");
    }
}