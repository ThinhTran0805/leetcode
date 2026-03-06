package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_twoSum {

    public static void main(String[] args) {
        LC_twoSum sol = new LC_twoSum();
        int[] nums = {2, 4, 7, 9};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map =  new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("NO");
    }
}


