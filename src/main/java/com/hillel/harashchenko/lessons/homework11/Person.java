package com.hillel.harashchenko.lessons.homework11;


public class Person {
    public static void main(String[] args) {
        String name = "Joseph";
        String surname = " Biden";
        String cityName = "Washington";
        int phoneNumber = 322223322;

        System.out.println(personInfo(name, surname, cityName, phoneNumber));
        System.out.println(personInfo("Emmanuel", " Macron", "Paris", 66778899));
        System.out.println(personInfo("Volodymyr", " Zelenskyi", "Kyiv", 1122334455));
    }

    static String personInfo(String name, String surname, String cityName, int phoneNumber) {
        return ("Call a person " + name + surname + " from the city " + cityName + " by number " + phoneNumber);
    }
}