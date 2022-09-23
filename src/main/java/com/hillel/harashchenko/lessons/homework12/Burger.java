package com.hillel.harashchenko.lessons.homework12;

public class Burger {
    String bun = "bun ";
    String meat;
    String greens;
    String mayo;
    boolean isDoubleMeat;

    public Burger() {
    }

    public Burger(String bun, String meat, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Regular burger includes: " + bun + ", " + meat + ", " + greens + ", " + mayo + ".");
    }

    public Burger(String bun, String meat, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.greens = greens;
        System.out.println("Diet burger includes: " + bun + ", " + meat + ", " + greens + ".");
    }

    public Burger(String bun, String meat, String greens, String mayo, boolean isDoubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.greens = greens;
        this.mayo = mayo;
        this.isDoubleMeat = isDoubleMeat;
        System.out.println("Double meat burger includes: " + bun + ", " + meat +
                " count = " + (isDoubleMeat ? 2 : 1) + ", " + greens + ", " + mayo + ".");
    }
}
