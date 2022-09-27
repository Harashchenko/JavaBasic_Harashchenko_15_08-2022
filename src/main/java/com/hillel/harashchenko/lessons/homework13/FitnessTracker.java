package com.hillel.harashchenko.lessons.homework13;

public class FitnessTracker {
    private final String NAME;
    private final int DAY_OF_BIRSDAY;
    private final int MONTH_OF_BIRSDAY;
    private final int YEAR_OF_BIRSDAY;
    private final String EMAIL;
    private final String PHONE_NUNBER;
    private String surname;
    private double weight;
    private int topPressure;
    private int lowerPressure;
    private int numberOfSteps;
    private int age;

    public FitnessTracker(String NAME, int DAY_OF_BIRSDAY, int MONTH_OF_BIRSDAY, int YEAR_OF_BIRSDAY,
                          String EMAIL, String PHONE_NUNBER, String surname, double weight, int topPressure,
                          int lowerPressure, int numberOfSteps) {
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
        age = 2020 - YEAR_OF_BIRSDAY;
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

    public String getPHONE_NUNBER() {
        return PHONE_NUNBER;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTopPressure() {
        return topPressure;
    }

    public void setTopPressure(int topPressure) {
        this.topPressure = topPressure;
    }

    public int getLowerPressure() {
        return lowerPressure;
    }

    public void setLowerPressure(int lowerPressure) {
        this.lowerPressure = lowerPressure;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public int getAge() {
        return age;
    }

    void printAccountInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fitness Tracker Person Info" + " NAME = ").append(NAME)
                .append(", surname = ").append(surname + "," + "\n")
                .append(" DAY_OF_BIRSDAY = ").append(DAY_OF_BIRSDAY)
                .append(", MONTH_OF_BIRSDAY = ").append(DAY_OF_BIRSDAY)
                .append(", YEAR_OF_BIRSDAY = ").append(YEAR_OF_BIRSDAY)
                .append(", age = ").append(age + "," + "\n")
                .append(" EMAIl = ").append(EMAIL)
                .append(", PHONE_NUNBER = ").append(PHONE_NUNBER + "," + "\n")
                .append(" weight = ").append(weight)
                .append(", pressure = ").append(topPressure + "/" + lowerPressure)
                .append(", numberOfSteps = ").append(numberOfSteps + "\n");
        System.out.println(stringBuilder);
    }
}




