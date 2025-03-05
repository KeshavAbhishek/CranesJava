/**
 * ==========================================================
 * Program Name: Main2
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 04-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

interface FindMax<T>{
    public void max(T a, T b);
}

public class Main2 {
    public static void main(String[] args) {
        FindMax<Integer> m = (n1, n2)->{
            System.out.println("Max: "+(n1>n2?n1:n2));
        };

        m.max(100,200);

        FindMax<Float> n = (n1, n2)->{
            System.out.println("Max: "+ (n1>n2?n1:n2));
        };

        n.max(100.0f, 200.f);
    }
}