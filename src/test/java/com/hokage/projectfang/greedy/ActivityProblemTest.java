package com.hokage.projectfang.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivityProblemTest {
    private ActivityProblem activityProblem;

    @BeforeEach
    void setUp() {
        activityProblem = new ActivityProblem();
    }

    @Test
    void test1() {
        var input = new int[][]{{10, 20}, {20, 20}, {12, 15}};
        var output = 2;
        assertEquals(2, activityProblem.noOfActivityMinHeap(input));
    }

    @Test
    void test2() {
        var input = new int[][]{{10, 20}, {20, 20}, {12, 15}};
        var output = 2;
        assertEquals(2, activityProblem.noOfRoomsChrololoicalOrdering(input));
    }
}