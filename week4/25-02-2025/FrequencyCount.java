import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * ==========================================================
 * Program Name: FrequencyCount
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class FrequencyCount {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,1,2));
        HashMap <Integer, Integer> data = new HashMap<>();

        for(Integer i : arr){
            if(data.containsKey(i)){
                data.put(i, data.get(i)+1);
            }
            else{
                data.put(i, 1);
            }
        }

        // System.out.println(data);
        data.forEach((key, value)->{
            System.out.println(key + " occured " + value + " times.");
        });
    }
}