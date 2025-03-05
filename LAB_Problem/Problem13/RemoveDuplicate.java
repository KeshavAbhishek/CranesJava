import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * ==========================================================
 * Program Name: RemoveDuplicate
 * Description :
 * Author : Keshav Abhishek
 * Created On : 24-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(10);
        data.add(25);
        data.add(10);
        data.add(130);
        data.add(20);
        data.add(1200);
        data.add(30);
        data.add(30);
        data.add(30);

        Set dataClean = new LinkedHashSet<>(data);
        System.out.println(dataClean);

        Set dataCleanTree = new TreeSet<>(data);
        System.out.println(dataCleanTree);
    }
}