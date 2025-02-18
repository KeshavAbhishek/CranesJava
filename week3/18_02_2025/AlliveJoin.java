/**
 * ==========================================================
 * Program Name: AlliveJoin
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class NewThread implements Runnable{
    Thread t;
    String threadName;
    NewThread(){}
    NewThread(String threadName){
        this.threadName = threadName;
        t = new Thread(this, threadName);
        t.start();
    }

    public void run(){
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("From thread: " + Thread.currentThread() + " i = " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){e.printStackTrace();}
    }
}

public class AlliveJoin {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("1st");
        NewThread t2 = new NewThread("2nd");
        NewThread t3 = new NewThread("3rd");

        System.out.println("Thread 1: " + t1.t.isAlive());
        System.out.println("Thread 2: " + t2.t.isAlive());
        System.out.println("Thread 3: " + t3.t.isAlive());

        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
            System.out.println(t1.t.isAlive());
            System.out.println(t2.t.isAlive());
            System.out.println(t3.t.isAlive());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}