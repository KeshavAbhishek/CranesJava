import java.util.Vector;

/**
 * ==========================================================
 * Program Name: VectorThread
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 27-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

 public class VectorThread {
    public static void main(String[] args) {
        Vector <Integer> data = new Vector<>();

        Runnable task = ()->{
            for(int i = 0; i < 5; i++){
                data.add(i);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(data);
    }
}