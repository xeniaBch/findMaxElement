package com.telran.maxelement.maxElementTests;

import com.telran.maxelement.comparator.AngleComparator;
import com.telran.maxelement.maxElement.MaxElement;
import com.telran.maxelement.model.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetMaxAngleTest {
    AngleComparator angleComparator = new AngleComparator();
    MaxElement<Point> fList = new MaxElement(angleComparator);

    @Test
    public void getMaxFromElementsListTest() {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(-3, -4);
        fList.addElement(point1);
        fList.addElement(point2);
        assertEquals(point2, fList.getMaxElement());
    }

    @Test
    public void getMaxFromOneElementTest() {
        Point point1 = new Point(3, 4);
        fList.addElement(point1);
        assertEquals(point1, fList.getMaxElement());
    }


}
