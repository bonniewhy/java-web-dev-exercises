package org.launchcode.java.exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length of the rectangle: ");
        double length = input.nextDouble();

        System.out.println("Width of the rectangle: ");
        double width = input.nextDouble();

        System.out.println("The area of your rectangle is " + length * width + ".");
    }
}
