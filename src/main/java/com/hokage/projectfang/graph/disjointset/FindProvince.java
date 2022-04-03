package com.hokage.projectfang.graph.disjointset;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindProvince {

    public int findProvince(int[][] nodes) {
        int[] links = new int[nodes.length];
        Arrays.fill(links,-1);
        int current = 0;
        for (int[] node : nodes) {
            for (int i = current + 1; i < node.length; i++) {
                if (current != i && node[i] == 1) {
                    union(current, i, nodes, links);
                }

            }
            ++current;
        }
        return (int) Arrays.stream(links).filter(i-> i==-1).count();
    }

    private void union(int current, int i, int[][] nodes, int[] links) {
        int rootX = find(current, links);
        int rootY = find(i, links);
        if (rootX != rootY) {
            links[rootY] =rootX;
        }
    }


    private int find(int x, int[] nodes) {
        if (nodes[x] == -1) {
            return x;
        }
        return  find(nodes[x], nodes);
    }
}
