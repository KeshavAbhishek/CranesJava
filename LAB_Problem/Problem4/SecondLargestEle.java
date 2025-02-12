/**
 * ==========================================================
 * Program Name: SecondLargestEle
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 11-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
package LAB_Problem.Problem4;

public class SecondLargestEle {
    public static int secondLarge(int arr[]){

        int max = arr[0];
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                temp = max;
                max = arr[i];
            } else if (arr[i] > temp && arr[i] != max) {
                temp = arr[i];
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.print("Second largest element: " + secondLarge(new int[]{1,3,9,8,7}));
    }
}