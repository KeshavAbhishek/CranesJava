/**
 * ==========================================================
 * Program Name: ReverseString
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 17-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package LAB_Problem.Problem7;

public class ReverseString {
    public static String reversed(String str){
        System.out.println("Input: " + str);
        str = " " + str.trim() + " ";
        String rev = "";
        String temp = "";
        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i)!=' '){
                temp = str.charAt(i) + temp;
            }
            else{
                rev = rev + temp + ' ';
                temp = "";
            }
        }
        return rev.trim();
    }
    public static void main(String[] args) {
        System.out.println(reversed("Today is Monday"));
    }
}