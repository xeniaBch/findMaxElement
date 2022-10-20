package maxElementTests;

import maxElement.MaxElement;
import model.PointAngle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GetMaxAngleTest {
  MaxElement<PointAngle> fList = new MaxElement();
    @Test
    public void getMaxFromOneElementTest(){
        fList.addElement(new PointAngle(3,4));
        assertEquals(0.92729, fList.getMaxElement().angleBetweenDistanceAndOX(), .00001);
    }

    @Test
    public void getMaxFromTwoElementTest(){
        fList.addElement(new PointAngle(3,4));
        fList.addElement(new PointAngle(0,9));
        assertEquals(1.57079,fList.getMaxElement().angleBetweenDistanceAndOX(), .00001);
    }

    @Test
    public void getMaxTwoElementTest(){
        fList.addElement(new PointAngle(-3,25));
        fList.addElement(new PointAngle(-3,4));
        assertEquals(2.21429, fList.getMaxElement().angleBetweenDistanceAndOX(), .00001);
    }

    @Test
    public void getMaxFromLisTest(){
        fList.addElement(new PointAngle(-3,-4));
        fList.addElement(new PointAngle(0,-25));
        fList.addElement(new PointAngle(12,5));
        fList.addElement(new PointAngle(20,21));
        fList.addElement(new PointAngle(1,0));
        fList.addElement(new PointAngle(0,10));
        assertEquals(2.21429, fList.getMaxElement().angleBetweenDistanceAndOX(), .00001);
    }

    @Test
    public void getMaxFromListAfterRemoveTest(){
        fList.addElement(new PointAngle(-3,-4));
        fList.addElement(new PointAngle(12,5));
        fList.addElement(new PointAngle(20,21));
        fList.addElement(new PointAngle(1,0));
        fList.addElement(new PointAngle(0,10));
        fList.removeLast();
        fList.removeLast();
        fList.removeLast();
        assertEquals(2.21429, fList.getMaxElement().angleBetweenDistanceAndOX(), .00001);
    }

    @Test
    public void getMaxIsNotLastTest(){
        fList.addElement(new PointAngle(12,5));
        fList.addElement(new PointAngle(20,21));
        fList.addElement(new PointAngle(1,0));
        fList.addElement(new PointAngle(0,10));
        assertNotEquals(fList.getLast().angleBetweenDistanceAndOX(), fList.getMaxElement().angleBetweenDistanceAndOX());
    }

    @Test
    public void getMaxIsLastTest(){
        fList.addElement(new PointAngle(12,5));
        fList.addElement(new PointAngle(20,21));
        fList.addElement(new PointAngle(1,0));
        fList.removeLast();
        assertEquals(fList.getLast().angleBetweenDistanceAndOX(), fList.getMaxElement().angleBetweenDistanceAndOX(), .000001);
    }

}
