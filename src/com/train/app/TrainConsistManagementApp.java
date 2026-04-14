package com.train.app;

import java.util.Arrays;

public class TrainConsistManagementApp {

    // UC17 METHOD
    public static String[] sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);
        return bogies;
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC17 - Sort Bogie Names");
        System.out.println("====================================\n");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        sortBogieNames(bogieNames);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}