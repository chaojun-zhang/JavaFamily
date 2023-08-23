package code.queue

import scala.collection.mutable

class MyQueue {

  val inStack = new mutable.Stack[Int]
  val outStack = new mutable.Stack[Int]

  def push(a:Int): Unit ={
    inStack.push(a)
  }

  def pop():Option[Int] ={
    if (outStack.isEmpty){
      while (inStack.nonEmpty) {
        outStack.push(inStack.pop())
      }
    }
    if (outStack.nonEmpty) {
      Some(outStack.pop())
    }else {
      None
    }
  }

  def isEmpty() = {
    inStack.isEmpty && outStack.isEmpty
  }

}
object MyQueue{
  def apply(): MyQueue ={
     new MyQueue
  }

  def main(args: Array[String]): Unit = {
    val queue = MyQueue()

    queue.push(1)
    queue.push(2)
    println( queue.pop())
    println( queue.pop())
    println( queue.pop())
    queue.push(3)
    queue.push(4)
    println( queue.pop())
    println( queue.pop())
    println( queue.pop())
  }
}
