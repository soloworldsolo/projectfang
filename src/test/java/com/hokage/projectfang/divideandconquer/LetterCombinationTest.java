package com.hokage.projectfang.divideandconquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationTest {

    private LetterCombination letterCombination;

    @BeforeEach
    void setUp() {
        letterCombination = new LetterCombination();
    }

    @Test
    void test1() {
        List<String> result = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertEquals(result, letterCombination.letterCombinations("23"));
    }
}