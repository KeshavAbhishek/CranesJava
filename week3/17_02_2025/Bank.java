/**
 * ==========================================================
 * Program Name: Bank
 * Description :
 * Author : Keshav Abhishek
 * Created On : 17-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class Bank {
    static int balance = 1000;

    public static void withDraw(int debit) throws ArithmeticException {
        try {

            if (debit > balance) {
                throw new ArithmeticException("Insufficient!! Debit amount is more than balance.");
            } else {
                balance = balance - debit;
                System.out.println("Debit Success !!\nCurrent balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        withDraw(1500);
    }
}