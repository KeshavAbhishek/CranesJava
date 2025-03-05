
/**
 * ==========================================================
 * Program Name: PQueue
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 01-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqueueMinHeap = new PriorityQueue<>();
        PriorityQueue<Integer> pqueueMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        /*
         * Min Heap
         * pqueueMinHeap.add(100);
         * pqueueMinHeap.add(50);
         * pqueueMinHeap.add(60);
         * pqueueMinHeap.add(20);
         * 
         * System.out.println("Removed value: " + pqueueMinHeap.poll());
         * System.out.println(pqueue);
         */

        /*
         * 
         pqueueMaxHeap.add(50);
         pqueueMaxHeap.add(20);
         pqueueMaxHeap.add(60);
         pqueueMaxHeap.add(80);

         System.out.println(pqueueMaxHeap);
         */

        pqueueMaxHeap.clear();

        pqueueMaxHeap.offer(200);
        pqueueMaxHeap.offer(50);
        pqueueMaxHeap.offer(1000);
        pqueueMaxHeap.offer(70);
        pqueueMaxHeap.offer(80);

        System.out.println("Max-Heap: " + pqueueMaxHeap);

        pqueueMinHeap.add(200);
        pqueueMinHeap.add(50);
        pqueueMinHeap.add(1000);
        pqueueMinHeap.add(70);
        pqueueMinHeap.add(80);

        System.out.println("Min-Heap: " + pqueueMinHeap);
    }
}