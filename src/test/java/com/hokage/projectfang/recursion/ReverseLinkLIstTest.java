package com.hokage.projectfang.recursion;

import com.hokage.projectfang.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkLIstTest {
    @Test
    public void  testReverseLinkedList() {
        ReverseLinkLIst reverseLinkLIst = new ReverseLinkLIst();
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
        head.getNext().getNext().getNext().setNext(new ListNode(5));

       var node= reverseLinkLIst.reverseList(head);
       assertTrue( 5 == node.val);
       assertTrue( 4 == node.next.val);
       assertTrue( 3 == node.next.next.val);
       assertTrue( 2 == node.next.next.next.val);
       assertTrue( 1 == node.next.next.next.next.val);
    }

}