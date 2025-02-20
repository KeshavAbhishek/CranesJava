/**
 * ==========================================================
 * Program Name: TestThread
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 19-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class Numerical extends Thread{
    Numerical(){}
    public void run(){
        try {
            for(int i = 0; i < 10; i++){
                System.out.print(i+ ", ");
                Thread.sleep(500);
            }
            
        } catch (Exception e) {
        }
    }
}

class Alphabet extends Thread{
    Alphabet(){}
    public void run(){
        try {
            for(int i = 0; i < 10; i++){
                System.out.print((char)(65+i) + ", ");
                Thread.sleep(500);
            }
            
        } catch (Exception e) {
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        Numerical num = new Numerical();
        Thread t1 = new Thread(num);
        t1.setPriority(Thread.MIN_PRIORITY);

        Alphabet alpha = new Alphabet();
        Thread t2 = new Thread(alpha);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        System.out.println("\n");
        t2.start();
    }
}