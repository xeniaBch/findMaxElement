package maxElement;


import exceptions.EmptyCollectionException;
import model.Cartesian;

import java.util.*;

public class MaxElement {

    //implement collection

    Deque<Cartesian> objectList;
    Deque<Cartesian> maxDistance;
    Deque<Cartesian> maxAngle;

    public MaxElement() {
        this.objectList = new ArrayDeque<>();
        this.maxDistance = new ArrayDeque<>();
        this.maxAngle = new ArrayDeque<>();
    }

    public void addElement(Cartesian cartesian) {

        if (objectList.isEmpty()) {
            objectList.addLast(cartesian);
            maxDistance.addLast(cartesian);
            maxAngle.addLast(cartesian);
            return;
        }
        objectList.addLast(cartesian);

        if (cartesian.distanceFromCenter() > getMaxDistance()) {
            maxDistance.addLast(cartesian);
        } else {
            maxDistance.addLast(maxDistance.getLast());
        }

        if (cartesian.angleBetweenDistanceAndOX() > getMaxAngle()) {
            maxAngle.addLast(cartesian);
        } else {
            maxAngle.addLast(maxAngle.getLast());
        }

    }


    public void removeLast() {
        if (objectList.isEmpty()) throw new EmptyCollectionException();
        objectList.removeLast();
        maxDistance.removeLast();
        maxAngle.removeLast();
    }

    public Cartesian getLast() {
        if (objectList.isEmpty()) throw new EmptyCollectionException();
        return objectList.getLast();
    }

    public double getMaxDistance() {
        if (maxDistance.isEmpty()) throw new EmptyCollectionException();
        return maxDistance.getLast().distanceFromCenter();
    }

    public double getMaxAngle() {
        if (maxAngle.isEmpty()) throw new EmptyCollectionException();
        return maxAngle.getLast().angleBetweenDistanceAndOX();
    }

    public int size() {
        return objectList.size();
    }

    public boolean isEmpty() {
        return objectList.isEmpty();
    }
}
