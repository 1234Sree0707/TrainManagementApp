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
	static class SortByCapacity implements Comparator<Bogie>{
		public int compare(Bogie a,Bogie b) {
			return a.capacity-b.capacity;
		}
	}
	public static void main(String[] args) {
		List<Bogie> bogies=new ArrayList<>();
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("Cargo",120));
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		System.out.println("======================================");
		System.out.println("Sort Bogies by Capacity");
		System.out.println("======================================");
		System.out.println("Bogies before sorting:");
		for(Bogie b:bogies) {
			System.out.println(b);
		}
		System.out.println("======================================");

		Collections.sort(bogies,new SortByCapacity());
		System.out.println("Bogies after sorting by capacity:");
		for(Bogie b:bogies) {
			System.out.println(b);
		}
		
		
		
		
		
		
		

		
	}
	

}