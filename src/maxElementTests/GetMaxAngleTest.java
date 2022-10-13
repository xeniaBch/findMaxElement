package maxElementTests;
import maxElement.MaxElement;
import model.Cartesian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GetMaxAngleTest {
   MaxElement fList = new MaxElement();
    @Test
    public void getMaxFromOneElementTest(){
        fList.addElement(new Cartesian(3,4));
        assertEquals(0.92729, fList.getMaxAngle(), .00001);
    }

    @Test
    public void getMaxFromTwoElementTest(){
        fList.addElement(new Cartesian(3,4));
        fList.addElement(new Cartesian(0,9));
        assertEquals(1.57079, fList.getMaxAngle(), .00001);
    }

    @Test
    public void getMaxTwoElementTest(){
        fList.addElement(new Cartesian(0,25));
        fList.addElement(new Cartesian(-3,4));
        assertEquals(2.21429, fList.getMaxAngle(), .00001);
    }

    @Test
    public void getMaxFromLisTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(0,-25));
        fList.addElement(new Cartesian(12,5));
        fList.addElement(new Cartesian(20,21));
        fList.addElement(new Cartesian(1,0));
        fList.addElement(new Cartesian(0,10));
        assertEquals(2.21429, fList.getMaxAngle(), .00001);
    }

    @Test
    public void getMaxFromListAfterRemoveTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(12,5));
        fList.addElement(new Cartesian(20,21));
        fList.addElement(new Cartesian(1,0));
        fList.addElement(new Cartesian(0,10));
        fList.removeLast();
        fList.removeLast();
        fList.removeLast();
        assertEquals(2.21429, fList.getMaxAngle(), .00001);
    }

    @Test
    public void getMaxIsNotLastTest(){
        fList.addElement(new Cartesian(12,5));
        fList.addElement(new Cartesian(20,21));
        fList.addElement(new Cartesian(1,0));
        fList.addElement(new Cartesian(0,10));
        assertNotEquals(fList.getLast().angleBetweenDistanceAndOX(), fList.getMaxAngle());
    }

    @Test
    public void getMaxIsLastTest(){
        fList.addElement(new Cartesian(12,5));
        fList.addElement(new Cartesian(20,21));
        fList.addElement(new Cartesian(1,0));
        fList.removeLast();
        assertEquals(fList.getLast().angleBetweenDistanceAndOX(), fList.getMaxAngle(), .000001);
    }

}
