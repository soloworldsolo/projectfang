package com.hokage.projectfang.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private MergeSort mergeSort;

    @BeforeEach
    void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    public  void test1() {
        int[] input = {14,7,3,12,9,11,6,2};
        int[] output = {2,3,6,7,9,11,12,14};
        Assertions.assertArrayEquals(output, mergeSort.sort(input));
    }

    @Test
    void failedTestWithNegativeNumbers() {
        int[] input = {-4,0,7,4,9,-5,-1,0,-7,-1};
        int[] output = {-7,-5,-4,-1,-1,0,0,4,7,9};
        Assertions.assertArrayEquals(output, mergeSort.sort(input));
    }
}