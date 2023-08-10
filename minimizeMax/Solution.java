package minimizeMax;

import java.util.Arrays;

public class Solution {
    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = nums[n - 1] - nums[0] + 1;

        while (left < right) {
            int mid = (left + right) >>> 1;
            if (count(nums, mid) >= p) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static int count(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; ++ i) {
            if (Math.abs(nums[i + 1] - nums[i]) <= diff) {
                ++ count;
                ++ i;
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
