package com.hillel.harashchenko.lessons.homework15;

public class Main {
    public static void main(String[] args) {
     IPhones iPhone = new IPhones();
     Androids android = new Androids();

     iPhone.call();
     iPhone.sms();
     iPhone.internet();
     iPhone.getIOS();
     System.out.println();

     android.call();
     android.sms();
     android.internet();
     android.getLinuxOS();
    }
}
