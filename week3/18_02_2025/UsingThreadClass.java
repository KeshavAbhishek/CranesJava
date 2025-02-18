/**
 * ==========================================================
 * Program Name: UsingThreadClass
 * Description :
 * Author : Keshav Abhishek
 * Created On : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class DemoThread extends Thread {
    DemoThread() {
        super("Child Thread");
        start();
    }

    public void run() {
        System.out.println("From child thread: " + Thread.currentThread());
    }
}

public class UsingThreadClass {
    public static void main(String[] args) {
        new DemoThread();
        Thread t = new Thread();
        t.setName("Main Thread");
        System.out.println("From main class: " + t);
    }
}