/**
 * ==========================================================
 * Program Name: BankingSystem
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 19-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package LAB_Problem.Problem9;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdraws " + amount);
            balance -= amount;
            try {
                if(balance>=0){
                    System.out.println(Thread.currentThread().getName() + " completed the withdrawal. Remaining balance: " + balance);
                }
                else{}
            } catch (Exception e) {}
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        Runnable withdrawTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    account.withdraw(100);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread user1 = new Thread(withdrawTask, "Bank user 1");
        Thread user2 = new Thread(withdrawTask, "Bank user 2");
        Thread user3 = new Thread(withdrawTask, "Bank user 3");
        Thread user4 = new Thread(withdrawTask, "Bank user 4");
        Thread user5 = new Thread(withdrawTask, "Bank user 5");

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
    }
}