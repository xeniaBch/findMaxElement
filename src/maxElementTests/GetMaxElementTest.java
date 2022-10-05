package maxElementTests;
import maxElement.MaxElement;
import org.junit.Assert;
import org.junit.Test;

import maxElement.MaxElement;
import org.junit.Test;

public class GetMaxElementTest {
    MaxElement fList = new MaxElement();
    @Test
    public void getMaxFromOneElementTest(){
        fList.addElement(0);
        Assert.assertEquals(0, fList.getMax());
    }

    @Test
    public void getMaxFromTwoElementTest(){
        fList.addElement(0);
        fList.addElement(-1);
        Assert.assertEquals(0, fList.getMax());
    }

    @Test
    public void getMaxTwoElementTest(){
        fList.addElement(0);
        fList.addElement(2);
        Assert.assertEquals(2, fList.getMax());
    }

    @Test
    public void getMaxFromLisTest(){
        fList.addElement(0);
        fList.addElement(2);
        fList.addElement(8);
        fList.addElement(4);
        fList.addElement(3);
        fList.addElement(15);
        Assert.assertEquals(15, fList.getMax());
    }

    @Test
    public void getMaxFromListAfterRemoveTest(){
        fList.addElement(0);
        fList.addElement(2);
        fList.addElement(8);
        fList.addElement(4);
        fList.addElement(3);
        fList.addElement(15);
        fList.removeLast();
        Assert.assertEquals(8, fList.getMax());
    }

    @Test
    public void getMaxIsNotLastTest(){
        fList.addElement(0);
        fList.addElement(2);
        fList.addElement(8);
        fList.addElement(4);
        Assert.assertNotEquals(fList.getLast(), fList.getMax());
    }

    @Test
    public void getMaxIsLastTest(){
        fList.addElement(0);
        fList.addElement(2);
        fList.addElement(8);
        fList.addElement(4);
        fList.removeLast();
        Assert.assertEquals(fList.getLast(), fList.getMax());
    }

}
