/**
 * ==========================================================
 * Program Name: SecondLargestElement
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestElement {
    public static void secondLargest(int arr[]){
        try{
            if(arr.length<2){
                throw new ArithmeticException("Length of array must be more than or equal to 2");
            }
            else{
                Arrays.sort(arr);
                System.out.println("Second largest: " + arr[arr.length-2]);
            }
        }catch(ArithmeticException e){System.out.println(e);}
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        secondLargest(arr);
        scanner.close();
    }
}