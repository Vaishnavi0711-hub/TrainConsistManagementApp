package com.train.app;

import org.junit.jupiter.api.Test;
<<<<<<< HEAD
import java.util.*;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> 477d629968e96a2eec03c4425abc224a5b9462ed

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
<<<<<<< HEAD
    void testTotalCapacity() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC Chair", 60));
        bogies.add(new TrainConsistManagementApp.Bogie("First Class", 40));

        int result = TrainConsistManagementApp.calculateTotalCapacity(bogies);

        assertEquals(172, result);
=======
    void testFilter_CapacityGreaterThanThreshold() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 60));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(list, 70);

        assertEquals(1, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("First Class", 40));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(list, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 80));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 75));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(list, 70);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_EmptyList() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(list, 50);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));

        TrainConsistManagementApp.filterBogies(list, 50);

        assertEquals(1, list.size()); // original list unchanged
>>>>>>> 477d629968e96a2eec03c4425abc224a5b9462ed
            @Test
            void testRegex_ValidTrainID() {
                assertTrue(TrainConsistManagementApp.validateTrainId("TRN-1234"));
            }

            @Test
            void testRegex_InvalidTrainIDFormat() {
                assertFalse(TrainConsistManagementApp.validateTrainId("TRAIN12"));
                assertFalse(TrainConsistManagementApp.validateTrainId("TRN12A"));
                assertFalse(TrainConsistManagementApp.validateTrainId("1234-TRN"));
            }

            @Test
            void testRegex_ValidCargoCode() {
                assertTrue(TrainConsistManagementApp.validateCargoCode("PET-AB"));
            }

            @Test
            void testRegex_InvalidCargoCodeFormat() {
                assertFalse(TrainConsistManagementApp.validateCargoCode("PET-ab"));
                assertFalse(TrainConsistManagementApp.validateCargoCode("PET123"));
                assertFalse(TrainConsistManagementApp.validateCargoCode("AB-PET"));
            }

            @Test
            void testRegex_TrainIDDigitLengthValidation() {
                assertFalse(TrainConsistManagementApp.validateTrainId("TRN-123"));
                assertFalse(TrainConsistManagementApp.validateTrainId("TRN-12345"));
            }

            @Test
            void testRegex_CargoCodeUppercaseValidation() {
                assertFalse(TrainConsistManagementApp.validateCargoCode("PET-ab"));
            }

            @Test
            void testRegex_EmptyInputHandling() {
                assertFalse(TrainConsistManagementApp.validateTrainId(""));
                assertFalse(TrainConsistManagementApp.validateCargoCode(""));
            }

            @Test
            void testRegex_ExactPatternMatch() {
                assertFalse(TrainConsistManagementApp.validateTrainId("TRN-1234XYZ"));
            }
    }
}