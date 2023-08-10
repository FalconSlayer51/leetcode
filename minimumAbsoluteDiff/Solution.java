package minimumAbsoluteDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < arr.length -1; i++) {
            minDiff = Math.min(minDiff,Math.abs(arr[i]-arr[i+1]));
        }

        for (int i = 0; i < arr.length -1; i++) {
            List<Integer> childList = new ArrayList<>();
            if(Math.abs(arr[i] - arr[i+1]) == minDiff){
                childList.add(Math.min(arr[i], arr[i+1]));
                
                childList.add(Math.max(arr[i], arr[i+1]));

                result.add(childList);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,2,1,3};
        System.out.println(minimumAbsDifference(nums));
    }
}
