package LAB_Problem.Problem11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * ==========================================================
 * Program Name: SecondLargest
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
public class SecondLargest {
    public static void find2ndLargest(){
        ArrayList <Integer> data = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements: ");
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.print("Enter value: ");
            data.add(sc.nextInt());
        }
        HashSet <Integer> dataFilter = new HashSet<>(data);
        data = new ArrayList<>(dataFilter);
        sc.close();
        Collections.sort(data, Collections.reverseOrder());
        System.out.println("Second largest element: " + data.get(1));
    }
    public static void main(String[] args) {
        find2ndLargest();
    }
}