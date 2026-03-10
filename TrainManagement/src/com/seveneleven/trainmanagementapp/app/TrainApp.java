package com.seveneleven.trainmanagementapp.app;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 2 : Add Passenger Bogies to train
 * 
 * Description:
 * This class demonstrates how passenger bogies can be 
 * managed dynamically using ArrayList operations. 
 * 
 * This use case maps CRUD operations using ArrayList.
 * 
 * @author Developer
 * @version 2.0
 * 
 */
public class TrainApp{

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("==Train Consist Management App==");
		System.out.println("================================");
		
		List<String> trainConsist = new ArrayList<>();
		List<String> passengerBogies=new ArrayList<>();
		passengerBogies.add("Sleeper");
		passengerBogies.add("First class");
		passengerBogies.add("AC Chair");
		System.out.println("The train has "+passengerBogies.size()+"different types of bogies and they are:");
		for(String bogie:passengerBogies) {
			System.out.println(bogie);
		}
		System.out.println("=================================\n");

		passengerBogies.remove("Sleeper");
		System.out.println("Sleeper bogie removed");
		System.out.println("=================================\n");

		if(passengerBogies.contains("AC Chair")) {
			System.out.println("AC Chair exisits");
		}
		System.out.println("=================================\n");
		System.out.println("Updated bogie list:");
		for(String bogie:passengerBogies) {
			System.out.println(bogie);
		}
		System.out.println("=================================\n");

		System.out.println("UC2 operations completed successfully");
		
		
		

		
	}
	

}