package com.hillel.harashchenko.lessons.homework12;

public class BurgerMain extends Burger {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("bun", "meat", "greens", "mayo");
        Burger dietBurger = new Burger("bun", "meat", "greens");
        Burger doubleBurger = new Burger("bun", "meat", "greens", "mayo",true);


    }

}
