package com.train.app;

import java.util.*;

public class TrainConsistManagementApp {

    public static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    // UC12 METHOD
    public static boolean isTrainSafe(List<GoodsBogie> bogies) {

        return bogies.stream().allMatch(b ->
                !b.type.equalsIgnoreCase("Cylindrical") ||
                        b.cargo.equalsIgnoreCase("Petroleum")
        );
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("====================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));

        boolean safe = isTrainSafe(bogies);

        System.out.println("Train Safety Status: " + safe);
    }
}