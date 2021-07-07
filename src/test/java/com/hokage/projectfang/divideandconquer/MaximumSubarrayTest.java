package com.hokage.projectfang.divideandconquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @BeforeEach
    void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void test1() {
      int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
      assertEquals(6,maximumSubarray.findMaximumSubArray(input));
    }
}