package com.train.app;

import java.util.Arrays;

public class TrainConsistManagementApp {

    // UC19 METHOD (BINARY SEARCH)
    public static boolean binarySearch(String[] bogies, String key) {

        // ensure sorted
        Arrays.sort(bogies);

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = bogies[mid].compareTo(key);

            if (compare == 0) {
                return true; // found
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================\n");

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        boolean found = binarySearch(bogieIds, searchKey);

        System.out.println("Searching for: " + searchKey);
        System.out.println("Found? " + found);
    }
}