package com.train.app;

import java.util.*;

public class TrainConsistManagementApp {

    private List<String> passengerBogies;
    private Set<String> bogieIds;
    private LinkedList<String> trainConsist; // UC4

    public TrainConsistManagementApp() {
        passengerBogies = new ArrayList<>();
        bogieIds = new HashSet<>();
        trainConsist = new LinkedList<>(); // UC4
    }

    // UC4 Methods
    public void buildTrainConsist() {

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry at position 2
        trainConsist.add(2, "Pantry Car");

        // Remove first and last
        trainConsist.removeFirst();
        trainConsist.removeLast();
    }

    public void displayTrainConsist() {
        System.out.println("Final Train Consist: " + trainConsist);
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC4 - Train Consist using LinkedList");
        System.out.println("=================================\n");

        TrainConsistManagementApp app = new TrainConsistManagementApp();

        app.buildTrainConsist();
        app.displayTrainConsist();
    }
}