package com.telran.maxelement.maxElementTests;
import com.telran.maxelement.exceptions.EmptyCollectionException;
import com.telran.maxelement.maxElement.MaxElement;
import com.telran.maxelement.model.PointDistance;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {
    MaxElement<PointDistance> fList = new MaxElement();
    @Test
    public void removeOneElementTest(){
        fList.addElement(new PointDistance(-3,-4));
        fList.addElement(new PointDistance(12,-5));
        fList.removeLast();
        assertEquals(25, fList.getLast().distanceFromCenter());
    }

    @Test
    public void removeAllElementsTest(){
        fList.addElement(new PointDistance(-3,-4));
        fList.addElement(new PointDistance(12,-5));
        fList.removeLast();
        fList.removeLast();
        assertEquals(0, fList.size());
    }

    @Test
    public void removeAndAddElementTest(){
        fList.addElement(new PointDistance(-3,-4));
        fList.removeLast();
        fList.addElement(new PointDistance(12,-5));
        assertEquals(169, fList.getLast().distanceFromCenter());
    }

    @Test
    public void removeOneElementNegativeTest(){
        fList.addElement(new PointDistance(-3,-4));
        fList.addElement(new PointDistance(12,-5));
        fList.removeLast();
        assertEquals(25, fList.getLast().distanceFromCenter());
    }

    @Test
    public void removeNotAllElementsNegativeTest(){
        fList.addElement(new PointDistance(-3,-4));
        fList.addElement(new PointDistance(12,-5));
        fList.removeLast();
        Assert.assertNotEquals(0, fList.size());
    }
    @Test
    public void RemoveAllEmptyDeque(){
        Assert.assertThrows(EmptyCollectionException.class, ()->fList.removeLast());
    }
}
