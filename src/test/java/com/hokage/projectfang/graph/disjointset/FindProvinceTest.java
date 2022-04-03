package com.hokage.projectfang.graph.disjointset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindProvinceTest {
  FindProvince findProvince;

  @BeforeEach
  void setUp() {
    findProvince = new FindProvince();
  }

  @Test
  void test1() {
    int[][] input = new int[][] {{1,1,0},{1,1,0},{0,0,1}};
    assertEquals(2,findProvince.findProvince(input));
  }
  @Test
  void test12() {
    int[][] input = new int[][] {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
    assertEquals(1,findProvince.findProvince(input));
  }
}