package com.hokage.projectfang;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        System.out.println(solveFunction("peEeemsmoke"));

    }

    public static String solveFunction(String input) {
        String result = "";
        if (result == null || input.length() < 2) {
            if(result!=null) {
                result = input;
            }
            return result;
        }
        Deque<Character> charcterQueue = new ArrayDeque<>();
        charcterQueue.push(input.charAt(0));
        int i = 1;
        while (!charcterQueue.isEmpty() && i < input.length()) {
            if (oppositeCase(charcterQueue.peek(), input.charAt(i))) {
                charcterQueue.pop();
                i++;
                if (charcterQueue.isEmpty() && i<input.length()) {
                    charcterQueue.push(input.charAt(i++));
                }
            } else {
                charcterQueue.push(input.charAt(i++));
            }
        }
        return buildString(charcterQueue);
    }

    private static String buildString(Deque<Character> charcterQUeue) {
        if (charcterQUeue.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        while (!charcterQUeue.isEmpty()) {
            builder.append(charcterQUeue.pop());
        }
       return builder.reverse().toString();
    }

    private static boolean oppositeCase(char pointer1, char pointer2) {
        String case1 = (pointer1 >= 'a' && pointer1 <= 'z') ? "L" : "U";
        String case2 = (pointer2 >= 'a' && pointer2 <= 'z') ? "L" : "U";
        if (case1.equals(case2)) {
            return false;
        }
        return ((pointer1 & 0x5f) == pointer2 || ((pointer1 ^ 0x20) == pointer2));
    }
}
