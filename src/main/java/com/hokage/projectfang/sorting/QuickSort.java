package com.hokage.projectfang.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
 * <p>
 * Always pick first element as pivot.
 * Always pick last element as pivot (implemented below)
 * Pick a random element as pivot.
 * Pick median as pivot.
 */
public class QuickSort implements Sort {
    @Override
    public int[] sort(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }

    private int[] quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int n = sortElements(input, startIndex, endIndex);
            quickSort(input, startIndex, n - 1);
            quickSort(input, n + 1, endIndex);
        }

        return input;
    }

    private int sortElements(int[] input, final int startIndex, final int endIndex) {
        int pivotValue = input[endIndex];
        int i = startIndex - 1;
        for (int j = startIndex; j <= endIndex; j++) {
            if (input[j] < pivotValue) {
                swap(input, ++i, j);
            }
        }
        swap(input, ++i, endIndex);
        return i;
    }



}
