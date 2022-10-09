package com.hillel.harashchenko.lessons.homework18.main;

public class ArrayUtils {

    public static double MeanOFArray(int[] array) {
        double mean = 0;
        double sum = 0;
        if (array == null) {
            return -1;
        }
        if (array.length == 0) {
            return -2;
        }
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            mean = sum / array.length;
        }

        return mean;
    }

    public static int getCheckArrayOfEquality(int[][] array) {
        if (array == null) {
            return -1;
        }

        if (array.length == 0) {
            return -2;
        }

        if (array != null) {
            if (array.length == array[0].length) {
                return array.length;
            }
        }
        return -3;
    }
}

