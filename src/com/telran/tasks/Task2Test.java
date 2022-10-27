package com.telran.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void searchMaxNumberOnSectionTest(){
        double[] array = {0.0, 0.5, 0.6, 0.7, 1.1, 1.4};
        double sectionLength = 0.4;
        assertEquals(3, Task2.maxNumbersInSection(array, sectionLength));
    }

    @Test
    public void searchMaxNumberOnSectionWithAllLengthTest(){
        double[] array = {0.0, 0.5, 0.6, 0.7, 1.1, 1.4};
        double sectionLength = 1.4;
        assertEquals(6, Task2.maxNumbersInSection(array, sectionLength));
    }

    @Test
    public void searchMaxNumberOnSectionWithSameLengthTest(){
        double[] array = {0.0, 0.2, 0.4, 0.8, 1.0, 1.2};
        double sectionLength = 0.5;
        assertEquals(3, Task2.maxNumbersInSection(array, sectionLength));
    }


}