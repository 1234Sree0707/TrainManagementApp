package com.seveneleven.trainmanagementapp.app;
import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS
 * 
 * Use Case 11 : Validate Train ID and Cargo Code
 * 
 * Description:
 * This class validates input formats using Regular Expressions
 * 
 * This maps format validation logic using Pattern matching.
 * 
 * @author Developer
<<<<<<< HEAD
 * @version 10.0
=======
 * @version 11.0
>>>>>>> feature/UC11
 * 
 */
public class TrainApp {
	
	static class Bogie{
		String name;
		int capacity;
		
		public Bogie(String name,int capacity) {
			this.name=name;
			this.capacity=capacity;
		}

		public String getName() {
			return name;
		}

		public int getCapacity() {
			return capacity;
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("============================================");
		System.out.println("Validate Train ID and Cargo Code==");
		System.out.println("============================================");		
		String trainno_regex="^TRN-\\d{4}$";
		String cargono_regex="^PET-[A-Z]{2}$";
		System.out.println("Enter Train ID (Format TRN-1234) :  ");
		String trainno=sc.nextLine();
		System.out.println("Enter Cargo Code (Format PET-AB) :  ");
		String cargono=sc.nextLine();
		System.out.println("");
		System.out.println("Validation Results : ");
		System.out.println("Train ID Valid : " + trainno.matches(trainno_regex));
		System.out.println("Cargo Code Valid : " + cargono.matches(cargono_regex));
		
		
		
		
		
		
		

		
	}

}
