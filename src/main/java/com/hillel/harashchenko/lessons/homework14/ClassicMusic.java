package com.hillel.harashchenko.lessons.homework14;

public class ClassicMusic extends MusicStyles {
    private String nameMusicant;
    private String nameMusic;

    public ClassicMusic(String nameBand, String nameMusic) {
        this.nameMusicant = nameBand;
        this.nameMusic = nameMusic;
    }

    public String getNameBand() {
        return nameMusicant;
    }

    public void setNameBand(String nameBand) {
        this.nameMusicant = nameBand;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    @Override
    void playMusic() {
        System.out.println(nameMusic + " perfoms is " + nameMusicant);

    }
}
