// package week2.11-02-2025;

import java.util.Arrays;

public class Frequency {
    public static void freq(int arr[]){
        boolean touched[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(touched[i]==true){continue;}
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==arr[i]){
                    touched[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " is repeated for " + count);
        }
    }

    public static void main(String[] args) {
        freq(new int[]{1,2,3,3,3,4,4,4,5});
    }
}