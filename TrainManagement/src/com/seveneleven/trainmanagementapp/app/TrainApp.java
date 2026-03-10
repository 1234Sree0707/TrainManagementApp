package com.seveneleven.trainmanagementapp.app;
import java.util.*;


/**
 * MAIN CLASS
 * 
 * Use Case 3 : Track unique Bogie Id's
 * 
 * Description:
 * This class ensures that duplicate bogie ID are not added into the train 
 * formation using HashSet.
 * 
 * This use case maps uniqueness validation using Set.
 * 
 * @author Developer
 * @version 3.0
 * 
 */
public class TrainApp{

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("==Track Unique bogie ID's==");
		System.out.println("================================");
		Set<String> bogieID=new HashSet<>();
		bogieID.add("BG101");
		bogieID.add("BG102");
		bogieID.add("BG103");
		bogieID.add("BG104");
		bogieID.add("BG101");
		System.out.println("Bogie ID's after insertion");
		Iterator<String> it=bogieID.iterator();
		while(it.hasNext()) {
			String id=it.next();
			System.out.println(id);
		}
		
		
		
		
		

		
	}
	

}