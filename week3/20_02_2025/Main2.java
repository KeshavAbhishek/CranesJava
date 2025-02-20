import java.util.ArrayList;
import java.util.Iterator;
/**
 * ==========================================================
 * Program Name: Main2
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class Main2 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Ankit");
        names.add("Sourav");
        names.add("Nihal");
        names.add("Aman");
        names.add("Keshav");

        System.out.println("Normal For Loop....\n");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // System.out.println();
        System.out.println("\nEnhanced For Loop....\n");

        for (String s : names) {
            System.out.print(s + " ");
        }

        System.out.println("\nIterator Loop....\n");

        Iterator it = names.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
    }
}