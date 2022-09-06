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
        do {
            if (scanner.hasNextInt()) {
                player1Team1 = scanner.nextInt();
                if (player1Team1 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
            System.out.println("You entered number: " + player1Team1);

        int player2Team1 = 0;
            System.out.println("Please enter frags for player 2 Team1");
        do {
            if (scanner.hasNextInt()) {
                player2Team1 = scanner.nextInt();
                if (player2Team1 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + player2Team1);

        int player3Team1 = 0;
        System.out.println("Please enter frags for player 3 Team1");
        do {
            if (scanner.hasNextInt()) {
                player3Team1 = scanner.nextInt();
                if (player3Team1 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + player3Team1);

        int player4Team1 = 0;
        System.out.println("Please enter frags for player 4 Team1");
        do {
            if (scanner.hasNextInt()) {
                player4Team1 = scanner.nextInt();
                if (player4Team1 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + player4Team1);

        int player5Team1 = 0;
        System.out.println("Please enter frags for player 5 Team1");
        do {
            if (scanner.hasNextInt()) {
                player5Team1 = scanner.nextInt();
                if (player5Team1 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + player5Team1);
            scanner.nextLine();

            System.out.println("Please enter Team2 name");
            String teamName2 = scanner.nextLine();
            System.out.println("You entered: " + teamName2);

        int player1Team2 = 0;
        System.out.println("Please enter frags for player 1 Team2");
        do {
            if (scanner.hasNextInt()) {
                player1Team2 = scanner.nextInt();
                if (player1Team2 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + player1Team2);

        int player2Team2 = 0;
        System.out.println("Please enter frags for player 2 Team2");
        do {
            if (scanner.hasNextInt()) {
                player2Team2 = scanner.nextInt();
                if (player2Team2 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + player2Team2);

        int player3Team2 = 0;
        System.out.println("Please enter frags for player 3 Team2");
        do {
            if (scanner.hasNextInt()) {
                player3Team2 = scanner.nextInt();
                if (player3Team2 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + player3Team2);

        int player4Team2 = 0;
        System.out.println("Please enter frags for player 4 Team1");
        do {
            if (scanner.hasNextInt()) {
                player4Team2 = scanner.nextInt();
                if (player4Team2 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + player4Team2);

        int player5Team2 = 0;
        System.out.println("Please enter frags for player 5 Team2");
        do {
            if (scanner.hasNextInt()) {
                player5Team2 = scanner.nextInt();
                if (player5Team2 < 0) {
                    System.out.println("Wrong data, please enter integer greater 0");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        } while (true);
        System.out.println("You entered number: " + player5Team2);

            int totalPlayersInTeam = 5;
            double resultTeam1 = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1);
            double resultTeam2 = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2);

            if (resultTeam1 > resultTeam2) {
                System.out.println("Team won " + teamName1 + " scored " + resultTeam1 / totalPlayersInTeam + " points");
            } else if (resultTeam1 < resultTeam2) {
                System.out.println("Team won " + teamName2 + " scored " + resultTeam2 / totalPlayersInTeam + " points");
            } else {
                System.out.println("Team won " + teamName1 + teamName2 + " scored " + resultTeam1 / totalPlayersInTeam + " points");
            }
            scanner.close();
        }
    }







