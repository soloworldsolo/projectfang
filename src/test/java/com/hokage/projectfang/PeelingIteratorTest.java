package com.hokage.projectfang;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeelingIteratorTest {

    PeelingIterator peelingIterator;


    @Test
    void test1() {
        List<Integer> iter = new ArrayList<>();
        iter.add(1);
        iter.add(2);
        iter.add(3);
        iter.add(4);
        peelingIterator = new PeelingIterator((iter.iterator()));

    }
}