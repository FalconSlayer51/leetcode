List<int> topkFrequent(List<int> nums, int k) {
  Map<int, int> hashMap = {};
  for (var i in nums) {
    hashMap.containsKey(i) ? hashMap[i] = hashMap[i]! + 1 : hashMap[i] = 1;
  }
  var entries = hashMap.entries.toList();
  entries.sort(
    (a, b) => b.value.compareTo(a.value),
  );
  return entries.map((e) => e.key).take(k).toList();
}

void main(List<String> args) {
  List<int> nums = [1, 1, 1, 2, 2, 3];
  int k = 2;
  final stopwatch = Stopwatch()..start();
  print(topkFrequent(nums, k));
  print('doSomething() executed in ${stopwatch.elapsed}');
}
