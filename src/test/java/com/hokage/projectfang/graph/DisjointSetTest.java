package com.hokage.projectfang.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DisjointSetTest {
    DisjointSet disjointSet;

    @BeforeEach
    void setUp() {
        disjointSet = new DisjointSet();
    }

    @Test
    void test1() {
        int[][] input = new int[][]{{1, 2}, {2, 5}, {5, 6}, {6, 7}, {3, 8}, {8, 9}};
        disjointSet.disjointSet(9, input);
        assertTrue(disjointSet.isConnected(1, 5));
        assertTrue(disjointSet.isConnected(5, 7));
        assertFalse(disjointSet.isConnected(4, 9));
    }

    @Test
    void test11() {
        int[][] input = new int[][]{{1, 2}, {2, 5}, {5, 6}, {6, 7}, {3, 8}, {8, 9}};
        disjointSet.disjointSetQuickUnion(9, input);
        assertTrue(disjointSet.isConnected(1, 5));
        assertTrue(disjointSet.isConnected(5, 7));
        assertFalse(disjointSet.isConnected(4, 9));
    }
}