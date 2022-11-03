package com.telran.ierators;

import java.lang.reflect.Array;
import java.util.*;

public class AscendingArrayIterator implements Iterator<Integer> {

    int currentIndex;
    List<Integer> buffer;

    public AscendingArrayIterator(Integer[] source) {
        initIterator(source);
        this.currentIndex = 0;
    }

    public void initIterator(Integer[] source) {
        buffer = new ArrayList<>();
        Collections.addAll(buffer, source);
        Collections.sort(buffer);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < buffer.size();
    }

    @Override
    public Integer next() {
        int res = buffer.get(currentIndex);
        currentIndex++;
        return res;
    }
}
