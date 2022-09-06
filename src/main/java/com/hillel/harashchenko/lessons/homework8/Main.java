package com.hillel.harashchenko.lessons.homework8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int totalPlayersInTeam = 25;
        int minAgePlayersInTeam = 18;
        int maxAgePlayersInTeam = 40;

        int[] agePlayersInTeam1 = new int[25];

        for (int i = 0; i < agePlayersInTeam1.length; i++) {
            agePlayersInTeam1[i] = (int) ((Math.random() * (maxAgePlayersInTeam - minAgePlayersInTeam + 1) + minAgePlayersInTeam));
        }
        System.out.println(Arrays.toString(agePlayersInTeam1));

        double sumAgePlayersTeam1 = 0;
        for (int i = 0; i < agePlayersInTeam1.length; i++) {
            sumAgePlayersTeam1 += agePlayersInTeam1[i];
        }
        System.out.println("Average age of players Team1: " + sumAgePlayersTeam1 / totalPlayersInTeam);


        int[] agePlayersInTeam2 = new int[25];

        for (int i = 0; i < agePlayersInTeam2.length; i++) {
            agePlayersInTeam2[i] = (int) (Math.random() * (maxAgePlayersInTeam - minAgePlayersInTeam + 1) + minAgePlayersInTeam);
        }
        System.out.println(Arrays.toString(agePlayersInTeam2));

        double sumAgePlayersTeam2 = 0;
        for (int i = 0; i < agePlayersInTeam2.length; i++) {
            sumAgePlayersTeam2 += agePlayersInTeam2[i];
        }
        System.out.println("Average age of players Team2: " + sumAgePlayersTeam2 / totalPlayersInTeam);

    }
}
