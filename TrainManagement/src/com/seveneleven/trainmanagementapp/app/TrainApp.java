package com.seveneleven.trainmanagementapp.app;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 6 : Map Bogie to Capacity (HashMap)
 * 
 * Description:
 * This class associates each bogie with its seating or load capacity
 * using a key-value mapping structure.
 * 
 * This maps lookup-based access using HashMap.
 * 
 * @author Developer
 * @version 6.0
 * 
 */
public class TrainApp{

	public static void main(String[] args) {
		System.out.println("======================================");
		System.out.println("==Map bogie to capacity==");
		System.out.println("======================================");
		Map<String,Integer> capacityMap=new HashMap<>();
		capacityMap.put("First Class", 24);
		capacityMap.put("Cargo",120);
		capacityMap.put("Sleeper",72);
		capacityMap.put("AC Chair",56);
		System.out.println("Bogie capacity details:");
		for(Map.Entry<String,Integer> entry:capacityMap.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		System.out.println("Bogie mapping completed");

		
		
		
		
		
		

		
	}
	

}