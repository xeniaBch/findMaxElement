package maxElementTests;
import exceptions.EmptyCollectionException;
import maxElement.MaxElement;
import model.Cartesian;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {
   MaxElement fList = new MaxElement();
    @Test
    public void removeOneElementTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(12,-5));
        fList.removeLast();
        assertEquals(5, fList.getLast().distanceFromCenter(), .000001);
    }

    @Test
    public void removeAllElementsTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(12,-5));
        fList.removeLast();
        fList.removeLast();
        Assert.assertTrue(fList.isEmpty());
    }

    @Test
    public void removeAndAddElementTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.removeLast();
        fList.addElement(new Cartesian(12,-5));
        assertEquals(13, fList.getLast().distanceFromCenter(), .000001);
    }

    @Test
    public void removeOneElementNegativeTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(12,-5));
        fList.removeLast();
        assertEquals(5, fList.getLast().distanceFromCenter(), .000001);
    }

    @Test
    public void removeNotAllElementsNegativeTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(12,-5));
        fList.removeLast();
        Assert.assertFalse(fList.isEmpty());
    }
    @Test
    public void RemoveAllEmptyDeque(){
        Assert.assertThrows(EmptyCollectionException.class, ()->fList.removeLast());
    }
}
