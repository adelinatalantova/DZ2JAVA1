package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int age = 44;
        int temp = 20;

        if (age > 10 && age < 45 && temp < 30 && temp > -20) {
            System.out.println("Можно идти гулять!");
        } else if (age < 10 && temp > 0 && temp < 8) {
            System.out.println(" можно гулять, но не долго");
        } else if (age > 65 && temp > -10 && temp < 25) {
            System.out.println("лучше остаться дома");
        } else {
            System.out.println("hdyery");
        }
        String name = "Ademi";
        switch (name) {
            case "Adely":
                System.out.println("Adely");
                break;
            case "Mura":
                System.out.println("Mura");
                break;
            case "Bekjan":
                System.out.println("Bekjan");
                break;
            case "Ademi":
                System.out.println("Ademi");
                break;
            default:
                System.out.println(" No name ");

        }

        System.out.println(infoPerson());

    }
    public static String infoPerson(){
        String name = "Adely ";
        int age = 15;
        return name + age;
    }

}
