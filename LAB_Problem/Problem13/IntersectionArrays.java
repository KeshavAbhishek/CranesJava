import java.util.ArrayList;
import java.util.HashSet;

/**
 * ==========================================================
 * Program Name: IntersectionArrays
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 24-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class IntersectionArrays {
    public static void intersection(int arr1[], int arr2[]){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for(int e : arr1){
            arrayList1.add(e);
        }

        for(int e : arr2){
            arrayList2.add(e);
        }

        arrayList1.retainAll(arrayList2);

        HashSet<Integer> set = new HashSet<>(arrayList1);

        System.out.println(set);
    }
    public static void main(String[] args) {
        intersection(new int[]{1,2,3,2,2,5}, new int[]{2,3,3,5,4});
    }
}