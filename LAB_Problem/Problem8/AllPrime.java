import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * ==========================================================
 * Program Name: AllPrime
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class AllPrime {
    public static boolean prime(int n){
        if(n==1){return true;}
        for(int i = 2; i < n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void allPrime(int arr[]){
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(prime(arr[i])){
                primeList.add(arr[i]);
            }
        }
        try{
            if(primeList.isEmpty()){
                throw new NullPointerException("No prime numbers.");
            }
            
            HashSet<Integer> withoutDuplicate = new HashSet<>(primeList);
            
            int data[] = new int[primeList.toArray().length];
            for(int i = 0; i < primeList.toArray().length; i++){
                data[i] = (int)primeList.toArray()[i];
            }

            System.out.println(Arrays.toString(data) + " With duplicates.");
            System.out.println(withoutDuplicate + " Without duplcaites.");
        }catch(NullPointerException e){System.out.println(e);}
    }

    public static void main(String[] args) {
        allPrime(new int[]{15,14,12,13});
    }
}