package com.train.app;

public class TrainConsistManagementApp {

    // UC18 METHOD (LINEAR SEARCH)
    public static boolean linearSearch(String[] bogies, String key) {

        for (String id : bogies) {
            if (id.equals(key)) {
                return true; // found
            }
        }
        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("====================================\n");

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        boolean found = linearSearch(bogieIds, searchKey);

        System.out.println("Searching for: " + searchKey);
        System.out.println("Found? " + found);
    }
}