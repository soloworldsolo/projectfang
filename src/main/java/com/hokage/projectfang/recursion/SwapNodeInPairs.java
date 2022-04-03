package com.hokage.projectfang.recursion;

import com.hokage.projectfang.common.ListNode;

/**
 * iven a linked list, swap every two adjacent nodes and return its head. Y
 * ou must solve the problem without modifying the values in the
 * list's nodes (i.e., only nodes themselves may be changed.)
 *
 * Example 1:
 */
public class SwapNodeInPairs {

    public ListNode swapNodeInPairs(ListNode head) {
        var current = head;
        var res = head;
        if(head.getNext() !=null) {
            res = res.getNext();
        }
        ListNode prev = null;
        while (current !=null && current.getNext() !=null) {
         var next = current.getNext();
           if(prev !=null) {
               prev.setNext(next);
           }
           var temp = next.getNext();
           next.setNext(current);
           current.setNext(temp);
           prev = current;
           current = current.getNext();
        }
        return res;
    }
}
