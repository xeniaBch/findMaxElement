package com.telran.tasks;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {-5, 6, 4, 0, -9};
        ArrayList<Integer> newList = getIntegers(array);
        System.out.println(newList);
    }

    public static ArrayList<Integer> getIntegers(int[] array) {
        ArrayList<Integer> listNegative = new ArrayList<>();
        ArrayList<Integer> listPositive = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                listNegative.add(array[i] );
            }
            if (array[i] >= 0) {
                listPositive.add(array[i]);
            }
        }
        listNegative.addAll(listPositive);
        return listNegative;
    }
}
