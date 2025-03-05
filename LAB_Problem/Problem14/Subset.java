import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ==========================================================
 * Program Name: Subset
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class Subset {
    public static void main(String[] args) {
        Set <Integer> set1 = new LinkedHashSet<>(Arrays.asList(1,2,3));
        Set <Integer> set2 = new LinkedHashSet<>(Arrays.asList(1,2));

        System.out.println(set1.containsAll(set2));
    }
}