import java.util.ArrayList;

/**
 * ==========================================================
 * Program Name: RemoveOdd
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class RemoveOdd {
    public static void main(String[] args) {
        ArrayList <Integer> data = new ArrayList<>();
        data.add(100);
        data.add(101);
        data.add(102);
        data.add(103);
        data.add(104);

        data.removeIf(n->(n%2!=0));

        System.out.println(data);
    }
}