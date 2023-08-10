package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookUpMap = new HashMap<>();
        int[] result = new int[] {};
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (lookUpMap.containsKey(nums[i])) {
                result = new int[] { i, lookUpMap.get(nums[i]) };
            } else {
                lookUpMap.put(res, i);
            }
        }
        System.out.println(lookUpMap);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        twoSum(nums, target);
    }
}
