/**
 * ==========================================================
 * Program Name: ReturnSquare
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 06-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

interface RtnSquare{
    public int square(int x);
}
public class ReturnSquare {
    public static void main(String[] args) {
        RtnSquare op = (a)->{
            return a*a;
        };
        System.out.println("SQuare Of 15" + op.square(15));
    }
}