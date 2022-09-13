package com.hillel.harashchenko.lessons.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numberLottery = new int[7];
        for (int i = 0; i < numberLottery.length; i++) {
            numberLottery[i] = (int) (Math.random() * 10);
        }

        int temp;
        for (int i = 0; i < numberLottery.length - 1; i++) {
            for (int j = 0; j < numberLottery.length - 1 - i; j++) {
                if (numberLottery[j] > numberLottery[j + 1]) {
                    temp = numberLottery[j];
                    numberLottery[j] = numberLottery[j + 1];
                    numberLottery[j + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(numberLottery));

        int[] numberPlayer = new int[7];
        for (int i = 0; i < numberPlayer.length; i++) {
            numberPlayer[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(numberPlayer);

        System.out.println(Arrays.toString(numberPlayer));

        int sumSameNumber = 0;
        for (int i = 0; i < numberPlayer.length; i++) {
            if (numberLottery[i] == numberPlayer[i]) {
                sumSameNumber++;
            }
        }
        System.out.println("Number of coincidences: " + sumSameNumber);
    }
}
