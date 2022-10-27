package com.telran.tasks;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Task1Test {
    @Test
    public void sortArrayByNegativeAndPositiveTest(){
        int[] array = {-5, 6, 4, 0, -9};
        ArrayList<Integer>  res = new ArrayList<>();
        res.add(-5);
        res.add(-9);
        res.add(6);
        res.add(4);
        res.add(0);
        assertArrayEquals(res.toArray(), Task1.getIntegers(array).toArray());
    }

    @Test
    public void sortArrayOnlyPositiveTest(){
        int[] array = {5, 6, 4, 0, 9};
        ArrayList<Integer>  res = new ArrayList<>();
        res.add(5);
        res.add(6);
        res.add(4);
        res.add(0);
        res.add(9);
        assertArrayEquals(res.toArray(), Task1.getIntegers(array).toArray());
    }

    @Test
    public void sortArrayOnlyNegativeTest(){
        int[] array = {-5, -6, -4, -2, -9};
        ArrayList<Integer>  res = new ArrayList<>();
        res.add(-5);
        res.add(-6);
        res.add(-4);
        res.add(-2);
        res.add(-9);
        assertArrayEquals(res.toArray(), Task1.getIntegers(array).toArray());
    }
}