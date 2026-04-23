public class removeElement_027 {
    public static void main(String[] args) {
        removeElement_027 sol = new removeElement_027();
        int[] nums = {0, 1, 2, 2, 3, 4, 0, 2};
        int val = 2;
        int k = sol.removeElement(nums, val);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

        /*//cach2: ep tu 2 dau
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n -1];
                n--;
            } else {
                i++;
            }
        }
        return n;*/
    }
}
