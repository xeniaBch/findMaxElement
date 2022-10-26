package com.telran.maxelement.maxElementTests;
import com.telran.maxelement.maxElement.MaxElement;
import com.telran.maxelement.model.Point;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GetMaxDistanceTest {
    MaxElement<Point> fList = new MaxElement();
    @Test
    public void getMaxFromOneElementTest(){
        Point point = new Point(3,4);
        fList.addElement(point);
        assertEquals(point, fList.getMaxElement());
    }

    @Test
    public void getMaxFromTwoElementTest(){
        Point point = new Point(3,4);
        Point point2 = new Point(0,0);
        fList.addElement(point);
        fList.addElement(point2);
        assertEquals(point, fList.getMaxElement());
    }

    @Test
    public void getMaxTwoElementTest(){
        Point point = new Point(3,4);
        Point point2 = new Point(-25,0);
        fList.addElement(point);
        fList.addElement(point2);
        assertEquals(point2, fList.getMaxElement());
    }


    @Test
    public void getMaxFromListAfterRemoveTest(){
        Point point = new Point(3,4);
        Point point2 = new Point(-25,0);
        Point point3 = new Point(12,5);
        Point point4 = new Point(20,21);
        fList.addElement(point);
        fList.addElement(point2);
        fList.addElement(point3);
        fList.addElement(point4);
        fList.removeLast();
        assertEquals(point2, fList.getMaxElement());
    }

    @Test
    public void getMaxIsNotLastTest(){
        fList.addElement(new Point(12,5));
        fList.addElement(new Point(20,21));
        fList.addElement(new Point(1,0));
        fList.addElement(new Point(0,10));
        assertNotEquals(fList.getLast(), fList.getMaxElement());
    }

    @Test
    public void getMaxIsLastTest(){
        fList.addElement(new Point(12,5));
        fList.addElement(new Point(20,21));
        fList.addElement(new Point(1,0));
        fList.removeLast();
        assertEquals(fList.getLast(), fList.getMaxElement());
    }

}
