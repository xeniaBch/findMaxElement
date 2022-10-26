package com.telran.maxelement.maxElementTests;
import com.telran.maxelement.exceptions.EmptyCollectionException;
import com.telran.maxelement.maxElement.MaxElement;
import com.telran.maxelement.model.Point;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {
    MaxElement<Point> fList = new MaxElement();
    @Test
    public void removeOneElementTest(){
        Point point = new Point(3,4);
        Point point2 = new Point(0,0);
        fList.addElement(point);
        fList.addElement(point2);
        fList.removeLast();
        assertEquals(point, fList.getLast());
    }

    @Test
    public void removeAllElementsTest(){
        Point point = new Point(3,4);
        Point point2 = new Point(12,5);
        fList.addElement(point);
        fList.addElement(point2);
        fList.removeLast();
        fList.removeLast();
        assertEquals(0, fList.size());
    }

    @Test
    public void removeAndAddElementTest(){
        Point point = new Point(3,4);
        fList.addElement(point);
        fList.removeLast();
        Point point2 = new Point(0,0);
        fList.addElement(point2);
        assertEquals(point2, fList.getLast());
    }


    @Test
    public void removeNotAllElementsNegativeTest(){
        Point point = new Point(3,4);
        Point point2 = new Point(12,5);
        fList.addElement(point);
        fList.addElement(point2);
        fList.removeLast();
        Assert.assertNotEquals(0, fList.size());
    }
    @Test
    public void RemoveAllEmptyDeque(){
        Assert.assertThrows(EmptyCollectionException.class, ()->fList.removeLast());
    }
}
