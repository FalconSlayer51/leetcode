package LongestConsSeqLen;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int longestSequneceLenght(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> exploredNums = new HashMap<Integer, Boolean>();

        for (int num : nums) {
            exploredNums.put(num, Boolean.FALSE);
        }

        for (int num : nums) {
            int currentLength = 1;

            int nextNum = num + 1;
            while (exploredNums.containsKey(nextNum) && exploredNums.get(nextNum) == false) {
                currentLength++;
                exploredNums.replace(nextNum, true);
                nextNum++;
            }

            int previousNum = num - 1;
            while (exploredNums.containsKey(previousNum) && exploredNums.get(previousNum) == false) {
                currentLength++;
                exploredNums.replace(previousNum, true);
                previousNum--;
            }

            longestLength = Math.max(currentLength, longestLength);

        }

        return longestLength;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        int len = longestSequneceLenght(nums);
        System.out.println(len);
    }
}
