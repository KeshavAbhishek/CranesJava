/**
 * ==========================================================
 * Program Name: CountVowels
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 12-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class CountVowels {
    public static void main(String[] args) {
        String name = "KESHAV";
        name = name.toLowerCase();
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if(vowels.contains(Character.toString(name.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);
    }
}