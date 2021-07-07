package com.hokage.projectfang.divideandconquer;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has
 * the largest sum and return its sum.
 * {-2,1,-3,4,-1,2,1,-5,4} =6
 */
public class MaximumSubarray {

    /**
     * @param input input
     * @return int maximum value
     */
    public int findMaximumSubArray(int[] input) {
        if (input.length == 1) {
            return input[0];
        }
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] + input[i - 1] >input[i]) {
                input[i] = input[i] + input[i - 1];

            }
            if (input[i] > max) {
                max = input[i];
            }
        }

        return max;
    }
}
