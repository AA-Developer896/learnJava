package org.example.learnCollection.learnHashMap;

import java.util.*;

public class learnHashMap {


    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard put() method

        // to add elements in map
        map.put("China", 10);
        map.put("India", 30);
        map.put("America", 20);

        // seraching in Map

        if(map.containsKey("India")) {

            // getting value
            int population = map.get("India");
            System.out.println(population);
        }

        // Iterating through map
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        // remove element from map
        map.remove("India");
        System.out.println(map);
        System.out.println("size: " + map.size() );

       // Collection<Integer> collection = map.values();
        Set<Integer> set = new HashSet<>(map.values());
        System.out.println("values: " + set);


    }

}
