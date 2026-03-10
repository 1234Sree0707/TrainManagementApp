package com.seveneleven.trainmanagementapp.app;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 5 : Preserve Insertion Order of Bogies
 * 
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet
 * 
 * This maps ordered uniqueness using LinkedHashSet.
 * 
 * @author Developer
 * @version 5.0
 * 
 */
public class TrainApp{

	public static void main(String[] args) {
		System.out.println("======================================");
		System.out.println("==Preserve insertion order of bogies==");
		System.out.println("======================================");
		Set<String> formation=new LinkedHashSet<>();
		formation.add("Engine");
		formation.add("Guard");
		formation.add("Cargo");
		formation.add("Guard");
		System.out.println("Final train formation:");
		System.out.println(formation);
		

		
		
		
		
		
		

		
	}
	

}