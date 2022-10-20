package maxElementTests;
import maxElement.MaxElement;
import model.PointDistance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GetMaxDistanceTest {
    MaxElement<PointDistance> fList = new MaxElement();
    @Test
    public void getMaxFromOneElementTest(){
        fList.addElement(new PointDistance(3,4));
        assertEquals(25, fList.getMaxElement().distanceFromCenter());
    }

    @Test
    public void getMaxFromTwoElementTest(){
        fList.addElement(new PointDistance(3,4));
        fList.addElement(new PointDistance(0,9));
        assertEquals(81, fList.getMaxElement().distanceFromCenter());
    }

    @Test
    public void getMaxTwoElementTest(){
        fList.addElement(new PointDistance(-3,-4));
        fList.addElement(new PointDistance(0,-25));
        assertEquals(625, fList.getMaxElement().distanceFromCenter());
    }

    @Test
    public void getMaxFromLisTest(){
        fList.addElement(new PointDistance(-3,-4));
        fList.addElement(new PointDistance(0,-25));
        fList.addElement(new PointDistance(12,5));
        fList.addElement(new PointDistance(20,21));
        fList.addElement(new PointDistance(1,0));
        fList.addElement(new PointDistance(0,10));
        assertEquals(841, fList.getMaxElement().distanceFromCenter());
    }

    @Test
    public void getMaxFromListAfterRemoveTest(){
        fList.addElement(new PointDistance(-3,-4));
        fList.addElement(new PointDistance(12,5));
        fList.addElement(new PointDistance(20,21));
        fList.addElement(new PointDistance(1,0));
        fList.addElement(new PointDistance(0,10));
        fList.removeLast();
        assertEquals(841, fList.getMaxElement().distanceFromCenter());
    }

    @Test
    public void getMaxIsNotLastTest(){
        fList.addElement(new PointDistance(12,5));
        fList.addElement(new PointDistance(20,21));
        fList.addElement(new PointDistance(1,0));
        fList.addElement(new PointDistance(0,10));
        assertNotEquals(fList.getLast().distanceFromCenter(), fList.getMaxElement().distanceFromCenter());
    }

    @Test
    public void getMaxIsLastTest(){
        fList.addElement(new PointDistance(12,5));
        fList.addElement(new PointDistance(20,21));
        fList.addElement(new PointDistance(1,0));
        fList.removeLast();
        assertEquals(fList.getLast().distanceFromCenter(), fList.getMaxElement().distanceFromCenter());
    }

}
