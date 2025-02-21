package LAB_Problem.Problem11;

import java.util.ArrayList;

/**
 * ==========================================================
 * Program Name: EvenNumberRemoval
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class EvenNumberRemoval {
    public static void main(String[] args) {
        ArrayList <Integer> data1 = new ArrayList<>();

        data1.add(100);
        data1.add(102);
        data1.add(103);
        data1.add(104);

        System.out.println("Before removal: " + data1);

        data1.removeIf(n->(n%2==0));

        System.out.println("After removal: " + data1);
    }
}