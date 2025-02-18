/**
 * ==========================================================
 * Program Name: FindIntersection
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
public class FindIntersection {

    public static int[] findIntersection(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Input arrays cannot be null");
        }

        int[] temp = new int[Math.min(array1.length, array2.length)];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    boolean alreadyExists = false;
                    for (int k = 0; k < index; k++) {
                        if (temp[k] == array1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        temp[index++] = array1[i];
                    }
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 2, 3, 4 };
        int[] array2 = { 2, 4, 3 };

        try {
            int[] intersection = findIntersection(array1, array2);
            for (int num : intersection) {
                System.out.print(num + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}