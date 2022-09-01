package com.hillel.harashchenko.lessons.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter Team1 name");
        String teamName1 = scanner.nextLine();
        System.out.println("You entered: " + teamName1);

        int player1Team1 = 0;
        System.out.println("Please enter frags for player 1 Team1");
        if (scanner.hasNextInt()) {
            player1Team1 = scanner.nextInt();
            System.out.println("You entered number: " + player1Team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int player2Team1 = 0;
        System.out.println("Please enter frags for player 2 Team1");
        if (scanner.hasNextInt()) {
            player2Team1 = scanner.nextInt();
            System.out.println("You entered number: " + player2Team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int player3Team1 = 0;
        System.out.println("Please enter frags for player 3 Team1");
        if (scanner.hasNextInt()) {
            player3Team1 = scanner.nextInt();
            System.out.println("You entered number: " + player3Team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int player4Team1 = 0;
        System.out.println("Please enter frags for player 4 Team1");
        if (scanner.hasNextInt()) {
            player4Team1 = scanner.nextInt();
            System.out.println("You entered number: " + player4Team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int player5Team1 = 0;
        System.out.println("Please enter frags for player 5 Team1");
        if (scanner.hasNextInt()) {
            player5Team1 = scanner.nextInt();
            System.out.println("You entered number: " + player5Team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);}
            scanner.nextLine();

        System.out.println("Please enter Team2 name");
        String teamName2 = scanner.nextLine();
        System.out.println("You entered: " + teamName2);

        int player1Team2 = 0;
        System.out.println("Please enter frags for player 1 Team2");
        if (scanner.hasNextInt()) {
            player1Team2 = scanner.nextInt();
            System.out.println("You entered number: " + player1Team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int player2Team2 = 0;
        System.out.println("Please enter frags for player 2 Team2");
        if (scanner.hasNextInt()) {
            player2Team2 = scanner.nextInt();
            System.out.println("You entered number: " + player2Team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int player3Team2 = 0;
        System.out.println("Please enter frags for player 3 Team2");
        if (scanner.hasNextInt()) {
            player3Team2 = scanner.nextInt();
            System.out.println("You entered number: " + player3Team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int player4Team2 = 0;
        System.out.println("Please enter frags for player 4 Team1");
        if (scanner.hasNextInt()) {
                    player4Team2 = scanner.nextInt();
                    System.out.println("You entered number: " + player4Team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int player5Team2 = 0;
        System.out.println("Please enter frags for player 5 Team2");
        if (scanner.hasNextInt()) {
            player5Team2 = scanner.nextInt();
            System.out.println("You entered number: " + player5Team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int a = 5;
        int resultTeam1 = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1);
        int resultTeam2 = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2);

        if (resultTeam1 > resultTeam2) {
            System.out.println("Team won " + teamName1  + " scored " + (double) resultTeam1 / a + " points");
        } else if (resultTeam1 < resultTeam2) {
            System.out.println("Team won " + teamName2  + " scored " + (double) resultTeam2 / a + " points");
        }  else {
            System.out.println("Team won " + teamName1  + teamName2 + " scored " + (double) resultTeam1 / a + " points");
        }
        scanner.close();
     }
    }






