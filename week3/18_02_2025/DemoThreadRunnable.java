/**
 * ==========================================================
 * Program Name: DemoThreadRunnable
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class DemoThread implements Runnable{
    public void run(){
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("From:" + Thread.currentThread() + " i = " + (char)(i+65));
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){System.out.println(e);}
    }
}

public class DemoThreadRunnable {
    public static void main(String[] args) {
        DemoThread d1 = new DemoThread();
        Thread t = new Thread(d1);
        t.start();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("From Main Thread: " + Thread.currentThread() + " i = " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {}
    }
}