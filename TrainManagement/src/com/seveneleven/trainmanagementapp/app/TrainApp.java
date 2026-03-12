package com.seveneleven.trainmanagementapp.app;

/**
 * MAIN CLASS
 * 
 * Use Case 9 : Group Bogies by Type
 * 
 * Description:
 * This class groups bogies by using Collectors.groupingBy()
 * 
 * This maps classification logic using groupingBy.
 * 
 * @author Developer
 * @version 9.0
 * 
 */
 
 import java.util.*;
 import java.util.stream.Collectors;

 public class TrainApp {

     static class Bogie {
         String name;
         int capacity;

         public Bogie(String name, int capacity) {
             this.name = name;
             this.capacity = capacity;
         }

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