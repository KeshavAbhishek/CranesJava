import java.util.Vector;

/**
 * ==========================================================
 * Program Name: VectorData
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 27-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class VectorData {
    public Vector <Integer> data;
    VectorData(){
        data = new Vector<>();
    }

    public void addData(int n){
        data.add(n);
    }

    public void addDataIndex(int index, int n){
        data.add(index, n);
    }

    public void addAllData(Vector <Integer> x){
        data.addAll(x);
    }

    public void deleteData(int n){
        for(int i = 0; i < data.size(); i++){
            if(data.get(i)==n){
                System.out.println("\n\n" + data.get(i) + " is deleted.\n");
                data.removeElementAt(i);
            }
        }
    }

    public static void printAll(Vector <Integer> vect){
        for(int vec : vect){
            System.out.print(vec + " ");
        }
        /*
         final int[] sum = {0};
         vect.forEach(n->{
            System.out.print(n + " ");
            sum[0] += n;
        });
        
        System.out.println(sum[0]);
        */
    }
    public static void main(String[] args) {
        VectorData v1 = new VectorData();
        VectorData v2 = new VectorData();

        v1.addData(1);
        v1.addData(2);
        v1.addData(3);
        v1.addData(4);
        v1.addData(5);
        v1.addData(6);

        v1.addDataIndex(1,0);

        v2.addData(15);
        v2.addData(20);
        v2.addData(25);

        v2.addDataIndex(1,30);

        v1.addAllData(v2.data); // Add All
        printAll(v1.data);

        v1.deleteData(25);

        System.out.printf("1st element: %d", v1.data.firstElement());
        System.out.printf("\nLast element: %d", v1.data.lastElement());
        System.out.printf("\nElement at index %d: %d\n\n", 0, v1.data.get(0));

        printAll(v1.data);
    }
}