package com.seveneleven.trainmanagementapp.app;
import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n======Linear Search for Bogie ID======");

        System.out.println("Enter number of bogie IDs:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIDs = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");

        for(int i = 0; i < n; i++) {
            bogieIDs[i] = sc.nextLine();
        }

        // Search key
        System.out.println("Enter Bogie ID to search:");
        String searchKey = sc.nextLine();

        boolean found = false;

        // Linear Search
        for(int i = 0; i < n; i++) {

            if(bogieIDs[i].equals(searchKey)) {
                System.out.println("Bogie ID found at position: " + i);
                found = true;
                break;
            }
        }

        // If not found
        if(!found) {
            System.out.println("Bogie ID not found in the consist.");
        }

        sc.close();
    }
}
