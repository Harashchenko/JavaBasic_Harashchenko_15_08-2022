package com.hillel.harashchenko.lessons.homework15;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Calling from  iPhones");
    }

    @Override
    public void sms() {
        System.out.println("SMS from  iPhones");

    }

    @Override
    public void internet() {
        System.out.println("Internet from  iPhones");
    }

    @Override
    public void getIOS() {
        System.out.println("This is IOS");
    }
}
