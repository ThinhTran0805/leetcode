public class containerWithMostWater_11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int hL = height[left];
            int hR = height[right];
            int width = right - left;

            if (hL < hR) {
                int area = width * hL;
                if (area > maxWater) {
                    maxWater = area;
                }
                while (left < right && height[left] <= hL) {
                    left++;
                }
            } else {
                int area = width * hR;
                if (area > maxWater) {
                    maxWater = area;
                }
                while (left < right && height[right] <= hR) {
                    right--;
                }
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};

        System.out.println("Test 1: " + maxArea(height1)); // 49
        System.out.println("Test 2: " + maxArea(height2)); // 1
    }
}