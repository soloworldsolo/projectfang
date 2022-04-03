package com.hokage.projectfang.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CakeDistributionTest {

    private CakeDistribution cakeDistribution;

    @BeforeEach
    void setUp() {
        cakeDistribution = new CakeDistribution();
    }

    @Test
    public void test1() {
        int input[] = {5,1,5};
        int result = cakeDistribution.distribute(input, 22);
        assertEquals(0,result);
    }
    @Test
    public void test2() {
        int input[] = {3,4,1,2};
        int result = cakeDistribution.distribute(input, 25);
        assertEquals(1,result);
    }

}