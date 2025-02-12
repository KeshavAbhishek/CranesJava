
/**
 * ==========================================================
 * Program Name: MergeSortedArray
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 11-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package LAB_Problem.Problem4;

import java.util.Scanner;
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array (m): ");
        int m = scanner.nextInt();
        int[] nums1 = new int[m + m];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array (n): ");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}