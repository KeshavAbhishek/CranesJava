import java.util.Arrays;

/**
 * ==========================================================
 * Program Name: BubbleSort
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 24-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class BubbleSort {
    public static void sort(int arr[]){
        int size = arr.length;

        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size-i-1; j++) {
                int temp = arr[j+1];
                if(arr[j]>arr[j+1]){
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        sort(new int[]{1,50,2,100,3,150});
    }
}