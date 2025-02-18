/**
 * ==========================================================
 * Program Name: MultiThread
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class AlphabetThread extends Thread{
    AlphabetThread(){
        super("Alphabet-Thread");
        start();
    }
    public void run(){
        try{
            for (int i = 0; i < 9; i++) {
                System.out.println("From:" + Thread.currentThread() + " i = " + (char)(i+65));
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){System.out.println(e);}
    }
}

class NumberThread extends Thread{
    NumberThread(){
        super("Number-Thread");
        start();
    }
    public void run(){
        try{
            for (int i = 0; i < 9; i++) {
                System.out.println("From:" + Thread.currentThread() + " i = " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){System.out.println(e);}
    }
}

public class MultiThread {
    public static void main(String[] args) {
        new AlphabetThread();
        new NumberThread();
        Thread t = new Thread();
        t.setName("Main Thread");
        System.out.println("From main class: " + t);
    }
}