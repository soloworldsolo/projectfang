package com.hokage.projectfang.sorting;

public interface Sort {

    public int[] sort(int[] input);

    default void swap(int[] input , int firstIndex ,int secondIndex) {
        int temp = input[firstIndex];
        input[firstIndex] = input[secondIndex];
        input[secondIndex] = temp;
    }
}
