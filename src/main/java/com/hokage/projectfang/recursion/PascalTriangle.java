package com.hokage.projectfang.recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<Integer> pascalTriangle(int noOfRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < noOfRows; i++) {
            result.add(makeRows(i, result));
        }
        return result.get(noOfRows-1);
    }

    private List<Integer> makeRows(int i, List<List<Integer>> result) {
        List<Integer> currentRow = new ArrayList<>();
        if (i == 0) {
            currentRow.add(1);
            return currentRow;
        }
        List<Integer> previous = result.get(i - 1);
        int j = 0;
        while (j <= i) {
            if (j == 0 || j == i) {
                currentRow.add(1);
            } else {
                currentRow.add(previous.get(j - 1) + previous.get(j));
            }
            j++;
        }
        return currentRow;
    }
}
