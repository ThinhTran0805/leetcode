import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        test sol = new test();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = sol.test(nums, target);
        System.out.println(result);
    }

    public int test(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle + 1;
            }
        }
        return left;
    }
}
