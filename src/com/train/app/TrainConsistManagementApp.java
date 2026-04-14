package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC1 - Initialize Train Consist");
        System.out.println("====================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Initial Bogie Count: " + trainConsist.size());

        System.out.println("Train Consist Initialized Successfully.");
    }
}