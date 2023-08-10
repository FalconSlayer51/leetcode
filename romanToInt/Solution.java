package romanToInt;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> lookUpMap = new HashMap<>();
        lookUpMap.put('I', 1);
        lookUpMap.put('V', 5);
        lookUpMap.put('X', 10);
        lookUpMap.put('L', 50);
        lookUpMap.put('C', 100);
        lookUpMap.put('D', 500);
        lookUpMap.put('M', 1000);

        int prevValue = 0;
        for(int i = s.length() -1 ; i>=0;i--) {
            int currentValue = lookUpMap.get(s.charAt(i));
            if(currentValue >= prevValue){
                result += currentValue;
            }else{
                result -= currentValue;
            }

            prevValue = currentValue;
        }

        return result;

    }

    public static String intToRoman(int num) {
        Map<Integer, String> lookUpMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        lookUpMap.put(4, "IV");
        lookUpMap.put(2, "II");
        lookUpMap.put(3, "III");
        lookUpMap.put(1, "I");
        lookUpMap.put(5, "V");
        lookUpMap.put(9, "IX");
        lookUpMap.put(10, "X");
        lookUpMap.put(40, "XL");
        lookUpMap.put(50, "L");
        lookUpMap.put(90, "XC");
        lookUpMap.put(100, "C");
        lookUpMap.put(400, "CD");
        lookUpMap.put(500, "D");
        lookUpMap.put(900, "CM");
        lookUpMap.put(1000, "M");

        int[] keys = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,3,2,1};

        for(int key : keys) {
            if(num>=key){
                result.append(lookUpMap.get(key));
                num -= key;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("roman to integer: " + romanToInt2("III"));
        System.out.println(intToRoman(3));
    }

    public static int romanToInt2(String s) {
        int result =0;
        int prevValue =0;

         Map<Character, Integer> lookUpMap = new HashMap<>();
        lookUpMap.put('I', 1);
        lookUpMap.put('V', 5);
        lookUpMap.put('X', 10);
        lookUpMap.put('L', 50);
        lookUpMap.put('C', 100);
        lookUpMap.put('D', 500);
        lookUpMap.put('M', 1000);

        for(int i = s.length()-1;i>=0;i--) {
            int currentValue = lookUpMap.get(s.charAt(i));
            if(currentValue>= prevValue){
                result += currentValue;
            }else{
                result -= currentValue;
            }

            prevValue = currentValue;
        }

        return result ;
    }
}
