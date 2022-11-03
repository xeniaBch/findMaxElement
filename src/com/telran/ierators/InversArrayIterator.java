package com.telran.ierators;

import java.util.Iterator;

public class InversArrayIterator<T> implements Iterator<T> {

    T[] array;
    int currentIndex;

    public InversArrayIterator(T[] array) {
        this.array = array;
        this.currentIndex = array.length-1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        T res = array[currentIndex];
        currentIndex--;
        return res;
    }
}
