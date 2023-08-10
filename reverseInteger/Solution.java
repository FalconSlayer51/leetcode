package reverseInteger;

public class Solution {

    public static int reverse(int x) {
        int temp = 0;
        int reverse = 0;
        while (x != 0) {
            temp = x % 10;
                if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE /10 && temp > 7)){
                    return 0;
                }
                if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE /10 && temp < -8)){
                    return 0;
                }
            reverse = reverse * 10 + temp;
            x = x / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int a = -120;
        System.out.println("reverse is " + reverse(a));
    }
}
