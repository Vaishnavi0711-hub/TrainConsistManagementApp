package com.train.app;

import java.util.regex.*;

public class TrainConsistManagementApp {

    // METHOD FOR TRAIN ID VALIDATION
    public static boolean validateTrainId(String trainId) {
        String regex = "TRN-\\d{4}";
        return Pattern.matches(regex, trainId);
    }

    // METHOD FOR CARGO CODE VALIDATION
    public static boolean validateCargoCode(String cargoCode) {
        String regex = "PET-[A-Z]{2}";
        return Pattern.matches(regex, cargoCode);
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC11 - Regex Validation");
        System.out.println("====================================\n");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID Valid: " + validateTrainId(trainId));
        System.out.println("Cargo Code Valid: " + validateCargoCode(cargoCode));
    }
}