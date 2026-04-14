package com.train.app;

import java.util.*;

public class TrainConsistManagementApp {

    private Map<String, Integer> bogieCapacityMap; // UC6

    public TrainConsistManagementApp() {
        bogieCapacityMap = new HashMap<>();
    }

    // UC6 Logic
    public void addBogieCapacity() {

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);
    }

    public void displayBogieCapacity() {

        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC6 - Bogie Capacity Mapping");
        System.out.println("=================================\n");

        TrainConsistManagementApp app = new TrainConsistManagementApp();

        app.addBogieCapacity();
        app.displayBogieCapacity();
    }
}