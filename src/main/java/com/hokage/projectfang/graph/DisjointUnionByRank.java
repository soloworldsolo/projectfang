package com.hokage.projectfang.graph;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DisjointUnionByRank {
    int[] input;
    int[] rank;

    public void disjointBRank(int totalNodes, int[][] edges) {
        this.input = new int[totalNodes + 1];
        this.rank = new int[totalNodes + 1];
        IntStream.range(0, totalNodes + 1).forEach(i -> input[i] = i);
        Arrays.fill(rank, 1);
        for (int[] edge : edges) {
            disjointUnionBRank(edge[0], edge[1]);
        }

    }

    public int find(int x) {
        if (x == input[x]) {
            return x;
        }
        return input[x] = find(input[x]);
    }

     void disjointUnionBRank(int verice1, int vertice2) {
        int rootX = find(verice1);
        int rootY = find(vertice2);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                input[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                input[rootX] = rootY;
            } else {
                input[rootY] = rootX;
                rank[rootX] += 1;
            }
        }

    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

   /* private int find(int verice) {
        while (verice != input[verice]) {
            verice = input[verice];
        }
        return verice;
    }*/
}
