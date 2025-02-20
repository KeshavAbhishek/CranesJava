import java.util.ArrayList;
import java.util.Iterator;

/**
 * ==========================================================
 * Program Name: Main
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);
        list.add(105);

        System.out.println(list);
        System.out.println();

        for (int i = 0; i < 10; i++) {
            list.add(100+i+1);
        }
        System.out.println(list+"\n");
        System.out.println("Using enhanced for loop...");
        for (Integer i : new Integer[]{1,2,3,4,5,6,7,8,9,10}) {
            list.add(i);
        }

        System.out.println(list);

        System.out.println("Using iterator....");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}