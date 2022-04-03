package com.hokage.projectfang.recursion;

public class PrintReverse {
    public void reverse(String input) {
         helper(input, 0);
    }

    private void helper(String input, int index) {
        if (input == null || index>=input.length()) {
            return ;
        }
        helper(input, index+1);
        System.out.print(input.toCharArray()[index]);
    }
}
