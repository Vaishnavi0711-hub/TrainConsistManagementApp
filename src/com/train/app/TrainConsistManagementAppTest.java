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
    }
}