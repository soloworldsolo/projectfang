package com.hokage.projectfang.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    private PascalTriangle pascalTriangle;

    @Test
    void test1() {
        pascalTriangle = new PascalTriangle();
        List<Integer> res = pascalTriangle.pascalTriangle(5);

    }
}