/**
 * ==========================================================
 * Program Name: MissingNumber1toN
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 11-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package LAB_Problem.Problem4;

public class MissingNumber1toN {
    public void missing(int arr[]){
        int sum = 0;
        int actualSum = (arr.length+1) * (arr.length + 2) / 2;

        for(int i : arr){
            sum += i;
        }

        System.out.println("Missing: " + (actualSum - sum));
    }

    public static void main(String[] args){
        MissingNumber1toN M = new MissingNumber1toN();
        M.missing(new int[]{1,2,3,4,5,6,8});
    }
}