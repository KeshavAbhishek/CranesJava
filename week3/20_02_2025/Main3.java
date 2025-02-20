import java.util.ArrayList;
import java.util.Iterator;
/**
 * ==========================================================
 * Program Name: Main3
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class Main3 {
    public static void main(String[] args) {
        ArrayList <String> class1 = new ArrayList<>();
        ArrayList <String> class2 = new ArrayList<>();
        class1.add("Ankit");
        class1.add("Sourav");
        class1.add("Nihal");
        class1.add("Aman");
        class1.add("Keshav");

        class2.add("Rashmika Mandana");
        class2.add("Basanti");
        class2.add("Shreya Ghosal");

        class1.addAll(class2);

        Iterator it = class1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.println();

        class2.clear();

        System.out.println(class1 + " " + class2);
    }
}