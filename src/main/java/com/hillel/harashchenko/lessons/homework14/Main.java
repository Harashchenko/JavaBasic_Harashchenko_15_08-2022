package com.hillel.harashchenko.lessons.homework14;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyleses = {
                new PopMusic("Roxette", "The look"),
                new RockMusic("Ocean Colour Scene", "The Circle"),
                new ClassicMusic("Rihard Vahner", "Traume")
        };
        for (MusicStyles musicStyles : musicStyleses) {
            musicStyles.playMusic();

        }
    }

}

