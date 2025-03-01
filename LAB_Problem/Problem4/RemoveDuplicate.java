package LAB_Problem.Problem4;
import java.util.Arrays;
public class RemoveDuplicate {
    public static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) return new int[0];
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        int[] result = new int[i + 1];
        for (int k = 0; k <= i; k++) {
            result[k] = nums[k];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] newArray = removeDuplicates(nums);
        System.out.println(Arrays.toString(newArray));
    }
}