List<String> topKFrequent(List<String> words, int k) {
  Map<String, int> frequnecyMap = {};
  for (String word in words) {
    frequnecyMap.containsKey(word)
        ? frequnecyMap[word] = frequnecyMap[word]! + 1
        : frequnecyMap[word] = 1;
  }

  print(frequnecyMap);

  var entries = frequnecyMap.entries.toList();
  entries.sort(
    (a, b) => a.key.compareTo(b.key),
  );
  entries.sort(
    (a, b) => b.value.compareTo(a.value),
  );

  return entries.map((e) => e.key).take(k).toList();
}

void main(List<String> args) {
  var words = ["i", "love", "leetcode", "i", "love", "coding"];
  int k = 3;

  print(topKFrequent(words, k));
}
