/**
 * ==========================================================
 * Program Name: Array1DEx
 * Description : 1D Array
 * Author      : Keshav Abhishek
 * Created On  : 10-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

/*
* int[] d;
* int []d;
* int d[];
*/

import java.util.Arrays;
import java.util.Scanner;
public class Array1DEx {
    static Scanner sc = new Scanner(System.in);
    public int sumOfAll(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public int[] sumOfEvenOdd(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i : arr) {
            if(i%2==0){even+=i;}
            else{odd+=i;}
        }
        return new int[]{even , odd};
    }

    public String findKey(int[] arr, int key){
        System.out.print("\nEnter key: ");
        key = sc.nextInt();
        for (int i : arr) {
            if(key == i){
                return "Key Found";
            }
        }
        return "Key Not Found";
    }

    public int findKeyOccurence(int arr[], int key){
        System.out.print("\nEnter key: ");
        key = sc.nextInt();
        int count = 0;
        for (int i : arr) {
            if(key == i){
                count++;
            }
        }
        return count;
    }

    public int[] copyArray(int arr1[], int arr2[]){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }
        return arr2;
    }
    public int largest(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int smallest(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.print("Number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int arr1[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        Array1DEx A1 = new Array1DEx();
        System.out.println("Sum all : " + A1.sumOfAll(arr));
        System.out.println("Sum of odd: " + A1.sumOfEvenOdd(arr)[1] + " & even: " + A1.sumOfEvenOdd(arr)[0]);
        System.out.println(A1.findKey(arr, 0));
        System.out.println("Key occured : " + A1.findKeyOccurence(arr, 0) + " times.");
        System.out.println("Largest: " + A1.largest(arr));
        System.out.println("Smallest: " + A1.smallest(arr));
        System.out.println(Arrays.toString(A1.copyArray(arr, arr1)));
    }
}