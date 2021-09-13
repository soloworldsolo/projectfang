package com.hokage.projectfang.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void test1() {
        int[] input = {5,1,4,2,8};
        assertArrayEquals(new int[]{1,2,4,5,8}, bubbleSort.sort(input));
    }
}