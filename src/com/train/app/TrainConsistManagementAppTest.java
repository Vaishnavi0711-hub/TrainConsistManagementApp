@Test
void testValidCapacity() throws Exception {
    TrainConsistManagementApp.PassengerBogie bogie =
            new TrainConsistManagementApp.PassengerBogie("Sleeper", 50);

    assertEquals(50, bogie.capacity);
}

@Test
void testInvalidCapacityThrowsException() {
    assertThrows(TrainConsistManagementApp.InvalidCapacityException.class, () -> {
        new TrainConsistManagementApp.PassengerBogie("AC Chair", -5);
    });
}

@Test
void testZeroCapacityThrowsException() {
    assertThrows(TrainConsistManagementApp.InvalidCapacityException.class, () -> {
        new TrainConsistManagementApp.PassengerBogie("First Class", 0);
    });
}