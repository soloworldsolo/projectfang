package com.hokage.projectfang.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DisjointUnionByRankTest {

    DisjointUnionByRank disjointUnionByRank;

    @BeforeEach
    void setUp() {
        disjointUnionByRank = new DisjointUnionByRank();
    }

    @Test
    void test1() {
        int[][] input = new int[][]{{1, 2}, {2, 5}, {5, 6}, {6, 7}, {3, 8}, {8, 9}};
        disjointUnionByRank.disjointBRank(9,input);
        disjointUnionByRank.disjointUnionBRank(9,4);
      Assertions.assertTrue( disjointUnionByRank.connected(4,9));
    }
}