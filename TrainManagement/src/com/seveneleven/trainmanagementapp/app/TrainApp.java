package com.seveneleven.trainmanagementapp.app;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 4 : Maintain Ordered Bogie Consist
 * 
 * Description:
 * This class models the physical chaining of train bogies 
 * using LinkedList for ordered operations.
 * 
 * This maps positional operations using LinkedList.
 * 
 * @author Developer
 * @version 4.0
 * 
 */
public class TrainApp{

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("==Maintain ordered bogie consist==");
		System.out.println("================================");
		List<String> trainConsist=new LinkedList<>();
		System.out.println("Initial Train consist");
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");
		System.out.println(trainConsist);
		System.out.println("After inserting 'Pantry Car' at position 2");
		trainConsist.add(2,"Pantry Car");
		System.out.println(trainConsist);
		System.out.println("After removing first and last bogie");
		trainConsist.removeFirst();
		trainConsist.removeLast();
		System.out.println(trainConsist);
		System.out.println("UC4 Ordered consist operations completed");
		

		
		
		
		
		
		

		
	}
	

}