package com.seveneleven.trainmanagementapp.app;

import java.util.*;

public class TrainApp {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Runtime Exception for Cargo
    static class UnsafeCargoException extends Exception {
        public UnsafeCargoException(String message) {
            super(message);
        }
    }

    // Bogie Class
    static class Bogie {

        String name;
        int capacity;
        String shape;

        public Bogie(String name, int capacity, String shape)
                throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException(
                        "Error: Capacity must be greater than zero");
            }

            this.name = name;
            this.capacity = capacity;
            this.shape = shape;
        }

        public void assignCargo(String cargo)
                throws UnsafeCargoException {

            if (cargo.equalsIgnoreCase("Petroleum")
                    && shape.equalsIgnoreCase("Rectangular")) {

                throw new UnsafeCargoException(
                        "Unsafe Cargo Assignment: Petroleum cannot be placed in Rectangular Bogie");
            }

            System.out.println("Cargo assigned successfully");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Safe Cargo Assignment");
        System.out.println("===================================");

        try {

            System.out.println("Enter Bogie Name:");
            String name = sc.nextLine();

            System.out.println("Enter Capacity:");
            int cap = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Bogie Shape:");
            String shape = sc.nextLine();

            Bogie b = new Bogie(name, cap, shape);

            System.out.println("Enter Cargo Type:");
            String cargo = sc.nextLine();

            b.assignCargo(cargo);

        }

        catch (InvalidCapacityException e) {

            System.out.println("Capacity Error: " + e.getMessage());

        }

        catch (UnsafeCargoException e) {

            System.out.println("Cargo Error: " + e.getMessage());

        }

        finally {

            System.out.println("Cargo assignment process completed.");

            sc.close();
        }
    }
}

