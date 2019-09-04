package edu.cscc;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        // Jackie Turpin
        //09/01/19
        //HashList HomeWork Challenge 1
        //A list of people in my family and ages adding a hopeful addition
        //Create an empty map


        HashMap myFirstHashMap = new HashMap();
        //Add some entries
        myFirstHashMap.put("Gage", 10);
        myFirstHashMap.put("Blaid", 9);
        myFirstHashMap.put("Cyrus", 5);
        myFirstHashMap.put("Stacey", 33);
        myFirstHashMap.put("Oscar", 29);
        myFirstHashMap.put("Carlos", 31);
        myFirstHashMap.put("Irene", 53);
        myFirstHashMap.put("Tanya", 51);
        myFirstHashMap.put("Jackie", 33);
        myFirstHashMap.put("Shannon", 52);

        entrySetMap(myFirstHashMap);

    }


    // For every object in the list of all keys, print that object to the console

    public static void entrySetMap(Map<String, Integer> myFirstHashMap) {
        for (Map.Entry<String, Integer> entry : myFirstHashMap.entrySet()) {
            // Retrieve the value for key in the list and print it
            System.out.println("key List: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        myFirstHashMap.put("Jordan Irene", 0);

        System.out.println("See Changes: ");
        for (Map.Entry<String, Integer> entry : myFirstHashMap.entrySet()) {

            System.out.println("Key List: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        Sum(myFirstHashMap);
    }
    public static void Sum(Map<String, Integer> myFirstHashMap) {
        // Collection<Integer> values = hashMap1.values();
        int sumAge = 0;
        for (int integer : myFirstHashMap.values()) {
            sumAge += integer;
        }
        System.out.println("Total Age : " + sumAge);
    }
}