package com.train.app;

public class TrainConsistManagementApp {

    // CUSTOM RUNTIME EXCEPTION
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // GOODS BOGIE CLASS
    public static class GoodsBogie {
        String shape;
        String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        // METHOD TO ASSIGN CARGO
        public void assignCargo(String cargo) {
            try {
                // validation rule
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Petroleum not allowed in Rectangular Bogie");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("====================================\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum"); // valid

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum"); // invalid but handled

        System.out.println("Program continues safely...");
    }
}