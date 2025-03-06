/**
 * ==========================================================
 * Program Name: ThreadUsingLambda
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 04-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class ThreadUsingLambda {
    public static void main(String[] args) {
        Runnable r = ()->{
            try{
                if(true){
                    for(int i = 0; i < 4; i++){
                        System.out.print(i+1 + " ");
                    }
                }
                else{
                    throw new Exception("Interrupted...");
                }
            }catch(Exception e){

            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}