public class searchInsertPosition_035 {
    public static void main(String[] args) {
        searchInsertPosition_035 sol = new searchInsertPosition_035();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = sol.searchInsert(nums, target);
        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left)/2;

            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }
        return left;
    }
}
