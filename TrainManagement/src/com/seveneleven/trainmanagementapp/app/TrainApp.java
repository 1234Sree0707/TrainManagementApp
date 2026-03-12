package com.seveneleven.trainmanagementapp.app;

import java.util.*;
import java.util.stream.*;

public class TrainApp {
    
    static class Bogie {
        String type;
        String cargo;
        
        Bogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Performance comparison (Loops vs Streams)");
        System.out.println("========================================");

        List<Bogie> train = new ArrayList<>();
        for (int i = 0; i < 10000; i++) { 
            train.add(new Bogie("Cylindrical", i % 2 == 0 ? "Coal" : "Petroleum"));
            train.add(new Bogie("Box", "Grain"));
            train.add(new Bogie("Open", "Coal"));
        }

        // Loop-based filtering
        long startLoop = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : train) {
            if (!(b.getType().equals("Cylindrical") && b.getCargo().equals("Coal"))) {
                loopFiltered.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopDuration = endLoop - startLoop;

        long startStream = System.nanoTime();
        List<Bogie> streamFiltered = train.stream()
                .filter(b -> !(b.getType().equals("Cylindrical") && b.getCargo().equals("Coal")))
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamDuration = endStream - startStream;

  
        System.out.println("Loop execution time (ns): " + loopDuration);
        System.out.println("Stream execution time (ns): " + streamDuration);
    }
}
