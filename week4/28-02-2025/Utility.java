/**
 * ==========================================================
 * Program Name: Utility
 * Description :
 * Author : Keshav Abhishek
 * Created On : 28-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class PrintArray<T> {
    public void getData(T[] value) {
        for (T t : value) {
            System.out.println(t);
        }
    }
}

public class Utility {
    public static void main(String[] args) {
        Integer[] data = { 1, 2, 3, 4, 5 };
        String[] data2 = { "Ram", "Shyam", "Mohan" };

        PrintArray<Integer> d1 = new PrintArray<>();
        PrintArray<String> d2 = new PrintArray<>();

        d1.getData(data);
        d2.getData(data2);
    }
}