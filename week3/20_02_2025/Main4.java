import java.util.ArrayList;

/**
 * ==========================================================
 * Program Name: Main4
 * Description :
 * Author : Keshav Abhishek
 * Created On : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class Main4 {
    public static void main(String[] args) {
        int count = 0;
        int key = 10;
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(10);
        data.add(10);
        data.add(20);
        data.add(20);
        data.add(30);
        data.add(30);

        for (Integer i : data) {
            if (key==i) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Not found");
        } else {
            System.out.println(key + " Found " + count + " times.");
        }
    }
}