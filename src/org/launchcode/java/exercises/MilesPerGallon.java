package org.launchcode.java.exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();

        System.out.println("How much gas have you used?");
        double gas = input.nextDouble();

        System.out.println("Your car gets " + miles / gas + " per gallon.");
    }
}
