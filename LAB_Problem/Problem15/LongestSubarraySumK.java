import java.util.*;

public class LongestSubarraySumK {
    public static int longestSubarrayWithSumK(int[] nums, int K) {
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, -1);

        int prefixSum = 0, maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (prefixSums.containsKey(prefixSum - K)) {
                maxLength = Math.max(maxLength, i - prefixSums.get(prefixSum - K));
            }

            if (!prefixSums.containsKey(prefixSum)) {
                prefixSums.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 4, 2};
        int K = 6;
        System.out.println(longestSubarrayWithSumK(nums, K));
    }
}