package com.hokage.projectfang.common;

import lombok.Data;

@Data
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }
}
