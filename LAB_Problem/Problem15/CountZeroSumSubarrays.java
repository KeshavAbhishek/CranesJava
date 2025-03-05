import java.util.HashMap;

public class CountZeroSumSubarrays {
    public static int countZeroSumSubarrays(int[] nums) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0, count = 0;

        prefixSumMap.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            if (prefixSumMap.containsKey(prefixSum)) {
                count += prefixSumMap.get(prefixSum);
            }

            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        System.out.println(countZeroSumSubarrays(nums));
    }
}
