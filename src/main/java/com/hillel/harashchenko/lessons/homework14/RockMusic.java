package com.hillel.harashchenko.lessons.homework14;

public class RockMusic extends MusicStyles {
    private String nameBand;
    private String nameMusic;

    public RockMusic(String nameBand, String nameMusic) {
        this.nameBand = nameBand;
        this.nameMusic = nameMusic;
    }

    public String getNameBand() {
        return nameBand;
    }

    public void setNameBand(String nameBand) {
        this.nameBand = nameBand;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    @Override
    void playMusic() {
        System.out.println("The band " + nameBand + " play music " + nameMusic);
    }
}
