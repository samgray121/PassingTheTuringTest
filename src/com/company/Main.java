package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        String yourName;
        String favoriteColor;
        String myName;
        String favoriteFood;
        String favoriteNumber;
        int number = 7;


        System.out.println("What is your name?");
        yourName = inputReader.nextLine();

        System.out.println("Hello " + yourName + " my name is Sam.");

        System.out.println("What is your favorite color?");
        favoriteColor = inputReader.nextLine();

        System.out.println("Nice, mine too!");

        System.out.println("What is your favorite food?");
        favoriteFood = inputReader.nextLine();

        System.out.println("What about your favorite number?");
        favoriteNumber = inputReader.nextLine();


        System.out.println("Nice! I like all of the numbers.");

        System.out.println("Well, that was fun. It was nice to meet you " + yourName + ". Have a great day!");








    }
}
