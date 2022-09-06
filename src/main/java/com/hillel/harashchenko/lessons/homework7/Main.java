package com.hillel.harashchenko.lessons.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lotteryNumber = 1;
        int randNumber = (int) (Math.random() * 11);
        int i = 3;
        System.out.println("Please enter integer from 0 to 10");
//      System.out.println("your number " + randNumber);
        do {
            if (scanner.hasNextInt()) {
                lotteryNumber = scanner.nextInt();
                if (lotteryNumber < 0 || lotteryNumber > 10) {
                    System.out.println("Wrong data, please enter integer from 0 to 10");
                } else {
                    if (lotteryNumber == randNumber) {
                        System.out.println("You WON!!!");
                        break;
                    } else
                        if (i < 2) {
                        System.out.println("You lose");
                        break;
                        } else {
                        System.out.println("Try again");
                        i--;
                    }
                }
            } else {
                System.out.println("Wrong data");
                scanner.nextLine();
            }
        }while (i > 0) ;

        scanner.close();

    }
}


