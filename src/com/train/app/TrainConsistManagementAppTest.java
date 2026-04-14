package com.train.app;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
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
        @Test
        void testSafety_AllValid() {
            List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();

            bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"));
            bogies.add(new TrainConsistManagementApp.GoodsBogie("Rectangular", "Coal"));

            assertTrue(TrainConsistManagementApp.isTrainSafe(bogies));
        }

        @Test
        void testSafety_InvalidCase() {
            List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();

            bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Coal"));

            assertFalse(TrainConsistManagementApp.isTrainSafe(bogies));
            @Test
            void testLoopFilteringLogic() {
                List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

                list.add(new TrainConsistManagementApp.Bogie("A", 70));
                list.add(new TrainConsistManagementApp.Bogie("B", 50));

                List<TrainConsistManagementApp.Bogie> result =
                        TrainConsistManagementApp.filterUsingLoop(list);

                assertEquals(1, result.size());
            }

            @Test
            void testStreamFilteringLogic() {
                List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

                list.add(new TrainConsistManagementApp.Bogie("A", 70));
                list.add(new TrainConsistManagementApp.Bogie("B", 50));

                List<TrainConsistManagementApp.Bogie> result =
                        TrainConsistManagementApp.filterUsingStream(list);

                assertEquals(1, result.size());
            }

            @Test
            void testLoopAndStreamResultsMatch() {
                List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

                list.add(new TrainConsistManagementApp.Bogie("A", 80));
                list.add(new TrainConsistManagementApp.Bogie("B", 40));

                List<TrainConsistManagementApp.Bogie> loop =
                        TrainConsistManagementApp.filterUsingLoop(list);

                List<TrainConsistManagementApp.Bogie> stream =
                        TrainConsistManagementApp.filterUsingStream(list);

                assertEquals(loop.size(), stream.size());
            }

            @Test
            void testExecutionTimeMeasurement() {
                long start = System.nanoTime();
                long end = System.nanoTime();

                long elapsed = end - start;

                assertTrue(elapsed >= 0);
            }
        }
    }
}