package com.hokage.projectfang.graph;

import java.util.stream.IntStream;

public class DisjointSet {
    int[] input;

    public void disjointSet(int total, int[][] sets) {
        input = new int[total + 1];
        IntStream.range(0, total + 1).forEach(i -> input[i] = i);
        for (int[] set : sets) {
            unionQuickFind(set[0], set[1]);
        }
    }

    public void disjointSetQuickUnion(int total, int[][] sets) {
        input = new int[total + 1];
        IntStream.range(0, total + 1).forEach(i -> input[i] = i);
        for (int[] set : sets) {
            unionQuickJoin(set[0], set[1]);
        }
    }

    public void unionQuickFind(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] == rootY) {
                    input[i] = rootX;
                }
            }
        }
    }

    public void unionQuickJoin(int x, int y) {
        int roottX = findQuickUnion(x);
        int rootY = findQuickUnion(y);
        if (roottX != rootY) {
            input[y] = roottX;
        }

    }

    private int findQuickUnion(int a) {

        while (a != input[a]) {
            a = input[a];
        }
        return a;
    }

    private int find(int a) {
        return input[a];
    }


    public boolean isConnected(int a, int b) {
        return find(a) == find(b);
    }
}
