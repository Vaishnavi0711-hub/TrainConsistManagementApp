package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    private List<String> trainConsist;

    // Constructor (UC1)
    public TrainConsistManagementApp() {
        trainConsist = new ArrayList<>();
    }

    // Method to get size
    public int getBogieCount() {
        return trainConsist.size();
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC1 - Initialize Train Consist");
        System.out.println("=================================\n");

        TrainConsistManagementApp app = new TrainConsistManagementApp();

        System.out.println("Initial Bogie Count: " + app.getBogieCount());
        System.out.println("Train Consist Initialized Successfully");
    }
}