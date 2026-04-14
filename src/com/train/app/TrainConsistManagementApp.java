package com.train.app;

import java.util.*;

public class TrainConsistManagementApp {

    private LinkedHashSet<String> trainFormation; // UC5

    public TrainConsistManagementApp() {
        trainFormation = new LinkedHashSet<>();
    }

    // UC5 Logic
    public void buildFormation() {

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate
        trainFormation.add("Sleeper"); // ignored automatically
    }

    public void displayFormation() {
        System.out.println("Train Formation: " + trainFormation);
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC5 - LinkedHashSet Formation");
        System.out.println("=================================\n");

        TrainConsistManagementApp app = new TrainConsistManagementApp();

        app.buildFormation();
        app.displayFormation();
    }
}