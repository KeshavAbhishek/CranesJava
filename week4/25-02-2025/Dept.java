import java.util.HashMap;

/**
 * ==========================================================
 * Program Name: CharFreqCount
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class Dept {
    public static void main(String[] args) {
        HashMap<Integer, String> dept = new HashMap<>();
        dept.put(101, "C");
        dept.put(102, "CPP");
        dept.put(103, "JAVA");
        dept.put(104, "C");

        int count = 0;
        count = 0;
        for(HashMap.Entry<Integer, String> m : dept.entrySet()){
            if(m.getValue().equals("C")){
                System.out.println(m.getKey() + " -> " + m.getValue());
                count++;
            }
        }
        System.out.println("Number of Faculty -> " + count);
    }
}