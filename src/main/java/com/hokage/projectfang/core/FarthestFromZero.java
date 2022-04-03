package com.hokage.projectfang.core;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FarthestFromZero {

    public int farthestFromZero(int n ,int[] input) {
        if(input != null);
        TreeSet<Integer> inputs = Arrays.stream(input).boxed().collect(Collectors.toCollection(TreeSet::new));
        int firstNumber = inputs.first();
        int lastNumber = inputs.last();
        return Math.abs(firstNumber) > Math.abs(lastNumber) ? firstNumber : lastNumber;
    }
}
