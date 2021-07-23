package linkedlist;

public class Node {
  Node next;
  char val;

  public Node(char val) {
    this.val = val;
  }


  public Node reverse() {
    Node current = this;
    Node previous = null;
    Node next;
    while (current != null) {
      next = current.next;
      current.next = previous;

      previous = current;
      current = next;
    }
    return previous;
  }


  public boolean isEqualTo(Node node) {
    Node current = this;
    while (current != null) {
      if (current.val != node.val) {
        return false;
      }
      current = current.next;
      node = node.next;
      if (current == null && node != null) {
        return false;
      }
      if (current != null && node == null) {
        return false;
      }
    }
    return false;
  }

  public boolean isEchoNode() {
    Node node = this;
    if (node.next == null) {
      return true;
    }
    Node slow = node;
    Node fast = node;

    Node prev = null;

    Node mid = null;

    while (fast != null && fast.next != null) {

      fast = fast.next.next;
      Node next = slow.next;
      slow.next = prev;
      prev = slow;
      slow = next;

      //如果fast为空说明链表个数为奇数
      if (fast == null) {
        mid = prev;
      } else { //否则为偶数
        mid = slow;
      }
    }

    assert mid != null;
    return mid.isEqualTo(slow);
  }


}
