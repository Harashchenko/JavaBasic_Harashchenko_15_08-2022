package com.hillel.harashchenko.lessons.homework18;

import com.hillel.harashchenko.lessons.homework18.main.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArrayUtils {
    @Test
    public void test1() {
        double average = ArrayUtils.MeanOFArray(new int[]{5, 6, 7, 8, 9});
        Assertions.assertEquals(7, average);
    }

    @Test
    public void test2() {
        double average = ArrayUtils.MeanOFArray(new int[]{});
        Assertions.assertEquals(-2, average);
    }

    @Test
    public void test3() {
        double average = ArrayUtils.MeanOFArray(null);
        Assertions.assertEquals(-1, average);
    }


    @Test
    public void test4() {
        int matrix = ArrayUtils.getCheckArrayOfEquality(new int[10][10]);
        Assertions.assertEquals(10, matrix);
    }

    @Test
    public void test5() {
        int matrix = ArrayUtils.getCheckArrayOfEquality(new int[][]{});
        Assertions.assertEquals(-2, matrix);
    }

    @Test
    public void test6() {
        int matrix = ArrayUtils.getCheckArrayOfEquality(null);
        Assertions.assertEquals(-1, matrix);
    }

    @Test
    public void test7() {
        int matrix = ArrayUtils.getCheckArrayOfEquality(new int[5][10]);
        Assertions.assertEquals(-3, matrix);
    }

}
