package com.train.app;

import java.util.*;

public class TrainConsistManagementApp {

    // CUSTOM EXCEPTION
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // PASSENGER BOGIE CLASS
    public static class PassengerBogie {
        String name;
        int capacity;

        public PassengerBogie(String name, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than 0");
            }

            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("====================================\n");

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Bogie created: " + b1.name);

            PassengerBogie b2 = new PassengerBogie("AC Chair", -10); // invalid
            System.out.println("Bogie created: " + b2.name);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}