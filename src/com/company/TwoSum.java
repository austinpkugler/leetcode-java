package com.company;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> previous = new HashMap<Integer, Integer>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            Integer remainder = (Integer)(target - nums[i]);
            if (previous.containsKey(remainder)) {
                indices[0] = previous.get(remainder);
                indices[1] = i;
                return indices;
            }
            previous.put(nums[i], i);
        }
        return null;
    }
}
