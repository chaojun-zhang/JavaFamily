package code.tree

import SumLeftLeave.sum

import scala.collection.mutable

object MaxDepth  {

  //递归
  def maxDepth(node:Node):Int = {
    if (node ==null) return 0
    1+ Math.max(maxDepth(node.left),maxDepth(node.right))

  }

  //迭代，采用层次遍历
  def maxDepth2(node:Node):Int = {
    if (node ==null) return 0
    val queue = new mutable.Queue[Node]
    queue.enqueue(node)
    var depth = 0
    while (queue.nonEmpty){
      val size = queue.size
      depth = depth + 1
      for (_<- 0 until size){
        val tmp = queue.dequeue()
        if (tmp.left!=null) queue.enqueue(tmp.left)
        if (tmp.right!=null) queue.enqueue(tmp.right)
      }
    }
    depth

  }


  def main(args: Array[String]): Unit = {
    println(MaxDepth.maxDepth(Node()))
    println(MaxDepth.maxDepth2(Node()))
  }



}
