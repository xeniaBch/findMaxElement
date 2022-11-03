package com.telran.ierators;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NegativeAndPositiveArrayIteratorTest {

    @Test
    public void negativeAndPositiveArrayTest(){
        int[] source = {-7, 6, 7, 4, -2, 0};
        List<Integer> iterated = new ArrayList<>();
        List<Integer> expected = Arrays.asList(-7, -2, 6, 7, 4, 0);
        NegativeAndPositiveArrayIterator iterator = new NegativeAndPositiveArrayIterator(source);
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterated.add(index);
        }
        assertEquals(expected, iterated);
    }

    @Test
    public void negativeAndPositiveArrayWithOnlyPositiveTest(){
        int[] source = {5, 3, 2, 1, 9, 0};
        List<Integer> iterated = new ArrayList<>();
        List<Integer> expected = Arrays.asList(5, 3, 2, 1, 9, 0);
        NegativeAndPositiveArrayIterator iterator = new NegativeAndPositiveArrayIterator(source);
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterated.add(index);
        }
        assertEquals(expected, iterated);
    }

    @Test
    public void negativeAndPositiveArrayWithOnlyNegativeTest(){
        int[] source = {-5, -3, -2, -1, -9, -8};
        List<Integer> iterated = new ArrayList<>();
        List<Integer> expected = Arrays.asList(-5, -3, -2, -1, -9, -8);
        NegativeAndPositiveArrayIterator iterator = new NegativeAndPositiveArrayIterator(source);
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterated.add(index);
        }
        assertEquals(expected, iterated);
    }

    @Test
    public void negativeAndPositiveArrayWithOnePositiveTest(){
        int[] source = {0, -5, -3, -2, -1, -9};
        List<Integer> iterated = new ArrayList<>();
        List<Integer> expected = Arrays.asList( -5, -3, -2, -1, -9, 0);
        NegativeAndPositiveArrayIterator iterator = new NegativeAndPositiveArrayIterator(source);
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterated.add(index);
        }
        assertEquals(expected, iterated);
    }

}