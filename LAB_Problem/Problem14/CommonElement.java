import java.util.HashSet;
import java.util.Set;

/**
 * ==========================================================
 * Program Name: CommonElement
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class CommonElement {
    public static void findCommon(int arr1[], int arr2[]){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i : arr1){
            set1.add(i);
        }

        for(int i : arr2){
            set2.add(i);
        }

        set1.retainAll(set2);

        System.out.println(set1);
        
    }
    public static void main(String[] args) {
        findCommon(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 6, 7});
    }
}