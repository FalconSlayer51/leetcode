class ListNode {
  int val;
  ListNode? next;

  ListNode([this.val = 0, this.next]);
}

class Solution {
  ListNode? addTwoNumber(ListNode? l1, ListNode? l2) {
    ListNode dummy = ListNode(-1);
    ListNode prevNode = dummy;

    int sum = 0, carry = 0;

    while (l1 != null || l2 != null) {
      int digit1 = 0, digti2 = 0;
      if (l1 != null) {
        digit1 = l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        digti2 = l2.val;
        l2 = l2.next;
      }

      sum = digit1 + digti2 + carry;
      carry = (sum / 10).floor();
      prevNode.next = ListNode(sum % 10);
      prevNode = prevNode.next!;
    }

    if (carry != 0) {
      prevNode.next = ListNode(carry);
    }

    print(dummy.val);

    ListNode res = dummy.next!;
    return res;
  }
}

void main(List<String> args) {
  ListNode l11 = ListNode(4), l12 = ListNode(3);
  ListNode l1 = ListNode(2);
  l1.next = l11;
  l11.next = l12;

  ListNode l21 = ListNode(6), l22 = ListNode(4);
  ListNode l2 = ListNode(5);
  l1.next = l21;
  l11.next = l22;
  var s = Solution().addTwoNumber(l1, l2);

  print(s!.next!.val);
}
