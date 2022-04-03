package com.hokage.projectfang.recursion;

import com.hokage.projectfang.common.ListNode;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
public class ReverseLinkLIst {
    public ListNode reverseList(ListNode head) {
        var current = head;
        var res = new ListNode();
        res.setNext(head);
        ListNode prev = null;
        while (current != null ) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return res.next;
    }
}
