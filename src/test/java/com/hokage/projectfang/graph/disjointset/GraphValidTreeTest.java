package com.hokage.projectfang.graph.disjointset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GraphValidTreeTest {

    private GraphValidTree graphValidTree;

    @BeforeEach
    void setUp() {
        graphValidTree = new GraphValidTree();
    }

    @Test
    void test1() {
        var input = new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}};
        assertTrue(graphValidTree.isValid(5, input));
    }

    @Test
    void test2() {
        var input = new int[][]{{0, 1}, {1, 2}, {2, 3}, {1,3},{1, 4}};
        assertFalse(graphValidTree.isValid(5, input));
    }
}