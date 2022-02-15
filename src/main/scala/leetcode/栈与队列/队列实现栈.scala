package leetcode.栈与队列

import scala.collection.mutable

class MyStack {

  val queue1 = new mutable.Queue[Int]
  val queue2 = new mutable.Queue[Int]

  var pushToQueue1 = true

  def push(x:Int): Unit = {
    (queue1.isEmpty,queue2.isEmpty) match {
      case (true,true)=> queue1.enqueue(x)
      case (false,true)=> queue1.enqueue(x)
      case (true,false)=> queue2.enqueue(x)
      case _=>
    }
  }

  def pop(): Option[Int] = {
    (queue1.isEmpty,queue2.isEmpty) match {
      case (true,true)=> None
      case (false,true)=> {
        while (queue1.size>1){
          queue2.enqueue(queue1.dequeue())
        }
        Some(queue1.dequeue())
      }
      case (true,false)=> {
        while (queue2.size>1){
          queue1.enqueue(queue2.dequeue())
        }
        Some(queue2.dequeue())
      }
      case _=> None
    }
  }
}

object MyStack{
  def main(args: Array[String]): Unit = {
    val stack = new MyStack()
    stack.push(1)
    stack.push(2)
    println(stack.pop())
    println(stack.pop())
    stack.push(3)
    stack.push(4)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
  }
}
