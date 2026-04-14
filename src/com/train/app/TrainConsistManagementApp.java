package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    private List<String> passengerBogies;

    // Constructor (UC1 + UC2)
    public TrainConsistManagementApp() {
        passengerBogies = new ArrayList<>();
    }

    // UC2: Add bogie
    public void addBogie(String bogie) {
        passengerBogies.add(bogie);
    }

    // UC2: Remove bogie
    public void removeBogie(String bogie) {
        passengerBogies.remove(bogie);
    }

    // UC2: Check existence
    public boolean containsBogie(String bogie) {
        return passengerBogies.contains(bogie);
    }

    // Display bogies
    public void displayBogies() {
        System.out.println("Current Bogies: " + passengerBogies);
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC2 - Passenger Bogie Management");
        System.out.println("=================================\n");

        TrainConsistManagementApp app = new TrainConsistManagementApp();

        // Add bogies
        app.addBogie("Sleeper");
        app.addBogie("AC Chair");
        app.addBogie("First Class");

        System.out.println("After Adding Bogies:");
        app.displayBogies();

        // Remove one bogie
        app.removeBogie("AC Chair");
        System.out.println("\nAfter Removing AC Chair:");
        app.displayBogies();

        // Check existence
        System.out.println("\nIs Sleeper present? " + app.containsBogie("Sleeper"));
    }
}