public class removeDuplicates_026 {
    public static void main(String[] args) {
        removeDuplicates_026 sol = new removeDuplicates_026();
        int[] nums = {0, 0, 1, 1, 2, 2, 2, 3, 3, 4};
        int result = sol.removeDuplicates(nums);
        System.out.println("So luong phan tu duy nhat la: " + result);
        System.out.println("Mang sau khi xu ly: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i] ) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
