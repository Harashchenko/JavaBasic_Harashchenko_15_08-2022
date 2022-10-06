package com.hillel.harashchenko.lessons.homework16;

public enum DrinksMachine {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    WATER("Mineral water"),
    COLA("Coca-Cola"),
    ;

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
