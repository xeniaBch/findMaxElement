package maxElementTests;
import maxElement.MaxElement;
import model.Cartesian;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddValueTest {

    MaxElement fList = new MaxElement();
    @Test
    public void addPositiveNumberPositiveTest(){
        fList.addElement(new Cartesian(3,4));
        assertEquals(5, fList.getLast().distanceFromCenter(), .000001);
    }

    @Test
    public void addNegativeNumberPositiveTest(){
        fList.addElement(new Cartesian(-3,-4));
        assertEquals(5, fList.getLast().distanceFromCenter(), .000001);
    }
    @Test
    public void addSameNumberPositiveTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(-3,-4));
        assertEquals(5, fList.getLast().distanceFromCenter(), .000001);
    }
    @Test
    public void addTwoDifferentElementsPositiveTest(){
        fList.addElement(new Cartesian(3,-4));
        fList.addElement(new Cartesian(12,-5));
        assertEquals(13, fList.getLast().distanceFromCenter(), .000001);
    }
    @Test
    public void addNegativeTest(){
        fList.addElement(new Cartesian(3,-4));
        Assert.assertNotEquals(0, fList.getLast().distanceFromCenter());
    }



}
