package ValidParenthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    private static boolean isValid(String s) {
        Map<Character, Character> lookUpMap = new HashMap<>();
        lookUpMap.put('{', '}');
        lookUpMap.put('(', ')');
        lookUpMap.put('[', ']');

        boolean isValid = false;

        Stack<Character> referStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (lookUpMap.containsKey(currentChar)) {
                referStack.push(currentChar);
                isValid = false;
            } else {
                if (referStack.isEmpty()) {
                    isValid = false;
                    break;
                } else {
                    if (lookUpMap.get(referStack.lastElement()).equals(currentChar)) {
                        isValid = true;
                        referStack.pop();
                    } else {
                        isValid = false;
                        referStack.pop();
                        break;
                    }
                }
            }
        }
        System.out.println(referStack);
        return (isValid && (referStack.isEmpty()));
    }

    public static void main(String[] args) {
        String s = "({{}})";
        System.out.println(isValid(s));
    }
}
