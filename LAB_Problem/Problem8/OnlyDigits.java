/**
 * ==========================================================
 * Program Name: OnlyDigits
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Scanner;
public class OnlyDigits {
    public static void onlyDigits(String s){
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){}
            else{
                flag = 0;
            }
        }
        try{
            if(flag==1){}
            else{
                throw new Exception("The string also contains alphabet.");
            }
        }catch(Exception e){System.out.println(e);}
        System.out.println(flag==1?"\nYes, all are digits.":"");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = scanner.nextLine();
        onlyDigits(string);

        scanner.close();
    }
}