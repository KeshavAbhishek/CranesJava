package LAB_Problem.Problem11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ==========================================================
 * Program Name: MaximumElement
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class MaximumElement {
    public static void findLargest(){
        ArrayList <Integer> data = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements: ");
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.print("Enter value: ");
            data.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(data, Collections.reverseOrder());
        System.out.println("Largest element: " + data.get(0));
    }
    public static void main(String[] args) {
        findLargest();
    }
}