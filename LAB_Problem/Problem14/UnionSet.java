import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ==========================================================
 * Program Name: UnionSet
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class UnionSet {
    public static void unionSet(){
        Set <Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set <Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
        set1.addAll(set2);

        System.out.println(set1);
    }
    public static void main(String[] args) {
        unionSet();
    }
}