package maxElementTests;
import maxElement.MaxElement;
import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {
    MaxElement fList = new MaxElement();
    @Test
    public void removeOneElementTest(){
        fList.addElement(4);
        fList.addElement(3);
        fList.removeLast();
        Assert.assertEquals(4, fList.getLast());
    }

    @Test
    public void removeAllElementsTest(){
        fList.addElement(4);
        fList.addElement(3);
        fList.removeLast();
        fList.removeLast();
        Assert.assertTrue(fList.isEmpty());
    }

    @Test
    public void removeAndAddElementTest(){
        fList.addElement(4);
        fList.removeLast();
        fList.addElement(35);
        Assert.assertEquals(35, fList.getLast());
    }

    @Test
    public void removeOneElementNegativeTest(){
        fList.addElement(4);
        fList.addElement(3);
        fList.removeLast();
        Assert.assertNotEquals(3, fList.getLast());
    }

    @Test
    public void removeNotAllElementsNegativeTest(){
        fList.addElement(4);
        fList.addElement(3);
        fList.removeLast();
        Assert.assertFalse(fList.isEmpty());
    }
}
