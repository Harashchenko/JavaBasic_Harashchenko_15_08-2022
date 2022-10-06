package com.hillel.harashchenko.lessons.homework16;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static int totalCost = 0;

    public static void main(String[] args) {
        runApp();
        System.out.println("You select: " + CounterDrinks.counterDrinks + " drinks, total cost: " + totalCost);
        scanner.close();
    }

    private static void runApp() {
        do {
            DrinksMachine drinksMachine = null;
            DrinksMachine[] drinksMachines = DrinksMachine.values();
            while (true) {
                System.out.println("Please, select any drink from the list " + (Arrays.toString(DrinksMachine.values())) + " or type \"NO\" for exit ");
                String drinksChoice = scanner.nextLine().toUpperCase(Locale.ROOT);
                for (DrinksMachine machine : drinksMachines) {
                    if (drinksChoice.equals(machine.toString())) {
                        drinksMachine = machine;
                        break;
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else if (drinksChoice.equalsIgnoreCase("NO")) {
                    return;
                } else {
                    System.out.println("Wrong data, try again!");
                }
            }

            switch (drinksMachine) {
                case COFFEE:
                    System.out.println(drinksMachine.getTitle() + " cost " + Drinks.COST_COFFEE);
                    prepareDrinks(drinksMachine);
                    totalCost += Drinks.COST_COFFEE;
                    break;
                case TEA:
                    System.out.println(drinksMachine.getTitle() + " cost " + Drinks.COST_TEA);
                    prepareDrinks(drinksMachine);
                    totalCost += Drinks.COST_TEA;
                    break;
                case LEMONADE:
                    System.out.println(drinksMachine.getTitle() + " cost " + Drinks.COST_LEMONADE);
                    prepareDrinks(drinksMachine);
                    totalCost += Drinks.COST_LEMONADE;
                    break;
                case MOJITO:
                    System.out.println(drinksMachine.getTitle() + " cost " + Drinks.COST_MOJITO);
                    prepareDrinks(drinksMachine);
                    totalCost += Drinks.COST_MOJITO;
                    break;
                case WATER:
                    System.out.println(drinksMachine.getTitle() + " cost " + Drinks.COST_WATER);
                    prepareDrinks(drinksMachine);
                    totalCost += Drinks.COST_WATER;
                    break;
                case COLA:
                    System.out.println(drinksMachine.getTitle() + " cost " + Drinks.COST_COLA);
                    prepareDrinks(drinksMachine);
                    totalCost += Drinks.COST_COLA;
                    break;
            }
        } while (true);
    }

    private static void prepareDrinks(DrinksMachine drinksMachine) {
        System.out.println("You are select: " + drinksMachine.getTitle() + " please wait, drinks is prepearing...");
        new CounterDrinks();
    }
}


