package com.hokage.projectfang.recursion;

import com.hokage.projectfang.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodeInPairsTest {

    private SwapNodeInPairs swapNodeInPairs;

    @Test
    void test1() {
        swapNodeInPairs = new SwapNodeInPairs();
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
       var res =  swapNodeInPairs.swapNodeInPairs(head);
        assertTrue(res.getVal() ==2);
        assertTrue(res.getNext().getVal() ==1);
        assertTrue(res.getNext().getNext().getVal() ==4);
        assertTrue(res.getNext().getNext().getNext().getVal() ==3);

    }
}