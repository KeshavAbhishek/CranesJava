/**
 * ==========================================================
 * Program Name: TestMultipleCatchBlock
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 13-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class TestMultipleCatchBlock {
    public static void main(String[] args){
        try{
            int a[] = new int[5];
            a[5] = 300/0;
        }
        // catch(ArithmeticException e){System.out.println("Task 1");}
        // catch(ArrayIndexOutOfBoundsException e){System.out.println("Task 2");}
        catch(Exception e){System.out.println("COMMON  TASK  COMPLETED ...");}

        System.out.println("REST OF CODE");
    }
}