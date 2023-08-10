import 'dart:math';

//sliding window algo

int lengthOfLongestSubstring(String s) {
  if (s.length == 0) {
    return 0;
  }
  if (s.length == 1) {
    return 1;
  }
  
  int maxLength = 0;
  Map<String, int> visitedCharectors = {};

  for (var right = 0, left = 0; right < s.length; right++) {
    var currentChar = s[right];
    if (visitedCharectors.containsKey(currentChar) &&
        visitedCharectors[currentChar]! >= left) {
      left = visitedCharectors[currentChar]! + 1;
    }

    maxLength = max(maxLength, right - left + 1);
    visitedCharectors[currentChar] = right;
  }

  return maxLength;
}

void main(List<String> args) {
  String s = 'abcabcbb';

  print(lengthOfLongestSubstring(s));
}
