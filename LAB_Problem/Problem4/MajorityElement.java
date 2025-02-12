package LAB_Problem.Problem4;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{1,2,2,2,3,3,3,3,3,3,3}));
    }
}