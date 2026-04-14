@Test
void testCargo_SafeAssignment() {
    TrainConsistManagementApp.GoodsBogie bogie =
            new TrainConsistManagementApp.GoodsBogie("Cylindrical");

    assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
}

@Test
void testCargo_UnsafeAssignmentHandled() {
    TrainConsistManagementApp.GoodsBogie bogie =
            new TrainConsistManagementApp.GoodsBogie("Rectangular");

    // should not crash due to try-catch
    assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
}

@Test
void testCargo_ProgramContinuesAfterException() {
    TrainConsistManagementApp.GoodsBogie b1 =
            new TrainConsistManagementApp.GoodsBogie("Rectangular");

    TrainConsistManagementApp.GoodsBogie b2 =
            new TrainConsistManagementApp.GoodsBogie("Cylindrical");

    b1.assignCargo("Petroleum"); // handled
    b2.assignCargo("Coal");      // should still execute

    assertTrue(true); // program did not crash
}