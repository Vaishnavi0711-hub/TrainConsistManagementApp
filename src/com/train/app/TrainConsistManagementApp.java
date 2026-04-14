package com.train.app;

import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    public static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // LOOP METHOD
    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // STREAM METHOD
    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC13 - Performance Comparison");
        System.out.println("====================================\n");

        List<Bogie> bogies = new ArrayList<>();

        // sample data
        for (int i = 0; i < 1000; i++) {
            bogies.add(new Bogie("Type" + i, i % 100));
        }

        // LOOP timing
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = filterUsingLoop(bogies);
        long endLoop = System.nanoTime();

        // STREAM timing
        long startStream = System.nanoTime();
        List<Bogie> streamResult = filterUsingStream(bogies);
        long endStream = System.nanoTime();

        long loopTime = endLoop - startLoop;
        long streamTime = endStream - startStream;

        System.out.println("Loop Time: " + loopTime + " ns");
        System.out.println("Stream Time: " + streamTime + " ns");
        System.out.println("Results Equal Size: " + (loopResult.size() == streamResult.size()));
    }
}