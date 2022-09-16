package com.hillel.harashchenko.lessons.homework10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = 0;
        int M = 0;

        System.out.println("Please enter number of rows");
        do {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + N);

        System.out.println("Please enter number of columns");
        do {
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                if (M < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + M);

        int[][] arrayN_M = new int[N][M];
        int[][] arrayM_N = new int[M][N];

        for (int i = 0; i < arrayN_M.length; i++) {
            for (int j = 0; j < arrayN_M[i].length; j++) {
                arrayN_M[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("Before");
        for (int i = 0; i < arrayN_M.length; i++) {
            for (int j = 0; j < arrayN_M[i].length; j++) {
                System.out.print(arrayN_M[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arrayM_N.length; i++) {
            for (int j = 0; j < arrayM_N[i].length; j++) {
                arrayM_N[i][j] = arrayN_M[j][i];
            }
        }

        System.out.println("After");
        for (int i = 0; i < arrayM_N.length; i++) {
            for (int j = 0; j < arrayM_N[i].length; j++) {
                System.out.print(arrayM_N[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }

}


