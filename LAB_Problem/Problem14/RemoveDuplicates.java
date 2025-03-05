import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ==========================================================
 * Program Name: RemoveDuplicates
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class RemoveDuplicates {
    public static void removeDup(int arr[]){
        Set<Integer> haSet = new LinkedHashSet<>();
        for (int i : arr) {
            haSet.add(i);
        }


        System.out.println(haSet);
    }
    public static void main(String[] args) {
        removeDup(new int[]{4, 5, 9, 4, 9, 3});
    }
}