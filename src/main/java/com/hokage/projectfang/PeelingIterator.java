package com.hokage.projectfang;

import java.util.Iterator;

public class PeelingIterator implements Iterator<Integer> {

    Iterator<Integer> iterator;
    private Integer peek;

    public PeelingIterator(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            peek = iterator.next();
        }
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return peek != null;
    }

    @Override
    public Integer next() {
        Integer prev = peek;
        if (iterator.hasNext()) {
            peek = iterator.next();

        }
        return prev;
    }

    public Integer peek() {
        return peek;
    }
}
