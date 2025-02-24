
/**
 * ==========================================================
 * Program Name: KthElement
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 24-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;
import java.util.Collections;

public class KthElement {
    public static void findKthElement(int arr[], int k) {
        if (k > arr.length || k <= 0) {
            System.out.println("Error");
            return;
        }
        ArrayList <Integer> data = new ArrayList<>();
        for(int e: arr){
            data.add(e);
        }
        Collections.sort(data, Collections.reverseOrder());
        System.out.println(data);
        System.out.println(k + "th largest: " + data.get(k-1));
    }

    public static void main(String[] args) {
        findKthElement(new int[] { 1,2,3,4,5,6,7,8 }, 4);
    }
}