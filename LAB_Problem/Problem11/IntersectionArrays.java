package LAB_Problem.Problem11;

import java.util.ArrayList;

/**
 * ==========================================================
 * Program Name: IntersectionArrays
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class IntersectionArrays {
    public static void intersectionArrays(){
        ArrayList <Integer> data1 = new ArrayList<>();
        ArrayList <Integer> data2 = new ArrayList<>();

        data1.add(100);
        data1.add(102);
        data1.add(103);
        data1.add(104);

        data2.add(100);
        data2.add(103);
        data2.add(105);
        data2.add(106);

        data1.retainAll(data2);

        System.out.println(data1);
    }
    public static void main(String[] args) {
        intersectionArrays();
    }
}