package com.telran.maxelement.maxElementTests;
import com.telran.maxelement.maxElement.MaxElement;
import com.telran.maxelement.model.Point;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddValueTest {

    MaxElement<Point> fList = new MaxElement();
    @Test
    public void addPositiveNumberPositiveTest(){
        Point point = new Point(0,0);
        fList.addElement(point);
        assertEquals(point, fList.getLast());
    }

    @Test
    public void addNegativeNumberPositiveTest(){
        Point point = new Point(-3,-4);
        fList.addElement(point);
        assertEquals(point, fList.getLast());
    }
    @Test
    public void addSameNumberPositiveTest(){
        Point point = new Point(3,-4);
        Point point1 = new Point(-3,-4);
        fList.addElement(point);
        fList.addElement(point1);
        assertEquals(point1, fList.getLast());
    }
    @Test
    public void addTwoDifferentElementsPositiveTest(){
        Point point = new Point(3,-4);
        Point point1 = new Point(20,21);
        fList.addElement(point);
        fList.addElement(point1);
        assertEquals(point1, fList.getLast());
    }
    @Test
    public void addNegativeTest(){
        Point point = new Point(-3,-4);
        fList.addElement(point);
        Assert.assertNotEquals(0, fList.size());
    }



}
