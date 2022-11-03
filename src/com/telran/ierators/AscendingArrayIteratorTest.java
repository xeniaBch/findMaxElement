package com.telran.ierators;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AscendingArrayIteratorTest {

    @Test
    public void inversArrayIteratorTest(){
        Integer[] array = {-7, 6, 7, 4, -2, 0};
        List<Integer> iterated = new ArrayList<>();
        List<Integer> expected = Arrays.asList(-7, -2, 0, 4, 6, 7);
        AscendingArrayIterator iterator = new AscendingArrayIterator(array);
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterated.add(index);
        }
        assertEquals(expected, iterated);
    }

}