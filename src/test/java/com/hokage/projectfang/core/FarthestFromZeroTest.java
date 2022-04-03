package com.hokage.projectfang.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarthestFromZeroTest {
    @Test
    public void test1() {
        FarthestFromZero farthestFromZero = new FarthestFromZero();
        int res = farthestFromZero.farthestFromZero(5, new int[]{1, 2, 3, 4, 5});
        assertEquals(5, res);
    }

    @Test
    public void test2() {
        FarthestFromZero farthestFromZero = new FarthestFromZero();
        int res = farthestFromZero.farthestFromZero(4, new int[]{-10, 7, 5, 1});
        assertEquals(-10, res);
    }


}