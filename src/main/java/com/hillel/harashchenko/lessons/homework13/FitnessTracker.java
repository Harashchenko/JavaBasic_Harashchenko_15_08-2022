package com.hillel.harashchenko.lessons.homework13;

public class FitnessTracker {
    private final String NAME;
    private final int DAY_OF_BIRSDAY;
    private final int MONTH_OF_BIRSDAY;
    private final int YEAR_OF_BIRSDAY;
    private final String EMAIL;
    private final int PHONE_NUNBER;
    private String surname;
    private double weight;
    private int topPressure;
    private int lowerPressure;
    private int numberOfSteps;
    private int age;

    public FitnessTracker(String NAME, int DAY_OF_BIRSDAY, int MONTH_OF_BIRSDAY, int YEAR_OF_BIRSDAY, String EMAIL,
                          int PHONE_NUNBER, String surname, double weight, int topPressure, int lowerPressure,
                          int numberOfSteps) {
        this.NAME = NAME;
        this.DAY_OF_BIRSDAY = DAY_OF_BIRSDAY;
        this.MONTH_OF_BIRSDAY = MONTH_OF_BIRSDAY;
        this.YEAR_OF_BIRSDAY = YEAR_OF_BIRSDAY;
        this.EMAIL = EMAIL;
        this.PHONE_NUNBER = PHONE_NUNBER;
        this.surname = surname;
        this.weight = weight;
        this.topPressure = topPressure;
        this.lowerPressure = lowerPressure;
        this.numberOfSteps = numberOfSteps;
        this.age = 2020 - YEAR_OF_BIRSDAY;
    }

    public String getNAME() {
        return NAME;
    }

    public int getDAY_OF_BIRSDAY() {
        return DAY_OF_BIRSDAY;
    }

    public int getMONTH_OF_BIRSDAY() {
        return MONTH_OF_BIRSDAY;
    }

    public int getYEAR_OF_BIRSDAY() {
        return YEAR_OF_BIRSDAY;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public int getPHONE_NUNBER() {
        return PHONE_NUNBER;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public int getTopPressure() {
        return topPressure;
    }

    public int getLowerPressure() {
        return lowerPressure;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTopPressure(int topPressure) {
        this.topPressure = topPressure;
    }

    public void setLowerPressure(int lowerPressure) {
        this.lowerPressure = lowerPressure;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fitness Tracker Person Info" +
                " NAME = " + NAME +
                ", surname = " + surname + "," + "\n" +
                " DAY_OF_BIRSDAY = " + DAY_OF_BIRSDAY +
                ", MONTH_OF_BIRSDAY = " + MONTH_OF_BIRSDAY +
                ", YEAR_OF_BIRSDAY = " + YEAR_OF_BIRSDAY +
                ", age = " + age + "," + "\n" +
                " EMAIL = " + EMAIL +
                ", PHONE_NUNBER = " + PHONE_NUNBER + "," + "\n" +
                " weight = " + weight +
                ", pressure = " + topPressure + "/" + lowerPressure +
                ", numberOfSteps = " + numberOfSteps + "\n";
    }
}




