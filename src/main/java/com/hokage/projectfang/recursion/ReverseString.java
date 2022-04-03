package com.hokage.projectfang.recursion;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 */
public class ReverseString {
    public void reverseString(char[] s) {

        reverse(s ,0 ,s.length-1);
        System.out.println(s);

    }

    private void reverse(char[] input, int start, int end) {
        if(start>= end) {
            return;
        }
        char temp = input[start];
        input[start++] = input[end];
        input[end--] = temp;
        reverse(input,start,end);
    }
}
