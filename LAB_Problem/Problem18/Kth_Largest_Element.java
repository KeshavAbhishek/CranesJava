
/**
 * ==========================================================
 * Program Name: Q3
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 03-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Collections;
import java.util.PriorityQueue;
public class Kth_Largest_Element {
    public static void main(String[] args) {
        PriorityQueue<Integer> data = new PriorityQueue<>(Collections.reverseOrder());

        data.offer(3);
        data.offer(2);
        data.offer(1);
        data.offer(5);
        data.offer(6);
        data.offer(4);

        int k = 2;
        int temp=0;
        while(k>0){
            temp = data.poll();
            k--;
        }
        System.out.println("Kth largest element: " + temp);
    }
}