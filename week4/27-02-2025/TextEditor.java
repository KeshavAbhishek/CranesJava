import java.util.Scanner;
import java.util.Stack;

/**
 * ==========================================================
 * Program Name: TextEditor
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 27-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class TextEditor {
    public static void main(String[] args) {
        Stack <String> words = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.next();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            if(input.equalsIgnoreCase("undo")){
                words.pop();
            }
            else{
                words.push(input);
            }
        }
        System.out.println(words);
        sc.close();
    }
}