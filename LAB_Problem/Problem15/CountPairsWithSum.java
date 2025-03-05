import java.util.HashMap;

public class CountPairsWithSum {
    public static int countPairs(int[] nums, int target) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int pairCount = 0;

        for (int num : nums) {
            int complement = target - num;

            if (freqMap.containsKey(complement)) {
                pairCount += freqMap.get(complement);
            }

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        return pairCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println(countPairs(nums, target));
    }
}   