import java.util.HashSet;
import java.util.Set;

/**
 * ==========================================================
 * Program Name: DistinctElement
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class DistinctElement {
    public static void distinctEle(int arr[]){
        Set <Integer> data = new HashSet<>();
        for(int i : arr){
            data.add(i);
        }
        System.out.println("Distinct Elements: " + data.size());
    }
    public static void main(String[] args) {
        distinctEle(new int[]{1, 2, 3, 2, 4, 5, 1, 6, 7, 5});
    }
}