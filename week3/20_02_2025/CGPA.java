import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ==========================================================
 * Program Name: CGPA
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class CGPA {
    public static void readInput(ArrayList <Float> l1, ArrayList <Float> l2, ArrayList <Float> l3){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            // System.out.print("Enter marks of subejct 1 -> student " + (i+1) + ": ");
            float tempMark = sc.nextFloat();
            l1.add(tempMark);
        }
        for (int i = 0; i < 4; i++) {
            // System.out.print("Enter marks of subejct 2 -> student " + (i+1) + ": ");
            float tempMark = sc.nextFloat();
            l2.add(tempMark);
        }
        for (int i = 0; i < 4; i++) {
            // System.out.print("Enter marks of subejct 3 -> student " + (i+1) + ": ");
            float tempMark = sc.nextFloat();
            l3.add(tempMark);
        }
    }

    public static void calculateAvg(ArrayList <Float> l1, ArrayList <Float> l2, ArrayList <Float> l3,ArrayList <Float> avl){
        int k = 0;
        for (int i = 0; i < 4; i++) {
            avl.add(l1.get(k) + l2.get(k) + l3.get(k));
            k++;
        }
    }

    public static void more7_5(ArrayList <Float> l1, ArrayList <Float> l2, ArrayList <Float> l3){
        int temp1 = 0, temp2 = 0, temp3 = 0;
        for (int i = 0; i < l1.size(); i++) {
            if(l1.get(i)>7.5){
                temp1++;
            }
        }

        for (int i = 0; i < l2.size(); i++) {
            if(l2.get(i)>7.5){
                temp2++;
            }
        }

        for (int i = 0; i < l3.size(); i++) {
            if(l3.get(i)>7.5){
                temp3++;
            }
        }

        System.out.println("Subject 1: " + temp1 + " students.");
        System.out.println("Subject 2: " + temp2 + " students.");
        System.out.println("Subject 3: " + temp3 + " students.");
    }

    public static void maxMark(ArrayList <Float> l1, ArrayList <Float> l2, ArrayList <Float> l3){
        Collections.sort(l1, Collections.reverseOrder());
        Collections.sort(l2, Collections.reverseOrder());
        Collections.sort(l3, Collections.reverseOrder());

        System.out.println("Subject1: " + l1.get(0));
        System.out.println("Subject2: " + l2.get(0));
        System.out.println("Subject3: " + l3.get(0));
    }

    public static void minMark(ArrayList <Float> l1, ArrayList <Float> l2, ArrayList <Float> l3){
        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);

        System.out.println("Subject1: " + l1.get(0));
        System.out.println("Subject2: " + l2.get(0));
        System.out.println("Subject3: " + l3.get(0));
    }
    public static void main(String[] args) {
        // int countStudent = 4;
        // int countSubject = 3;
        ArrayList <Float> sub1 = new ArrayList<>();
        ArrayList <Float> sub2 = new ArrayList<>();
        ArrayList <Float> sub3 = new ArrayList<>();
        ArrayList <Float> avg = new ArrayList<>();

        readInput(sub1, sub2, sub3);

        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);

        calculateAvg(sub1, sub2, sub3, avg);

        System.out.println("Average: " + avg);

        System.out.println("\nMore than 7.5: ");
        more7_5(sub1, sub2, sub3);

        System.out.println("\nMax marks: ");
        maxMark(sub1, sub2, sub3);

        System.out.println("\nMin Marks: ");
        minMark(sub1, sub2, sub3);

    }
}