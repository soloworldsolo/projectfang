package com.hokage.projectfang.recursion;

import com.hokage.projectfang.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {

    private MaxDepth maxDepth;

    @BeforeEach
    void setUp() {
        maxDepth = new MaxDepth();
    }

    @Test
    void test() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(0);
        int res = maxDepth.maxDepth(root);
        assertEquals(res ,3);

    }
}