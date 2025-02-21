package LAB_Problem.Problem11;

import java.util.ArrayList;

/**
 * ==========================================================
 * Program Name: ReverseArrayList
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class ReverseArrayList {
    public static void reverseOrder(){
        ArrayList <Integer> data1 = new ArrayList<>();

        data1.add(100);
        data1.add(102);
        data1.add(103);
        data1.add(104);

        System.out.println("Forward Order: " + data1);

        int size = data1.size();

        for(int i = 0; i < size/2; i++){
            int temp = data1.get(i);
            data1.set(i, data1.get(size-i-1));
            data1.set(size - i - 1, temp);
        }

        System.out.println("Reverse Order: " + data1);

    }
    public static void main(String[] args) {
        reverseOrder();
    }
}