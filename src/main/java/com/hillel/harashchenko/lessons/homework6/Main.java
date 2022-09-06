package com.hillel.harashchenko.lessons.homework6;

public class Main {
    public static void main(String[] args) {

        int counterShuttle = 0;
        for (int i = 1; i <= 155; i++) {
            if ((i ==4) || (i ==9) || (i / 10 == 4) || (i / 10 == 9) || (i / 10 == 14)
                    || (i % 10 == 4) || (i % 10 == 9)) {
                continue;
            }
            System.out.println(i);
            counterShuttle++;
        }

        System.out.println("Counter shuttle: " + counterShuttle);

    }
}
