package maxElement;


import exceptions.EmptyCollectionException;

import java.util.*;

public class MaxElement<T>  {

    //implement collection

    Deque<T> objectList;
    Deque<T> maxValue;
    Comparator<T> comparator;


    public MaxElement(Comparator<T> comparator) {
        this.objectList = new ArrayDeque<>();
        this.maxValue = new ArrayDeque<>();
        this.comparator = comparator;
    }

    public MaxElement() {
        this.objectList = new ArrayDeque<>();
        this.maxValue = new ArrayDeque<>();
    }

    public void addElement(T element) {

        if (objectList.size()==0) {
            maxValue.addLast(element);
        } else {
            T maxNumber = maxValue.getLast();
            if(comparator!=null && comparator.compare(maxNumber, element) <=0
            || ((Comparable<T>) maxNumber).compareTo(element) <=0 ){
                maxValue.addLast(element);
            }
        }
        objectList.addLast(element);
    }


    public T removeLast() {
        if (objectList.size() == 0) throw new EmptyCollectionException();
        T lastNumber = objectList.removeLast();
        if (lastNumber == maxValue.getLast()) maxValue.removeLast();
        return lastNumber;
    }

    public T getLast() {
        if (objectList.isEmpty()) throw new EmptyCollectionException();
        return objectList.getLast();
    }

    public T getMaxElement() {
        if (maxValue.size()==0) throw new EmptyCollectionException();
        return maxValue.getLast();
    }

    public int size() {
        return objectList.size();
    }

}
