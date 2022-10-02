package com.hillel.harashchenko.lessons.homework15;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Calling from Android");
    }

    @Override
    public void sms() {
        System.out.println("SMS from Android");
    }

    @Override
    public void internet() {
        System.out.println("Internet from Android");
    }

    @Override
    public void getLinuxOS() {
        System.out.println("This is LinuxOS");
    }
}
