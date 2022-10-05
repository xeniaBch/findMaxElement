package maxElementTests;
import maxElement.MaxElement;
import org.junit.Assert;
import org.junit.Test;

public class AddValueTest {
    MaxElement fList = new MaxElement();
    @Test
    public void addPositiveNumberPositiveTest(){
        fList.addElement(4);
        Assert.assertEquals(4, fList.getLast());
    }

    @Test
    public void addNegativeNumberPositiveTest(){
        fList.addElement(-3);
        Assert.assertEquals(-3, fList.getLast());
    }
    @Test
    public void addSameNumberPositiveTest(){
        fList.addElement(-3);
        Assert.assertEquals(-3, fList.getLast());
    }
    @Test
    public void addTwoElementsPositiveTest(){
        fList.addElement(0);
        fList.addElement(9);
        Assert.assertEquals(9, fList.getLast());
    }
    @Test
    public void addNegativeTest(){
        fList.addElement(2);
        Assert.assertNotEquals(0, fList.getLast());
    }



}
