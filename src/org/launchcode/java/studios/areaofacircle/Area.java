package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int validRadius = 0;

        do {
            System.out.println("Radius of your circle: ");
            double radius = input.nextDouble();

            if (radius < 0) {
                System.out.println("Please enter a radius that is not negative.");
            } else {
                System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
                validRadius = 1;
            }
        } while (validRadius == 0);
    }
}
