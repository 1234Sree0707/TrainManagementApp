package com.seveneleven.trainmanagementapp.app;
<<<<<<< HEAD
import java.util.*;
import java.util.stream.*;

=======
>>>>>>> 5b41de1d7b1f1e144e665f55648a21e29e0b12a3
/**
 * MAIN CLASS
 * 
 * Use Case 10 : Count total seats in Train
 * 
 * Description:
 * This class aggregates seating capacity of all bogies in a single total
 * using Stream reduce().
 * 
 * This maps aggregation logic using reduce().
 * 
 * @author Developer
<<<<<<< HEAD
 * @version 10.0
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
=======
 * @version 9.0
*/
 
 import java.util.*;
 import java.util.stream.Collectors;
>>>>>>> 5b41de1d7b1f1e144e665f55648a21e29e0b12a3

		public String getName() {
			return name;
		}

		public int getCapacity() {
			return capacity;
		}
		
	}
	

	public static void main(String[] args) {
		System.out.println("======================================");
		System.out.println("==UC 10 : Count total seats in Train==");
		System.out.println("======================================");
		
		List<Bogie> bogies=new ArrayList<>();
		
		System.out.println();
		
		bogies.add(new Bogie("First class",30));
		bogies.add(new Bogie("Cargo",100));
		bogies.add(new Bogie("Sleeper",45));
		bogies.add(new Bogie("AC Chair",28));
		bogies.add(new Bogie("AC Chair",15));
		bogies.add(new Bogie("Cargo",76));
		
		System.out.println("All Bogies : ");
		for(Bogie b:bogies) {
			System.out.println( b.getName() + " -> " + b.getCapacity());
		}
		System.out.println();
		
		int total = bogies.stream().map(b -> b.getCapacity()).reduce(0,Integer::sum);
		
		System.out.println("Total seating capacity of Train : " + total);
	}

<<<<<<< HEAD
}
=======
         @Override
         public String toString() {
             return name + "->" + capacity;
         }
     }

     public static void main(String[] args) {
         List<Bogie> bogies = new ArrayList<>();
         bogies.add(new Bogie("First Class", 24));
         bogies.add(new Bogie("Cargo", 120));
         bogies.add(new Bogie("Sleeper", 72));
         bogies.add(new Bogie("AC Chair", 56));
         bogies.add(new Bogie("AC Chair", 60));

         System.out.println("======================================");
         System.out.println("Grouping by types ");
         System.out.println("======================================");
         System.out.println("All Bogies:");
         for (Bogie b : bogies) {
             System.out.println(b.name + "->" + b.capacity);
         }

         Map<String, List<Bogie>> groupedBogies = bogies.stream()
                 .collect(Collectors.groupingBy(b -> b.name));

         System.out.println("Grouped bogies:");
         for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
             System.out.println(entry.getKey() + " -> " + entry.getValue());
         }
     }
 }

>>>>>>> 5b41de1d7b1f1e144e665f55648a21e29e0b12a3
