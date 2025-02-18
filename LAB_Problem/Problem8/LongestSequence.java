import java.util.ArrayList;

/**
 * ==========================================================
 * Program Name: LongestSequence
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class LongestSequence {
    public static void longestIncreasingSequence(int arr[]){
        try{
            if(arr==null || arr.length==0){
                throw new NullPointerException("Null OR 0 length array is passed.");
            }
            ArrayList <Integer> longest = new ArrayList<>();
            longest.add(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>arr[i-1]){
                    longest.add(arr[i]);
                }
            }
            System.out.println(longest);
        }catch(NullPointerException e){System.out.println(e);}
    }
    public static void main(String[] args) {
        longestIncreasingSequence(new int[]{10,20,2,50,60,3,80,90,1});
    }
}