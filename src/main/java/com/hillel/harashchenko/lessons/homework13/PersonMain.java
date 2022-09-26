package com.hillel.harashchenko.lessons.homework13;

public class PersonMain extends FitnessTracker {
    public PersonMain(String NAME, int DAY_OF_BIRSDAY, int MONTH_OF_BIRSDAY, int YEAR_OF_BIRSDAY, String EMAIL,
                      int PHONE_NUNBER, String surname, int weight, int topPressure, int lowerPressure,
                      int numberOfSteps) {
        super(NAME, DAY_OF_BIRSDAY, MONTH_OF_BIRSDAY, YEAR_OF_BIRSDAY, EMAIL, PHONE_NUNBER, surname, weight,
                topPressure, lowerPressure, numberOfSteps);
    }

    public static void main(String[] args) {
        FitnessTracker person1 = new FitnessTracker("Olha", 28, 06,
                1995, "olia@ukr.net", 06711111111, "Kovalenko",
                55, 120, 80, 3000);
        person1.printAccountInfo();

        FitnessTracker person2 = new FitnessTracker("Mukola", 15, 01,
                2000, "mukola@gmail.com", 06311111111, "Prokopenko",
                70, 130, 70, 4000);
        person2.printAccountInfo();

        FitnessTracker person3 = new FitnessTracker("Evhen", 01, 12,
                1997, "evhen@ukr.net", 0501111111, "Kirienko",
                80, 140, 60, 5000);
        person3.printAccountInfo();
        person3.setLowerPressure(80);
        person3.setNumberOfSteps(7500);
        person3.setTopPressure(120);
        person3.setWeight(75);
        person3.printAccountInfo();

        FitnessTracker person4 = new FitnessTracker("Ihor", 06, 03,
                1996, "ihor@gmail.net", 04311111111, "Ivanenko",
                100, 130, 80, 2000);
        person4.printAccountInfo();
        person4.setLowerPressure(60);
        person4.setNumberOfSteps(1000);
        person4.setTopPressure(140);
        person4.setWeight(105);
        person4.printAccountInfo();
    }
}

