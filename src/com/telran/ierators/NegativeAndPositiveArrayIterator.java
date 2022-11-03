package com.telran.ierators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NegativeAndPositiveArrayIterator implements Iterator<Integer> {

    List<Integer> buffer;
    int[] source;

    public NegativeAndPositiveArrayIterator(int[] source) {
        initIterator(source);
    }

    int currentIndex = 0;

    public void initIterator(int[] source) {
        buffer = new ArrayList<>();
        List<Integer> listPositive = new ArrayList<>();
        for (int num: source) {
            if (num < 0) {
                buffer.add(num);
            }
            if (num >= 0) {
                listPositive.add(num);
            }
        }
        buffer.addAll(listPositive);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < buffer.size();
    }

    @Override
    public Integer next() {
      int currentNumber = buffer.get(currentIndex);
      currentIndex++;
      return currentNumber;
    }

}
