/**
 * ==========================================================
 * Program Name: UnionIntersection
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 11-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package LAB_Problem.Problem4;

import java.util.Arrays;

public class UnionIntersection {

    public static int[] union(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        int k = 0;

        for (int num : nums1) {
            if (!contains(temp, k, num)) {
                temp[k++] = num;
            }
        }

        for (int num : nums2) {
            if (!contains(temp, k, num)) {
                temp[k++] = num;
            }
        }

        int[] result = Arrays.copyOf(temp, k);
        return result;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2 && !contains(temp, k, num1)) {
                    temp[k++] = num1;
                    break;
                }
            }
        }
        int[] result = Arrays.copyOf(temp, k);
        return result;
    }

    private static boolean contains(int[] arr, int length, int key) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4};
        int[] nums2 = {3, 4, 4, 5, 6};

        int[] unionArray = union(nums1, nums2);
        System.out.println("Union: " + Arrays.toString(unionArray));

        int[] intersectionArray = intersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(intersectionArray));
    }
}