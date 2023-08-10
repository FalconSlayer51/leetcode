List<int> productExceptSelf(List<int> nums) {
  var leftList = [1];
  var rightList = [1];
  var leftProduct = 1;
  var rightProduct = 1;
  for (var i = 0; i < nums.length - 1; i++) {
    leftProduct *= nums[i];
    leftList.add(leftProduct);
  }

  for (var i = nums.length - 1; i > 0; i--) {
    rightProduct *= nums[i];
    rightList.add(rightProduct);
  }
  rightList = rightList.reversed.toList();
  print(rightList);
  List<int> result = [];
  for (var i = 0; i < nums.length; i++) {
    result.add(rightList[i] * leftList[i]);
  }
  return result;
}

void main(List<String> args) {
  print(productExceptSelf([1, 2, 3, 4]));
}
