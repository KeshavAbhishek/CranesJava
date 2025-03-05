/**
 * ==========================================================
 * Program Name: Braces
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 27-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Stack;
public class Braces {
    public static void main(String[] args) {
        String expression = "(a+b)()*[c-d]";
        Stack <Character> stack = new Stack<>();

        for(char i : expression.toCharArray()){
            if(i=='[' || i=='{' || i=='('){
                stack.push(i);
            } else if (i == ']' || i == '}' || i == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Invalid expression");
                    return;
                }
                char top = stack.pop();
                if ((i == ']' && top != '[') || (i == '}' && top != '{') || (i == ')' && top != '(')) {
                    System.out.println("Invalid expression");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Valid expression");
        } else {
            System.out.println("Invalid expression");
        }
    }
}