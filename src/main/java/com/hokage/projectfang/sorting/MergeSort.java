package com.hokage.projectfang.sorting;

public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] nums) {

        return mergeSort(nums, 0, nums.length - 1);
    }

    private int[] mergeSort(int[] input, int startIndex, int endIndex) {
       if(startIndex >=endIndex) {
           return input;
       }

        int start = startIndex;
        int end = endIndex;


            int middle = start + (end - start) / 2;
            mergeSort(input, start, middle);
            mergeSort(input, middle + 1, end);
            merge(input, start, end);


        return input;
    }

    private void merge(int[] input, int startIndex, int endIndex) {
        int[] auxillary = new int[(endIndex - startIndex) + 1];
        int i = 0;
        int start = startIndex;
        int middle = (start + (endIndex - startIndex) / 2) + 1;
        int end = middle;
        while (i < auxillary.length) {
            if (start < middle &&  end <= endIndex) {
                if (input[start] < input[end]) {
                    auxillary[i++] = input[start++];

                } else {
                    auxillary[i++] = input[end++];
                }
            } else if (start >= middle && end <= endIndex && i < auxillary.length) {
                auxillary[i++] = input[end++];
            } else if (end >= endIndex && start < middle && i < auxillary.length) {
                auxillary[i++] = input[start++];
            }
        }

        int j = 0;
        int startPosition = startIndex;
        while (j < auxillary.length) {
            input[startPosition++] = auxillary[j++];
        }

    }
}
