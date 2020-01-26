package org.launchcode.java.exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        // Number Array
//        int nums[] = {1, 1, 2, 3, 5, 8};
//
//        for (int i : nums) {
//            System.out.println(i);
//        }

        // Word Array
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordArray = sentence.split("\\.");

        System.out.println(Arrays.toString(wordArray));
    }
}
