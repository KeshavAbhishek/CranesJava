/**
 * ==========================================================
 * Program Name: ReturnLarge
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 06-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

 interface RtnLarge{
    public int large(int x, int y);
}

public class ReturnLarge {
    public static void main(String[] args) {
        RtnLarge RL = (a,b)->{
            return a>b?a:b;
        };
        System.out.println("Largest: " + RL.large(10,20));
    }
}