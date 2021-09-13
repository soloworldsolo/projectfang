package com.hokage.projectfang.sorting;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements if they are in wrong order.
 */
public class BubbleSort implements Sort {

    public int[] sort(int[] input) {
        int i = 0;
        boolean isSwapped;
        while (i < input.length) {
            isSwapped = false;
            for (int j = 1; j < input.length; j++) {
                if (input[j] < input[j - 1]) {
                    isSwapped = true;
                    swap(input, j, j - 1);
                }
            }
            if (!isSwapped) {
                return input;
            }
            i++;
        }
        return input;
    }


}
