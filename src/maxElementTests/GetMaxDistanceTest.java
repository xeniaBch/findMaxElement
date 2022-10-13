package maxElementTests;
import maxElement.MaxElement;
import model.Cartesian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GetMaxDistanceTest {
   MaxElement fList = new MaxElement();
    @Test
    public void getMaxFromOneElementTest(){
        fList.addElement(new Cartesian(3,4));
        assertEquals(5, fList.getMaxDistance(), .000001);
    }

    @Test
    public void getMaxFromTwoElementTest(){
        fList.addElement(new Cartesian(3,4));
        fList.addElement(new Cartesian(0,9));
        assertEquals(9, fList.getMaxDistance(), .000001);
    }

    @Test
    public void getMaxTwoElementTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(0,-25));
        assertEquals(25, fList.getMaxDistance(), .000001);
    }

    @Test
    public void getMaxFromLisTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(0,-25));
        fList.addElement(new Cartesian(12,5));
        fList.addElement(new Cartesian(20,21));
        fList.addElement(new Cartesian(1,0));
        fList.addElement(new Cartesian(0,10));
        assertEquals(29, fList.getMaxDistance(), .000001);
    }

    @Test
    public void getMaxFromListAfterRemoveTest(){
        fList.addElement(new Cartesian(-3,-4));
        fList.addElement(new Cartesian(12,5));
        fList.addElement(new Cartesian(20,21));
        fList.addElement(new Cartesian(1,0));
        fList.addElement(new Cartesian(0,10));
        fList.removeLast();
        assertEquals(29, fList.getMaxDistance(), .000001);
    }

    @Test
    public void getMaxIsNotLastTest(){
        fList.addElement(new Cartesian(12,5));
        fList.addElement(new Cartesian(20,21));
        fList.addElement(new Cartesian(1,0));
        fList.addElement(new Cartesian(0,10));
        assertNotEquals(fList.getLast().distanceFromCenter(), fList.getMaxDistance());
    }

    @Test
    public void getMaxIsLastTest(){
        fList.addElement(new Cartesian(12,5));
        fList.addElement(new Cartesian(20,21));
        fList.addElement(new Cartesian(1,0));
        fList.removeLast();
        assertEquals(fList.getLast().distanceFromCenter(), fList.getMaxDistance(), .000001);
    }

}
