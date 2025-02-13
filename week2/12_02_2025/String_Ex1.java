/**
 * ==========================================================
 * Program Name: String_Ex1
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 12-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class String_Ex1 {
    public static void main(String[] args) {
        String literal = "Literal";
        char ch[] = {'c','h','-','a','r','r'};
        String chToString = new String(ch);
        String literalToString = new String(literal);

        System.out.println(literal);
        System.out.println(ch);
        System.out.println(chToString);
        System.out.println(literalToString);
    }
}