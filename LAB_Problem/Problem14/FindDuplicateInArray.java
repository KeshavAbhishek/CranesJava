import java.util.HashSet;
import java.util.Set;

/**
 * ==========================================================
 * Program Name: FindDuplicateInArray
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class FindDuplicateInArray {
    public static void findDuplicateInArray(int arr[]){
        Set <Integer> data = new HashSet<>();
        int temp = data.size();
        for(int e: arr){
            data.add(e);
            if(data.size()==temp){
                System.out.print(e + " ");
            }
            temp = data.size();
        }
    }
    public static void main(String[] args) {
        findDuplicateInArray(new int[]{2, 5, 6, 8, 5, 2, 9, 10});
    }
}