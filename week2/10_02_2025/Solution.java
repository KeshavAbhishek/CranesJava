import java.util.Arrays;

public class Solution {
    public int[] leftrotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int temp = nums[0];
            for (int j = 0; j < n-1; j++) {
                nums[j] = nums[j+1];
            }
            nums[n - 1] = temp;
        }
        return nums;
    }

    public int[] rightrotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int temp = nums[n-1];
            for (int j = n-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
        return nums;
    }

    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int arr2[] = {10, 20, 30, 40, 50};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(arr));
        System.out.println("LEFT SHIFT BY 2: " + Arrays.toString(solution.leftrotate(arr, 2)));
        System.out.println("RIGHT SHIFT BY 2: " + Arrays.toString(solution.rightrotate(arr2, 2)));
    }
}