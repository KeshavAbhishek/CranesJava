
/**
 * ==========================================================
 * Program Name: Pair
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
public class Pair {
    public static int[] findPairWithSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4};

        int target = 7;
        int[] pairWithSum = findPairWithSum(nums1, target);
        if (pairWithSum.length > 0) {
            System.out.println("Pair with sum " + target + ": " + Arrays.toString(pairWithSum));
        } else {
            System.out.println("No pair with sum " + target + " found.");
        }
    }
}