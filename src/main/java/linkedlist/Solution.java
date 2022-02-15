package linkedlist;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution implements Runnable {

  private final AtomicInteger num;

  public Solution(AtomicInteger num) {
    this.num = num;
  }

  @Override
  public void run() {
    while (num.get() <=100){
      System.out.println(num);
      num.incrementAndGet();
    }
  }

  public static void main(String[] args) {
    AtomicInteger num = new AtomicInteger();
    for (int i=0;i <3;i++){
      Thread thread = new Thread(new Solution(num));
      thread.start();
    }
  }


}
