package org.launchcode.java.exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("What word are you looking for?");
        String searchTerm = input.nextLine();

        if (firstLine.contains(searchTerm.toLowerCase())) {
            System.out.println("Congratulations! You randomly guessed that the first line would contain '" + searchTerm + "'!");
        } else {
            System.out.println("Try again!");
        }
    }
}
