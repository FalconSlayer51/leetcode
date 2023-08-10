//All test cases passed

bool isAnagram(String s, String t) {
  if (s.length != t.length) {
    return false;
  }

  Map<String, int> charCount1 = {};
  Map<String, int> charCount2 = {};

  for (int i = 0; i < s.length; i++) {
    String char = s[i];
    charCount1[char] = !charCount1.containsKey(char)
        ? charCount1[char] ?? 0 + 1
        : charCount1[char]! + 1;
  }

  for (int i = 0; i < t.length; i++) {
    String char = t[i];
    charCount2[char] = !charCount2.containsKey(char)
        ? charCount2[char] ?? 0 + 1
        : charCount2[char]! + 1;
  }
  bool isAnagram = true;

  for (String key in charCount1.keys) {
    if (charCount1[key] != charCount2[key]) {
      isAnagram = false;
      break;
    }
  }
  // print(charCount1);
  // print(charCount2);
  return isAnagram;
}

void main(List<String> args) {
  String s = "aacc";
  String t = "ccac";

  print(isAnagram(s, t));
}
