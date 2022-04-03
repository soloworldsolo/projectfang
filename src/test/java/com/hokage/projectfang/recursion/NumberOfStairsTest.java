package com.hokage.projectfang.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStairsTest {

    private NumberOfStairs numberOfStairs;

    @BeforeEach
    void setUp() {
        numberOfStairs = new NumberOfStairs();
    }


    @Test
    void test1() {
        int res = numberOfStairs.climbStairs(5);
        assertEquals(8,res);
    }
}