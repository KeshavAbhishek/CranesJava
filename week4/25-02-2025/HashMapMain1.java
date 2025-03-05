/**
 * ==========================================================
 * Program Name: HashMapMain1
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.HashMap;
public class HashMapMain1 {
    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<>();
        map.put(582, "Keshav"); 
        map.put(577, "Ankit"); 
        map.put(210, "Nihal"); 
        map.put(586, "Gupta");
        System.out.println();
        System.out.println("Size: "+map.size());
        System.out.println("Data: " + map);
        System.out.println();
        System.out.println("Contains: " + (map.containsKey(297) && map.containsKey(583)));
        System.out.println();
        System.out.println(map.remove(586));
        System.out.println();
        System.out.println("After removing: " + map);
        map.replace(210, "AIC ka Damad");
        System.out.println("After changing: " + map);
        map.replace(210, "AIC ka Damad", "Nihal");
        System.out.println("After changing: " + map);
        System.out.println();
        System.out.println("Key set: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entry set: " + map.entrySet());
        System.out.println("\n\n");

        for (Integer i: map.keySet()) {
            System.out.println(i + " = " + map.get(i));
        }

        System.out.println();
        System.out.println("\nUsing HashMap.entry<Intege, String>");
        for (HashMap.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue());
        }
        System.err.println("\n\nUsing Lambda Expression");
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}