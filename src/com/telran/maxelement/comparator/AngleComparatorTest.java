package com.telran.maxelement.comparator;

import com.telran.maxelement.model.Point;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class AngleComparatorTest {
    AngleComparator angleComparator = new AngleComparator();

    @Test
    public void compareAnglesInFirstQuartal(){
        Point point1 = new Point(3, 4);
        Point point2 = new Point(4, 3);
        assertTrue(angleComparator.compare(point1, point2)>0);
    }

    @Test
    public void compareAnglesInDifferentQuartals(){
        Point point1 = new Point(-3, 4);
        Point point2 = new Point(3, 4);
        assertTrue(angleComparator.compare(point1, point2)>0);
    }

    @Test
    public void compareAnglesWithNegativeY(){
        Point point1 = new Point(3, 4);
        Point point2 = new Point(-3, -4);
        assertTrue(angleComparator.compare(point1, point2)<0);
    }

    @Test
    public void compareAnglesOnAxe(){
        Point point1 = new Point(28, 0);
        Point point2 = new Point(3, 0);
        assertTrue(angleComparator.compare(point1, point2) == 0);
    }
}