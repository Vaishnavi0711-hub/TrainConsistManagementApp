package com.train.app;

import java.util.*;

public class TrainConsistManagementApp {

    private List<String> passengerBogies;
    private Set<String> bogieIds; // UC3

    public TrainConsistManagementApp() {
        passengerBogies = new ArrayList<>();
        bogieIds = new HashSet<>(); // UC3
    }

    // UC2 Methods
    public void addBogie(String bogie) {
        passengerBogies.add(bogie);
    }

    public void removeBogie(String bogie) {
        passengerBogies.remove(bogie);
    }

    public boolean containsBogie(String bogie) {
        return passengerBogies.contains(bogie);
    }

    public void displayBogies() {
        System.out.println("Passenger Bogies: " + passengerBogies);
    }

    // UC3 Methods
    public void addBogieId(String id) {
        bogieIds.add(id); // duplicates automatically ignored
    }

    public void displayBogieIds() {
        System.out.println("Unique Bogie IDs: " + bogieIds);
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=================================\n");

        TrainConsistManagementApp app = new TrainConsistManagementApp();

        // Adding IDs (with duplicates)
        app.addBogieId("BG101");
        app.addBogieId("BG102");
        app.addBogieId("BG103");
        app.addBogieId("BG104");

        // Duplicate entries
        app.addBogieId("BG101");
        app.addBogieId("BG102");

        // Display unique IDs
        app.displayBogieIds();
    }
}