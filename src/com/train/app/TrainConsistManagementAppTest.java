package com.train.app;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testTotalCapacity() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC Chair", 60));
        bogies.add(new TrainConsistManagementApp.Bogie("First Class", 40));

        int result = TrainConsistManagementApp.calculateTotalCapacity(bogies);

        assertEquals(172, result);
    }
}