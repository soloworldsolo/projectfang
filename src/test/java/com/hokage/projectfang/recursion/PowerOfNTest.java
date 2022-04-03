package com.hokage.projectfang.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfNTest {

    PowerOfN powerOfN;

    @BeforeEach
    void setUp() {
        powerOfN = new PowerOfN();
    }

    @Test
    void test1() {
        powerOfN = new PowerOfN();
        double result = powerOfN.myPow(2.00000, 10);
        assertEquals(1024.00000,result);
    }

    @Test
    void test2() {
        powerOfN = new PowerOfN();
        double result = powerOfN.myPow(2.10000, 3);
        assertEquals(9.26100,result);
    }
}