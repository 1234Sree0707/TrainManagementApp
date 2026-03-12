package com.seveneleven.trainmanagementapp.app;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 7 : Map Bogies to Capacity (Comparator)
 * 
 * Description:
 * This class sorts passenger bogies based on seating capacity 
 * using a custom comparator.
 * 
 * This maps custom ordering using Comparator.
 * 
 * @author Developer
 * @version 7.0
 * 
 */
import java.util.*;
import java.util.stream.Collectors;
public class TrainApp{

	static class Bogie{
		String name;
		int capacity;
		public Bogie(String name,int capacity) {
			this.name=name;
			this.capacity=capacity;
		}
		@Override
		public String toString() {
			return name+"->"+capacity;
		}
	
	
	}
	public static void main(String[] args) {
		List<Bogie> bogies=new ArrayList<>();
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("Cargo",120));
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		System.out.println("======================================");
		System.out.println("Filter passenger bogies using streams ");
		System.out.println("======================================");
		System.out.println("All Bogies:");
		for(Bogie b:bogies) {
			System.out.println(b.name+"->"+b.capacity);
		}
		System.out.println("\nFiltered bogies (capacity>60)");

	
		List<Bogie> highCapacityBogies = bogies.stream().filter(b -> b.capacity > 60)  .collect(Collectors.toList());
		 highCapacityBogies.forEach(System.out::println);

		
		
		
		
		
		
		

		
	}
	

}