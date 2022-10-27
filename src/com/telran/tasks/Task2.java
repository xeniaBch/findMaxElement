package com.telran.tasks;

import java.util.Arrays;


public class Task2 {
    public static void main(String[] args) {
        double[] array = {0.0, 0.5, 0.6, 0.7, 1.1, 1.4};
        double sectionLength = 1.4;
        System.out.println(maxNumbersInSection(array, sectionLength));
    }

    public static int maxNumbersInSection(double[] array, double length) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] >= array[i] && array[j] <= array[i] + length) {
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }


}
