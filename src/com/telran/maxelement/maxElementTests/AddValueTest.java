package com.telran.maxelement.maxElementTests;
import com.telran.maxelement.maxElement.MaxElement;
import com.telran.maxelement.model.PointDistance;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddValueTest {

    MaxElement<PointDistance> fList = new MaxElement();
    @Test
    public void addPositiveNumberPositiveTest(){
        fList.addElement(new PointDistance(3,4));
        assertEquals(25, fList.getLast().distanceFromCenter());
    }

    @Test
    public void addNegativeNumberPositiveTest(){
        fList.addElement(new PointDistance(-3,-4));
        assertEquals(25, fList.getLast().distanceFromCenter());
    }
    @Test
    public void addSameNumberPositiveTest(){
        fList.addElement(new PointDistance(-3,-4));
        fList.addElement(new PointDistance(-3,-4));
        assertEquals(25, fList.getLast().distanceFromCenter());
    }
    @Test
    public void addTwoDifferentElementsPositiveTest(){
        fList.addElement(new PointDistance(3,-4));
        fList.addElement(new PointDistance(12,-5));
        assertEquals(169, fList.getLast().distanceFromCenter());
    }
    @Test
    public void addNegativeTest(){
        fList.addElement(new PointDistance(3,-4));
        Assert.assertNotEquals(0, fList.getLast().distanceFromCenter());
    }



}
