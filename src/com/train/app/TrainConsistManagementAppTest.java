@Test
void testSort_BasicSorting() {
    int[] arr = {72, 56, 24, 70, 60};

    int[] result = TrainConsistManagementApp.bubbleSort(arr);

    assertArrayEquals(new int[]{24, 56, 60, 70, 72}, result);
}

@Test
void testSort_AlreadySortedArray() {
    int[] arr = {24, 56, 60, 70, 72};

    int[] result = TrainConsistManagementApp.bubbleSort(arr);

    assertArrayEquals(new int[]{24, 56, 60, 70, 72}, result);
}

@Test
void testSort_DuplicateValues() {
    int[] arr = {72, 56, 56, 24};

    int[] result = TrainConsistManagementApp.bubbleSort(arr);

    assertArrayEquals(new int[]{24, 56, 56, 72}, result);
}

@Test
void testSort_SingleElementArray() {
    int[] arr = {50};

    int[] result = TrainConsistManagementApp.bubbleSort(arr);

    assertArrayEquals(new int[]{50}, result);
}

@Test
void testSort_AllEqualValues() {
    int[] arr = {40, 40, 40};

    int[] result = TrainConsistManagementApp.bubbleSort(arr);

    assertArrayEquals(new int[]{40, 40, 40}, result);
    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","First Class","General","Luxury","Sleeper"
        }, result);
    }

    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","General","Luxury","Sleeper"
        }, result);
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","First Class","General"
        }, result);
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","General","Sleeper","Sleeper"
        }, result);
    }

    @Test
    void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{"Sleeper"}, result);

        @Test
        void testSearch_BogieFound() {
            String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

            boolean result = TrainConsistManagementApp.linearSearch(arr, "BG309");

            assertTrue(result);
        }

        @Test
        void testSearch_BogieNotFound() {
            String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

            boolean result = TrainConsistManagementApp.linearSearch(arr, "BG999");

            assertFalse(result);
        }

        @Test
        void testSearch_FirstElementMatch() {
            String[] arr = {"BG101","BG205","BG309"};

            boolean result = TrainConsistManagementApp.linearSearch(arr, "BG101");

            assertTrue(result);
        }

        @Test
        void testSearch_LastElementMatch() {
            String[] arr = {"BG101","BG205","BG309"};

            boolean result = TrainConsistManagementApp.linearSearch(arr, "BG309");

            assertTrue(result);
        }

        @Test
        void testSearch_SingleElementArray() {
            String[] arr = {"BG101"};

            boolean result = TrainConsistManagementApp.linearSearch(arr, "BG101");

            assertTrue(result);
            @Test
            void testBinarySearch_BogieFound() {
                String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

                boolean result = TrainConsistManagementApp.binarySearch(arr, "BG309");

                assertTrue(result);
            }

            @Test
            void testBinarySearch_BogieNotFound() {
                String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

                boolean result = TrainConsistManagementApp.binarySearch(arr, "BG999");

                assertFalse(result);
            }

            @Test
            void testBinarySearch_FirstElementMatch() {
                String[] arr = {"BG101","BG205","BG309"};

                boolean result = TrainConsistManagementApp.binarySearch(arr, "BG101");

                assertTrue(result);
            }

            @Test
            void testBinarySearch_LastElementMatch() {
                String[] arr = {"BG101","BG205","BG309"};

                boolean result = TrainConsistManagementApp.binarySearch(arr, "BG309");

                assertTrue(result);
            }

            @Test
            void testBinarySearch_SingleElementArray() {
                String[] arr = {"BG101"};

                boolean result = TrainConsistManagementApp.binarySearch(arr, "BG101");

                assertTrue(result);
            }

            @Test
            void testBinarySearch_EmptyArray() {
                String[] arr = {};

                boolean result = TrainConsistManagementApp.binarySearch(arr, "BG101");

                assertFalse(result);
            }

            @Test
            void testBinarySearch_UnsortedInputHandled() {
                String[] arr = {"BG309","BG101","BG550","BG205","BG412"};

                boolean result = TrainConsistManagementApp.binarySearch(arr, "BG205");

                assertTrue(result);
                @Test
                void testSearch_ThrowsExceptionWhenEmpty() {
                    String[] arr = {};

                    assertThrows(IllegalStateException.class, () -> {
                        TrainConsistManagementApp.searchBogie(arr, "BG101");
                    });
                }

                @Test
                void testSearch_AllowsSearchWhenDataExists() {
                    String[] arr = {"BG101","BG205"};

                    assertDoesNotThrow(() -> {
                        TrainConsistManagementApp.searchBogie(arr, "BG101");
                    });
                }

                @Test
                void testSearch_BogieFoundAfterValidation() {
                    String[] arr = {"BG101","BG205","BG309"};

                    boolean result = TrainConsistManagementApp.searchBogie(arr, "BG205");

                    assertTrue(result);
                }

                @Test
                void testSearch_BogieNotFoundAfterValidation() {
                    String[] arr = {"BG101","BG205","BG309"};

                    boolean result = TrainConsistManagementApp.searchBogie(arr, "BG999");

                    assertFalse(result);
                }

                @Test
                void testSearch_SingleElementValidCase() {
                    String[] arr = {"BG101"};

                    boolean result = TrainConsistManagementApp.searchBogie(arr, "BG101");

                    assertTrue(result);
                }
            }
        }
    }
}