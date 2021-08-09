package linkedlist;

public class Test {

  static class LinkedList{
    int value;
    LinkedList next;

    LinkedList(int value){
      this.value = value;
    }
  }


  public static boolean isCircle(LinkedList node){

    if (node==null) return false;

    LinkedList slow = node;
    LinkedList fast = node;

    while (fast !=null && fast.next!= null){
      slow = slow.next;
      fast = fast.next.next;

      if (slow==fast){
        return  true;
      }
    }
    return false;
  }

}
