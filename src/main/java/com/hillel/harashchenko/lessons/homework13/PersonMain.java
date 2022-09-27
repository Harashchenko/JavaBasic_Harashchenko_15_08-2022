package com.hillel.harashchenko.lessons.homework13;

public class PersonMain {

    public static void main(String[] args) {
        FitnessTracker person1 = new FitnessTracker("Olha", 28, 06,
                1995, "olia@ukr.net", "06711111111", "Kovalenko",
                55, 120, 80, 3000);

        FitnessTracker person2 = new FitnessTracker("Mukola", 15, 01,
                2000, "mukola@gmail.com", "06311111111", "Prokopenko",
                70, 130, 70, 4000);

        FitnessTracker person3 = new FitnessTracker("Evhen", 01, 12,
                1997, "evhen@ukr.net", "0501111111", "Kirienko",
                80, 140, 60, 5000);

        FitnessTracker person4 = new FitnessTracker("Ihor", 06, 03,
                1996, "ihor@gmail.net", "04311111111", "Ivanenko",
                100, 130, 80, 2000);

        person1.printAccountInfo();

        person2.printAccountInfo();

        person3.printAccountInfo();
        person3.setLowerPressure(80);
        person3.setNumberOfSteps(7500);
        person3.setTopPressure(120);
        person3.setWeight(75);
        person3.printAccountInfo();

        person4.printAccountInfo();
        person4.setLowerPressure(60);
        person4.setNumberOfSteps(1000);
        person4.setTopPressure(140);
        person4.setWeight(105);
        person4.printAccountInfo();
    }
}


